package iutsd;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;


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
	File ImageFond = new File(getClass().getResource("/images/pnd1.jpg").getPath());
	
	/**
	 *  Le panneau de jeu est compose d'un Clavier, d'un Pendu et d'un panel affichant le lettre du mot.
	 */
	public GamePanel(){
		
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
	
	
	
	public void paintComponent(Graphics g){
		BufferedImage img;
		this.setOpaque(false);
		try {
			img=ImageIO.read(ImageFond);
			g.drawImage(img,0,0,null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
