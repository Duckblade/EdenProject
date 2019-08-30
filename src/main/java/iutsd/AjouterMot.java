package iutsd;

import javax.swing.*;
import java.awt.event.*;


/**
 * Classe permettant de saisir manuellement un mot � deviner
 * 
 * @author Mehdi Littame
 * @author Maxime Brimaud
 * @author David Hoeffel
 *
 */
public class AjouterMot extends JFrame 
{
	
	private static final long serialVersionUID = 1L;
	JTextField text  ;
	
	public AjouterMot() 
	{
		super("Entrez votre mot");
		WindowListener l = new WindowAdapter() 
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0) ;
			}
	
		};
		
		addWindowListener(l);
		ImageIcon img = new ImageIcon("tips.gif");
		JButton bouton = new JButton("Ajouter    ",img);
		JPanel panneau = new JPanel();
		panneau.add(bouton);
		
		text = new JTextField(33);
		text.setSize(200,100);
		panneau.add(text);
		
		setContentPane(panneau);
		setSize(200,100);		
		setVisible(true);	
		
	}
			
		public static void main(String [] args)
		{

			JFrame frame = new AjouterMot();
			frame.pack();				
			//String txt = text.getText();
		}
}