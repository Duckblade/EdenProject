package iutsd;

import org.apache.commons.io.FileUtils;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.*;


/**
 * Classe du panneau de jeu 
 * @author Mehdi Littame
 * @author Maxime Brimaud
 * @author David Hoeffel
 *
 */
public class GamePanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	FinPartie fp;
	Word motToFind;
	Clavier clvr;
	//File imageFond;
	//Instance de l'image de fond pour l'ecran titre
	static ImageIcon fond = new ImageIcon(Main.class.getResource("/images/pnd1.jpg"));
	static JLabel fondLabel = new JLabel(fond);

	/**
	 *  Le panneau de jeu est compose d'un Clavier, d'un Pendu et d'un panel affichant le lettre du mot.
	 */
	public GamePanel(){
		//JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
		//JFrame frame = (JFrame) SwingUtilities.windowForComponent(this);
		//JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
		//JFrame frame = (JFrame)SwingUtilities.getRoot(this);
		//
		    //imageFond = new File(getClass().getResource("/images/pnd1.jpg").toExternalForm());


		this.setOpaque(false);

			this.setLayout(new BorderLayout());
		    Word motToFind=new Word();
		    Pendu pnd = new Pendu();




		    clvr=new Clavier();
		  
		    clvr.setFocusable(true);
		    clvr.requestFocusInWindow();

		    this.add(clvr,BorderLayout.SOUTH);
		    this.add(motToFind,BorderLayout.WEST);
		    this.add(pnd,BorderLayout.EAST);    
	}


	
	
	

	
	
	/**
	 * Getteur du clavier
	 * @return clvr Le clavier
	 */
	public Clavier getClavier(){
		return clvr;
	}
	
	
	/**
	 * Getteur du panneau de jeu
	 * @return this Le panneau de jeu
	 */
	public GamePanel getGamePan(){
		return this;
	}
	
	
	/**
	 *Getteur du mot a trouver
	 * @return motToFind Le mot a trouver
	 */
	public Word getWord(){
		return motToFind;
	}
	
}
