package iutsd;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 * Classe representant le mot a deviner et definissant si chaque lettre 
 * de l'alphabet est contenue dans le mot ou non.
 * 
 * @author Mehdi Littame
 * @author Maxime Brimaud
 * @author David Hoeffel
 *
 */
public class Word extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static char[] arrayWord;
	static char[] smallArrayWord;
	char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r',
						's','t','u','v','w','x','y','z'/*,'�','�','�','�','�','�'**/};
	static JLabel tabLabels[];
	static String word="bbcdaefb";
	static JLabel reponseLabel;
	
	private GridBagConstraints cr ;
	static boolean[] lettreDansMot;
	public String getWord(){
		return word;
	}
	
	public Word()
	{
		

		this.setOpaque(false);
		this.setPreferredSize(new Dimension (700,400));
		ExtractLine ex = new ExtractLine();
		System.out.println(ExtractLine.listeMots.isEmpty());
		word=ExtractLine.listeMots.get((int)(Math.random()*168264));
		
		this.setLayout(new GridBagLayout());
		cr = new GridBagConstraints();
		Font f1 = new Font("Serif", Font.PLAIN, 50); 
		Font f2 = new Font("Serif", Font.BOLD, 25); 
		
		
		arrayWord=word.toCharArray();
		
		smallArrayWord=new char[arrayWord.length-2];
		for(int i=0;i<smallArrayWord.length;i++){
			smallArrayWord[i]=arrayWord[i+1];
		}
		
		tabLabels=new JLabel[arrayWord.length];
		
		for(int j=0;j<arrayWord.length;j++)
		{
			if(j==0||j==arrayWord.length-1)
			{
				tabLabels[j]=new JLabel(arrayWord[j]+"");
				tabLabels[j].setFont(f1);		
			}
			else
			{
				tabLabels[j]=new JLabel("_");
				tabLabels[j].setFont(f1); 
			}
			
			cr.insets=new Insets(10,5,10,4);
			this.add(tabLabels[j],cr);
		
		}
		
		
		reponseLabel=new JLabel("Le mot � trouver �tait : "+word);
		reponseLabel.setVisible(false);
		cr.gridwidth = GridBagConstraints.REMAINDER;
		reponseLabel.setFont(f2);
		reponseLabel.setForeground(Color.RED);
		cr.gridx=1;
		//this.add(reponseLabel,cr);
		
								
		lettreDansMot=new boolean[26];
		//int nbwo = word.length() - 2;
		//boolean estLa=false;
		
		for(int i=0;i<26;i++)
		{
		 	   for(int j=0;j<word.length();j++)
		   	   {
		   		   if(alphabet[i]==arrayWord[j])
		   		   {
		   			   //estLa=true;
		   			   lettreDansMot[i]=true;
		   		   }
		   		   else if (lettreDansMot[i]!=true)
		   		   {
		   			   lettreDansMot[i]=false;
		   		   }
		   	   }
		}
		
		
			    
	    for(int j=0;j<26;j++)
	    {
	   	   System.out.println(lettreDansMot[j]);
	    }
			       
	}
	

}
