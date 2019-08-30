package iutsd;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.*;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/** 
 * Classe principale du jeu. Gestion de l'ecran de depart, des sons, et de la fenetre de jeu.
 * @author Mehdi Littame
 * @author Maxime Brimaud
 * @author David Hoeffel
 * 
 * */	

	public class Main extends JFrame implements ActionListener, MouseListener
	{
		/** Serial version*/	
		private static final long serialVersionUID = 1L;
		
		/*Boutons du menu d'accueil "Jeu solo", "Partie contre le CPU", "Partie contre un joueur".
		 * Les deux derniers boutons ont ete remplaces par les boutons "Serveur" et "Client" pour le moment,
		 * afin de mener des tests reseau.*/	
		JButton btn1_accueil,btn2_accueil,btn3_accueil;
		
		//Instance de l'image de fond pour l'ecran titre
		static ImageIcon fond = new ImageIcon("src/main/resources/images/bg.jpg");
		static JLabel fondLabel = new JLabel(fond);
		
		//Declaration du cardLayout utilise pour la transition entre les differentes fenetres de jeu
		static CardLayout cardL ;
		
		//Declaration du panel de l'accueil
	    JPanel accueil ;
	    
	   //Panel general
	    static JPanel mainPan ;
	    
	    //Panel de jeu
	    static GamePanel gamePan ;
	    
	    //Panel qui utilisera le cardLayout
		public static JPanel cards;
		
		//La fenetre de jeu
		static JFrame frame;
		
		//Declaration de la classe qui permet de creer l'hote lors d'une partie a deux
		public static SocketServer sockServ;
		
		//Declaration de la fenetre de demande d'IP de l'hote au client
		public FrameIpHote frameDemandeIp;

		//Panel de fin de partie
		public static FinPartie finPan;
		
		//Contrainte pour le positionnement des boutons
	    private GridBagConstraints cr ;
	    
	    //Tableau qui stocke les cris du pendu
		static List<String> banqueCris;

	    
	
	  public Main() 
	  {
  
		  
		  
	     super("Projet Eden");
	     
	    banqueCris=new ArrayList<String>();
	 	banqueCris.add("/music/incapacitatedinjury09.wav");
	    banqueCris.add("/music/incapacitatedinjury10.wav");
	    banqueCris.add("/music/incapacitatedinjury11.wav");
	    banqueCris.add("/music/incapacitatedinjury06.wav");
	    banqueCris.add("/music/deathscream05.wav");
	    banqueCris.add("/music/exclamation01.wav");

		
	     playSound("/music/trololo.wav");
	      WindowListener li = new WindowAdapter() 
	      {
	         public void windowClosing(WindowEvent e)
	         {
	            System.exit(0);
	         }
	      };
	      
	      addWindowListener(li);

	     
	    cardL= new CardLayout();
		cards = new JPanel(cardL);
	    cr = new GridBagConstraints();
	    mainPan = new JPanel(new BorderLayout());
	    gamePan = new GamePanel();
        accueil = new JPanel(new GridBagLayout());
        mainPan.setOpaque(false);
       accueil.setOpaque(false);
        
        this.setBackground(Color.BLACK);
        
       
        
       
	   
	   
	    
	    finPan=new FinPartie();
	    Font f1 = new Font("Serif", Font.BOLD, 18); 
	    Font f2 = new Font("Serif", Font.BOLD, 18); 
	    Font f3 = new Font("Serif", Font.BOLD, 18); 
	    Dimension taille_btns = new Dimension(300,30);
	      btn1_accueil=new JButton("Partie Solo");
	      btn1_accueil.setFont(f1);
	      btn1_accueil.setBackground(Color.LIGHT_GRAY);	      
	      btn1_accueil.setPreferredSize(taille_btns);
	      btn2_accueil=new JButton("Serveur");
	      btn2_accueil.setFont(f2);
	      btn2_accueil.setBackground(Color.LIGHT_GRAY);
	      btn2_accueil.setPreferredSize(taille_btns);
	      btn3_accueil=new JButton("Client");
	      btn3_accueil.setFont(f3);
	      btn3_accueil.setBackground(Color.LIGHT_GRAY);
	      btn3_accueil.setPreferredSize(taille_btns);
	      btn1_accueil.addActionListener(this);
	      btn1_accueil.addMouseListener(this);
	      btn2_accueil.addActionListener(this);
	      btn2_accueil.addMouseListener(this);
	      btn3_accueil.addActionListener(this);
	      btn3_accueil.addMouseListener(this);
	    
	      cr.gridy=0;
	      cr.insets=new Insets(40,0,0,0);
	      cr.gridy=1;
	      
	      accueil.add(btn1_accueil,cr);
	      cr.insets=new Insets(20,0,0,0);
	      cr.gridy=2;
	      accueil.add(btn2_accueil,cr);
	      cr.gridy=3;
	      cr.insets=new Insets(20,0,0,0);
	      accueil.add(btn3_accueil,cr);
	      cards.add(accueil,"accueil");

	     
	      cards.add(finPan,"victory");
	      cards.add(gamePan,"jeu");
	      
	      
	      //snake = new Snake();
	      //snakePan=new JPanel(new BorderLayout());
	      //snakePan.add(snake,BorderLayout.CENTER);
	      //snake.setFocusable(true);
	      //snake.requestFocusInWindow();
	      //snakePan.setFocusable(true);
	      //snakePan.requestFocusInWindow();
	      // transferFocus();
	      //snakePan.setVisible(true);

	       mainPan.add(cards);

	     setContentPane(mainPan);
	     
	      
	     pack();
	     setVisible(true);
	   
	     cards.setOpaque(false);
	    

		 
	   }

	  
	  
	  
	/**
	 * Methode de lecture d'un son au format WAVE
	 * @param soundFile le nom du fichier et son chemin 
	 */
	public static synchronized void playSound(final String soundFile) {
		    new Thread(new Runnable() { 
		    public void run() {
		        try {
		          Clip clip = AudioSystem.getClip();
		          AudioInputStream inputStream = AudioSystem.getAudioInputStream(Main.class.getResourceAsStream(soundFile));
		          clip.open(inputStream);
		          clip.start(); 
		        } catch (Exception e) {
		          System.err.println(e.getMessage());
		        }
		      }
		    }).start();
		  }

	  
	  

	  
	  
	/**
	 * Methode principale avec instanciation de la classe Main
	 * @param args
	 */
	public static void main(String [] args)
	  {
	     
	     Image ii = Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/images/icon.png"));
	     
	      frame = new Main();
	      frame.setIconImage(ii);
	      frame.add(fondLabel);
	      frame.setSize(1200,620);
	      frame.setResizable(false);
	  }
	  
	

	public void actionPerformed(ActionEvent ev)
	{
		Object source=ev.getSource();
		playSound("/music/sonAppuiBouton.wav");
	
		if(source==btn1_accueil)
		{
			cardL.last(cards);
		}
		
		if(source==btn2_accueil)
		{
			


			new Thread(new Runnable() { 
			    public void run() {
			        try {
			        	sockServ = new SocketServer();
			        	SocketServer.main(null);
			        	sockServ.listenSocket();
			        } catch (Exception e) {
			          System.err.println(e.getMessage());
			        }
			      }
			    }).start();
			

		}
		
		if(source==btn3_accueil)
		{
			new Thread(new Runnable() { 
			    public void run() {
			        try {
			        	frameDemandeIp = new FrameIpHote();
			        	FrameIpHote.main(null);
			        	
			        } catch (Exception e) {
			          System.err.println(e.getMessage());
			        }
			      }
			    }).start();
	
		}
					
	}


		public void mouseClicked(MouseEvent e) {

		}

		public void mousePressed(MouseEvent e) {

		}

		public void mouseReleased(MouseEvent e) {

		}

		/**
	 * Permet de lancer un son a chaque survol de bouton
	 */
	public void mouseEntered(MouseEvent arg0) {
		playSound("/music/beep.wav");
		
	}

		public void mouseExited(MouseEvent e) {

		}


	}


