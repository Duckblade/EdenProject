package iutsd;

import java.awt.Color;
	import java.awt.BorderLayout;
	import java.awt.event.*;
	import javax.swing.*;

	/**
	 * Classe permettant au client d'entrer l'adresse Ip de l'hote
	 * 
	 * @author Mehdi Littame
	 * @author Maxime Brimaud
	 * @author David Hoeffel
	 *
	 */
	class FrameIpHote extends JFrame implements ActionListener 
	{

		private static final long serialVersionUID = 1L;
	JLabel clicked, ipHote;
	   JButton button0;
	   JPanel panel0;
	   public static JTextField txtIpHote;
	   //Socket socket = null;
	   //PrintWriter out = null;
	   //BufferedReader in = null;
	   SocketClient socketClient;

	   FrameIpHote()
	   { 
		 //Begin Constructor
		   ipHote = new JLabel("Entrez l'adresse IP de l'h�te =D :");
		   txtIpHote = new JTextField(20);
		   button0 = new JButton("Click Me");
		   button0.addActionListener(this);
		   
	     panel0 = new JPanel();
	     panel0.setLayout(new BorderLayout());
	     panel0.setBackground(Color.white);
	     getContentPane().add(panel0);
	     panel0.add("North", ipHote);
	     panel0.add("Center", txtIpHote);
	     panel0.add("South", button0);
	
	   } //End Constructor
	   
	   
		public String getIpHote(){
			String ipHote = txtIpHote.getText();
			return ipHote;
		}
		

	  public void actionPerformed(ActionEvent event)
	  {
	     Object source = event.getSource();

	     if(source == button0)
	     {
	    	 String texte = txtIpHote.getText();
	    	 System.out.println(texte);
	    	 socketClient = new SocketClient(texte);
	    	 socketClient.setTitle("Client Program");
		        WindowListener l = new WindowAdapter() 
		        {
		                public void windowClosing(WindowEvent e) 
		                {
		                        System.exit(0);
		                }
		        };

		        socketClient.addWindowListener(l);
		        socketClient.pack();
		        socketClient.setVisible(true);
		        socketClient.listenSocket();
	     }
	  }
	  



	   public static void main(String[] args)
	   {
	        FrameIpHote frame = new FrameIpHote();
	        frame.setTitle("Demande d'IP");
	        WindowListener l = new WindowAdapter() 
	        {
	                public void windowClosing(WindowEvent e) 
	                {
	                        System.exit(0);
	                }
	        };

	        frame.addWindowListener(l);
	        frame.pack();
	        frame.setVisible(true);
	        //frame.listenSocket();
	  }
	}


