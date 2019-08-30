package iutsd;

import java.awt.Color;
	import java.awt.BorderLayout;
	import java.awt.event.*;
	import javax.swing.*;

	import java.io.*;
	import java.net.*;

	/**
	 * Classe permettant de connecter un Client � un serveur sur le m�me port.
	 * 
	 * @author Mehdi Littame
	 * @author Maxime Brimaud
	 * @author David Hoeffel
	 *
	 */
	class SocketClient extends JFrame implements ActionListener 
	{

	   /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
	JLabel text, clicked;
	   JButton button, button0;
	   JPanel panel, panel0;
	   JTextField textField, txtIpHote;
	   Socket socket = null;
	   PrintWriter out = null;
	   BufferedReader in = null;
	   String ipHoteS = "";

	   SocketClient(String ipHote)
	   { 
		 //Begin Constructor
		   ipHoteS = ipHote;
	     text = new JLabel("Texte � envoyer : ");
	     textField = new JTextField(20);
	     button = new JButton("Click Me");
	     button.addActionListener(this);
	     
	     panel = new JPanel();
	     panel.setLayout(new BorderLayout());
	     panel.setBackground(Color.white);
	     getContentPane().add(panel);
	     panel.add("North", text);
	     panel.add("Center", textField);
	     panel.add("South", button);
	   } //End Constructor

	  public void actionPerformed(ActionEvent event)
	  {
	     Object source = event.getSource();

	     if(source == button)
	     {
	    	  //Send data over socket
	          String text = textField.getText();
	          out.println(text);
	          textField.setText(new String(""));
	          //Receive text from server
	       try
	       {
	    	  String line = in.readLine();
	          System.out.println("Text received :" + line);
	       }
	       catch (IOException e)
	       {
	    	 System.out.println("Read failed");
	       	 System.exit(1);
	       }
	     }
	  }
	  
	  public void listenSocket()
	  {
		 //Create socket connection
	     try
	     {
	       InetAddress Ip =InetAddress.getLocalHost();
	       System.out.println(Ip.getHostAddress());
	       socket = new Socket(this.ipHoteS, 4444);
	       out = new PrintWriter(socket.getOutputStream(), true);
	       in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	     } 
	     catch (UnknownHostException e) 
	     {
	       System.out.println("Unknown host: kq6py.eng");
	       System.exit(1);
	     } 
	     catch  (IOException e) 
	     {
	       System.out.println("No I/O");
	       System.exit(1);
	     }
	  }
	  
	  
	  /*public static void sendVictorySignal(){
		  String signalVictoire = "victoire de P2";
          out.println(signalVictoire);
          //textField.setText(new String(""));
          //Receive text from server
    
    	  String line = in.readLine();
          System.out.println("Text received :" + line);
       
     
	  }*/

	   public static void main(String[] args)
	   {
		    FrameIpHote panelIpHote = new FrameIpHote();
	        SocketClient frame = new SocketClient(panelIpHote.getIpHote());
	        frame.setTitle("Client Program");
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
	        frame.listenSocket();
	  }
	}


