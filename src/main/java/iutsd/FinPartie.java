package iutsd;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;


/**
 * Classe du panel qui apparait en fin de partie
 * @author Mehdi Littame
 * @author Maxime Brimaud
 * @author David Hoeffel
 */
public class FinPartie extends JPanel implements ActionListener, MouseListener{

	private static final long serialVersionUID = 1L;
	JLabel victoireLabel;
	JButton retourMenu, rejouer,quitter;
	Font fnt = new Font("Serif", Font.PLAIN, 25);
	GridBagConstraints cr;
	List<String> criVictoire;
	
	
	
	/**
	 * Le mot a trouver est affiche sur le panel de fin de partie.
	 * Des boutons apparaisent dans le panel pour rejouer, retourner au menu, ou quitter le jeu
	 */
	public FinPartie(){
		this.setPreferredSize(new Dimension (700,400));
		cr = new GridBagConstraints();
		this.setLayout(new GridBagLayout());
		this.setOpaque(false);
		
		victoireLabel=new JLabel("Dommage! Le mot à trouver était \""+Word.word+"\"!");
		victoireLabel.setForeground(Color.RED);
		
		if(Clavier.vicBoo==true){
			repaint();
			int sonAleatoire=(int)(Math.random()*4);
			criVictoire=new ArrayList<String>();
			criVictoire.add("/music/hurrah10.wav");
			criVictoire.add("/music/hurrah12.wav");
			criVictoire.add("/music/hurrah14.wav");
			criVictoire.add("/music/hurrah15.wav");
			Main.playSound(criVictoire.get(sonAleatoire));
			//SocketClient.sendVictorySignal();
			victoireLabel.setText("Félicitations! Vous avez gagné en trouvant le mot \""+Word.word+"\" !");
			victoireLabel.setForeground(Color.green);
			Clavier.vicBoo=false;
		}
		
		
		rejouer = new JButton("Rejouer");
		rejouer.addActionListener(this);
		rejouer.addMouseListener(this);
		retourMenu = new JButton("Retour au menu");
		retourMenu.addActionListener(this);
		retourMenu.addMouseListener(this);
		quitter = new JButton("Quitter le jeu");
		quitter.addActionListener(this);
		quitter.addMouseListener(this);
		
		victoireLabel.setFont(fnt);
		
		victoireLabel.setVisible(true);
		cr.gridx=0;
		cr.gridy=0;
		cr.gridwidth=GridBagConstraints.REMAINDER;
		this.add(victoireLabel,cr);
		cr.gridwidth=1;
		cr.gridy=1;
		cr.gridx=0;
		cr.insets=new Insets(10,50,10,10);
		rejouer.setBackground(Color.LIGHT_GRAY);
		this.add(rejouer,cr);
		cr.gridx=1;
		retourMenu.setBackground(Color.LIGHT_GRAY);
		this.add(retourMenu,cr);
		cr.gridx=2;
		quitter.setBackground(Color.LIGHT_GRAY);
		this.add(quitter,cr);
		
		
	}

	
	public void actionPerformed(ActionEvent e){
		Object source=e.getSource();	 
		Main.playSound("/music/sonAppuiBouton.wav");
		
		if(source==rejouer)
		{
			
			Main.gamePan = new GamePanel();
			Main.cards.add(Main.gamePan,"jeu");
			Main.cardL.last(Main.cards);	    
		}
		
		if(source==retourMenu)
		{
			Main.gamePan = new GamePanel();
			Main.cards.add(Main.gamePan,"jeu");
			Main.cardL.first(Main.cards);
			Main.frame.remove(Main.fondLabel2);
			Main.frame.add(Main.fondLabel);
		    
		}
		
		if(source==quitter)
		{
			((JFrame)(this.getTopLevelAncestor())).dispose() ; 
		    
		}
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		Main.playSound("/music/beep.wav");
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	
	
}
