package iutsd;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 * Classe representant le pendu et ses differents stades
 * @author Mehdi Littame
 * @author Maxime Brimaud
 * @author David Hoeffel
 *
 */
public class Pendu extends JPanel
{

	private static final long serialVersionUID = 1L;
	ImageIcon penduImg0,penduImg1,penduImg2,penduImg3,penduImg4,penduImg5,penduImg6,penduImg7,penduImg8,penduImg9;
	static ArrayList<ImageIcon> pendusList = new ArrayList<ImageIcon>();
	static JLabel pendu;
	static JPanel snake;
	static int stadePendu;
	//ImageIcon tabPendus[];
	static boolean aJoueAuSnake=false;

	
	
	/**
	 * Un pendu a dix etats 
	 */
	public Pendu()
	{
			stadePendu=0;
			this.setOpaque(false);
			repaint();
		this.setPreferredSize(new Dimension (500,340));
		String resourcesImagesPath = "src/main/resources/images/";

		 penduImg0 = new ImageIcon(resourcesImagesPath.concat("/pendu0.png"));
	      penduImg1 = new ImageIcon(resourcesImagesPath.concat("pendu1.png"));
	      penduImg2 = new ImageIcon(resourcesImagesPath.concat("pendu2.png"));
	      penduImg3 = new ImageIcon(resourcesImagesPath.concat("pendu3.png"));
	      penduImg4 = new ImageIcon(resourcesImagesPath.concat("pendu4.png"));
	      penduImg5 = new ImageIcon(resourcesImagesPath.concat("pendu5.png"));
	      penduImg6 = new ImageIcon(resourcesImagesPath.concat("pendu6.png"));
	      penduImg7 = new ImageIcon(resourcesImagesPath.concat("pendu7.png"));
	      penduImg8 = new ImageIcon(resourcesImagesPath.concat("pendu8.png"));
	      penduImg9 = new ImageIcon(resourcesImagesPath.concat("pendu9.png"));
	      
	      pendusList.add(penduImg0);
	      pendusList.add(penduImg1);
	      pendusList.add(penduImg2);
	      pendusList.add(penduImg3);
	      pendusList.add(penduImg4);
	      pendusList.add(penduImg5);
	      pendusList.add(penduImg6);
	      pendusList.add(penduImg7);
	      pendusList.add(penduImg8);
	      pendusList.add(penduImg9);
	      
	      repaint();
	      
	      pendu = new JLabel();
	      pendu.setIcon(pendusList.get(stadePendu));
	      
	      this.add(pendu);
	      
	  
	}
	
	
	
	/**
	 * Le stade du pendu est incremente a chaque fois que la lettre choisie est fausse
	 */
	public static void penduUp()
	{
		int sonAleatoire=(int)(Math.random()*5);
		System.out.println("VAL AL: "+sonAleatoire);
		
		  if(stadePendu<8)
		  {
			  Main.playSound(Main.banqueCris[sonAleatoire]);
			  stadePendu++;
		  }
		  else if(stadePendu==8 && aJoueAuSnake==false)
		  {
			  Main.playSound(Main.banqueCris[5]);
			  Word.reponseLabel.setVisible(true);
			  System.out.println("Vous �tes morts ! Snake game activated !") ;
			  //snake = new Snake();
			  
			  FinPartie fp=new FinPartie();
				Main.gamePan = new GamePanel();	
				for(int i=0;i<26;i++){
					Clavier.tabButtons[i].setEnabled(false);
				}
				
				stadePendu=9;
				//Main.gamePan.motToFind.setVisible(false);
				Main.gamePan.add(fp,BorderLayout.WEST);
				Main.cards.add(Main.gamePan,"jeu");
				Main.cardL.last(Main.cards);
				//aJoueAuSnake=true ;
		  }
		  
		  else if(stadePendu==8 && aJoueAuSnake==true) 
		  {
			  System.out.println("OVERKILLL") ;
			  
		  }
		  //else if (Main.gamePan.getClavier().victoire>=Main.gamePan.getWord().getWord().length()){
			//  Word.reponseLabel.setVisible(true);
		  //}
		
	  }
	
}
