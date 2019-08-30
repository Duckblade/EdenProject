package iutsd;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;


/**
 * Classe representant le Clavier
 * 
 * @author Mehdi Littame
 * @author Maxime Brimaud
 * @author David Hoeffel
 *
 */
public class Clavier extends JPanel implements ActionListener{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static int victoire=0;
	//JFrame toto;
	static boolean vicBoo=false;
	static JButton tabButtons[];
	static JButton a;
	JButton b;
	JButton z;
	JButton e;
	JButton r;
	JButton t;
	JButton y;
	JButton c;
	JButton d;
	JButton f;
	JButton g;
	JButton h;
	JButton i;
	JButton j;
	JButton k;
	JButton l;
	JButton m;
	JButton n;
	JButton o;
	JButton p;
	JButton q;
	JButton s;
	JButton u;
	JButton v;
	JButton w;
	JButton x;
	ImageIcon aImg,bImg,zImg,rImg,tImg,yImg,eImg,cImg,dImg,fImg,gImg,hImg,iImg,jImg,kImg,lImg,mImg,nImg,oImg,pImg,qImg,uImg,sImg,vImg,wImg,xImg;
	
	
	
	
	/**
	 * Un clavier est compose d'un nombre de boutons egal au nombre de lettres de l'alphabet.
	 * Pour chaque bouton appuye, il faut verifier si la lettre est contenue dans le mot 
	 * et declencher un evenement.
	 */
	public Clavier(){
		
		victoire=0;
		this.setOpaque(false);
		
		//this.setLayout(new GridLayout(3,2));
		this.setLayout(new GridBagLayout());
		GridBagConstraints cr= new GridBagConstraints();


		String resourcesImagesPath = "src/main/resources/images/";

		 aImg = new ImageIcon(getClass().getResource("/images/a.png"));
	      bImg = new ImageIcon(getClass().getResource("/images/b.png"));
	      zImg = new ImageIcon(getClass().getResource("/images/z.png"));
	      rImg = new ImageIcon(getClass().getResource("/images/r.png"));
	      tImg = new ImageIcon(getClass().getResource("/images/t.png"));
	      yImg = new ImageIcon(getClass().getResource("/images/y.png"));
	      eImg = new ImageIcon(getClass().getResource("/images/e.png"));
	      cImg = new ImageIcon(getClass().getResource("/images/c.png"));
	      dImg = new ImageIcon(getClass().getResource("/images/d.png"));
	      fImg = new ImageIcon(getClass().getResource("/images/f.png"));
	      gImg = new ImageIcon(getClass().getResource("/images/g.png"));
	      hImg = new ImageIcon(getClass().getResource("/images/h.png"));
	      iImg = new ImageIcon(getClass().getResource("/images/i.png"));
	      jImg = new ImageIcon(getClass().getResource("/images/j.png"));
	      kImg = new ImageIcon(getClass().getResource("/images/k.png"));
	      lImg = new ImageIcon(getClass().getResource("/images/l.png"));
	      mImg = new ImageIcon(getClass().getResource("/images/m.png"));
	      nImg = new ImageIcon(getClass().getResource("/images/n.png"));
	      oImg = new ImageIcon(getClass().getResource("/images/o.png"));
	      pImg = new ImageIcon(getClass().getResource("/images/p.png"));
	      qImg = new ImageIcon(getClass().getResource("/images/q.png"));
	      sImg = new ImageIcon(getClass().getResource("/images/s.png"));
	      uImg = new ImageIcon(getClass().getResource("/images/u.png"));
	      vImg = new ImageIcon(getClass().getResource("/images/v.png"));
	      wImg = new ImageIcon(getClass().getResource("/images/w.png"));
	      xImg = new ImageIcon(getClass().getResource("/images/x.png"));
	      
	      //KeyListener klr = new KeyAdapter();
	      
	      cr.gridx=0;
	      cr.gridy=0;
	      cr.insets=new Insets(20,50,0,0);
	      
	      a = new JButton(aImg);
	      a.setFocusable(true);
		  a.requestFocusInWindow();
	      a.setMnemonic(KeyEvent.VK_A);
	      a.addActionListener(this);
	      a.getName();
	      a.setPreferredSize(new Dimension(57,53));
	      add(a,cr);
	      
	     
	      cr.gridx=1;
	      b = new JButton(bImg);
	      b.setPreferredSize(new Dimension(57,53));
	      b.addActionListener(this);
	       add(b,cr);
	       
	      cr.gridx=2;
	      c = new JButton(cImg);
	      c.setPreferredSize(new Dimension(57,53));
	      c.addActionListener(this);
	      add(c,cr);
	      
	      cr.gridx=3;
	      d = new JButton(dImg);
	      d.setPreferredSize(new Dimension(57,53));
	      d.addActionListener(this);
	      add(d,cr);
	      
	      cr.gridx=4;
	      e = new JButton(eImg);
	      e.setPreferredSize(new Dimension(55,53));
	      e.addActionListener(this);
	      add(e,cr);
	          
	      cr.gridx=5;
	      f = new JButton(fImg);
	      f.addActionListener(this);
	      f.setPreferredSize(new Dimension(57,53));
	      add(f,cr);
	      
	      cr.gridx=6;
	      g = new JButton(gImg);
	      g.addActionListener(this);
	      g.setPreferredSize(new Dimension(57,53));
	      add(g,cr);
	      
	      cr.gridx=7;
	      h = new JButton(hImg);
	      h.addActionListener(this);
	      h.setPreferredSize(new Dimension(57,53));
	      add(h,cr);
	      
	      cr.gridx=8;
	      i = new JButton(iImg);
	      i.addActionListener(this);
	      i.setPreferredSize(new Dimension(57,53));
	      add(i,cr);
	      
	      cr.insets=new Insets(5,50,0,0);
	      cr.gridy=1;
	      cr.gridx=0;
	      j = new JButton(jImg);
	      j.addActionListener(this);
	      j.setPreferredSize(new Dimension(57,53));
	      add(j,cr);
	      
	      cr.gridx=1;
	      k = new JButton(kImg);
	      k.addActionListener(this);
	      k.setPreferredSize(new Dimension(57,53));
	      add(k,cr);
	      
	      cr.gridx=2;
	      l = new JButton(lImg);
	      l.addActionListener(this);
	      l.setPreferredSize(new Dimension(57,53));
	      add(l,cr);
	      
	      cr.gridx=3;
	      m = new JButton(mImg);
	      m.addActionListener(this);
	      m.setPreferredSize(new Dimension(57,53));
	      add(m,cr);
	      
	      cr.gridx=4;
	      n = new JButton(nImg);
	      n.addActionListener(this);
	      n.setPreferredSize(new Dimension(57,53));
	      add(n,cr);
	      
	      cr.gridx=5;
	      o = new JButton(oImg);
	      o.addActionListener(this);
	      o.setPreferredSize(new Dimension(57,53));
	      add(o,cr);
	      
	      cr.gridx=6;
	      p = new JButton(pImg);
	      p.addActionListener(this);
	      p.setPreferredSize(new Dimension(57,53));
	      add(p,cr);
	      
	      cr.gridx=7;
	      q = new JButton(qImg);
	      q.addActionListener(this);
	      q.setPreferredSize(new Dimension(57,53));
	      add(q,cr);
	      
	      cr.gridx=8;
	      r = new JButton(rImg);
	      r.addActionListener(this);
	      r.setPreferredSize(new Dimension(57,53));
	      add(r,cr);
	      
	      cr.insets=new Insets(5,50,10,0);
	      cr.gridy=2;
	      cr.gridx=0;
	      s = new JButton(sImg);
	      s.addActionListener(this);
	      s.setPreferredSize(new Dimension(57,53));
	      add(s,cr);
	      
	      cr.gridx=1;
	      t = new JButton(tImg);
	      t.addActionListener(this);
	      t.setPreferredSize(new Dimension(57,53));
	      add(t,cr);
	      
	      cr.gridx=2;
	      u = new JButton(uImg);
	      u.addActionListener(this);
	      u.setPreferredSize(new Dimension(57,53));
	      add(u,cr);
	      
	      cr.gridx=3;
	      v = new JButton(vImg);
	      v.addActionListener(this);
	      v.setPreferredSize(new Dimension(57,53));
	      add(v,cr);
	      
	      cr.gridx=4;
	      w = new JButton(wImg);
	      w.addActionListener(this);
	      w.setPreferredSize(new Dimension(57,53));
	      add(w,cr);
	      
	      cr.gridx=5;
	      x = new JButton(xImg);
	      x.addActionListener(this);
	      x.setPreferredSize(new Dimension(57,53));
	      add(x,cr);
	      
	      cr.gridx=6;
	      y = new JButton(yImg);
	      y.addActionListener(this);
	      y.setPreferredSize(new Dimension(57,53));
	      add(y,cr);
	      
	      cr.gridx=7;
	      z = new JButton(zImg);
	      z.addActionListener(this);
	      z.setPreferredSize(new Dimension(57,53));
	      add(z,cr);  
	      
	      
	    tabButtons=new JButton[26];
	      
	    tabButtons[0]=a;
	    tabButtons[1]=b;
	    tabButtons[2]=c;
	    tabButtons[3]=d;
	    tabButtons[4]=e;
	    tabButtons[5]=f;
	    tabButtons[6]=g;
	    tabButtons[7]=h;
	    tabButtons[8]=i;
	    tabButtons[9]=j;
	    tabButtons[10]=k;
	    tabButtons[11]=l;
	    tabButtons[12]=m;
	    tabButtons[13]=n;
	    tabButtons[14]=o;
	    tabButtons[15]=p;
	    tabButtons[16]=q;
	    tabButtons[17]=r;
	    tabButtons[18]=s;
	    tabButtons[19]=t;
	    tabButtons[20]=u;
	    tabButtons[21]=v;
	    tabButtons[22]=w;
	    tabButtons[23]=x;
	    tabButtons[24]=y;
	    tabButtons[25]=z;
		
	}



	
	@Override
	public void actionPerformed(ActionEvent ev) {
		Object source=ev.getSource();
		Word.tabLabels[1].getText();
		
		System.out.println("lgt mot : "+Word.arrayWord.length+"\n Lettres a trouver :"+((Word.arrayWord.length)-2));
		System.out.println(victoire);
		
	
		
		
if (source==a){
	int hitCount=0;
	
	if(Word.lettreDansMot[0]==true){
		hitCount++;
		for(int count=0;count<Word.smallArrayWord.length;count++){
			if(Word.smallArrayWord[count]=='a'){
				hitCount++;
				victoire++;
			}
	}
		/*if('a'==Word.arrayWord[0] || 'a'==Word.arrayWord[Word.arrayWord.length]){
			for(int count=0;count<Word.smallArrayWord.length;count++){
				if(Word.smallArrayWord[count]=='a'){
					hitCount++;
				}
			}
		}*/
	}
	
	if(hitCount<=1){
		Pendu.penduUp();
		Pendu.pendu.setIcon(Pendu.pendusList.get(Pendu.stadePendu));
	}
	
	else if(Word.lettreDansMot[0]==true || hitCount>1){
				
				for(int i=0;i<Word.arrayWord.length;i++){
					
					if('a'==Word.arrayWord[i]){
						Word.tabLabels[i].setText("a");
						
						
						if(victoire>=((Word.arrayWord.length)-2)){
							vicBoo=true;
							FinPartie fp=new FinPartie();
							Main.gamePan = new GamePanel();	
							//Main.gamePan.motToFind.setVisible(false);
							
							for(int tou=0;tou<26;tou++){
								Clavier.tabButtons[tou].setEnabled(false);
							}
							Main.gamePan.add(fp,BorderLayout.WEST);
							Main.cards.add(Main.gamePan,"jeu");
							Main.cardL.last(Main.cards);
						}
						}
				}
			}
			
			
			a.setEnabled(false);
			
			
			
		}










if (source==c){
	
int hitCount=0;
	
	if(Word.lettreDansMot[2]==true){
		hitCount++;
		for(int count=0;count<Word.smallArrayWord.length;count++){
			if(Word.smallArrayWord[count]=='c'){
				hitCount++;
				victoire++;
			}
	}}
	
		if(hitCount<=1){
			Pendu.penduUp();
			Pendu.pendu.setIcon(Pendu.pendusList.get(Pendu.stadePendu));
		}
		
		else if(Word.lettreDansMot[2]==true || hitCount>1){
		for(int i=0;i<Word.arrayWord.length;i++){
			if('c'==Word.arrayWord[i]){
				Word.tabLabels[i].setText("c");
				if(victoire>=((Word.arrayWord.length)-2)){
					vicBoo=true;
					FinPartie fp=new FinPartie();
					Main.gamePan = new GamePanel();	
					//Main.gamePan.motToFind.setVisible(false);
					for(int tou=0;tou<26;tou++){
						Clavier.tabButtons[tou].setEnabled(false);
					}
					Main.gamePan.add(fp,BorderLayout.WEST);
					Main.cards.add(Main.gamePan,"jeu");
					Main.cardL.last(Main.cards);
				}}
		}
	}
	c.setEnabled(false);
	
	
}




if (source==d){
	
int hitCount=0;
	
	if(Word.lettreDansMot[3]==true){
		hitCount++;
		for(int count=0;count<Word.smallArrayWord.length;count++){
			if(Word.smallArrayWord[count]=='d'){
				hitCount++;
				victoire++;
			}
	}}
	
		if(hitCount<=1){
			Pendu.penduUp();
			Pendu.pendu.setIcon(Pendu.pendusList.get(Pendu.stadePendu));
		}
		
		else if(Word.lettreDansMot[3]==true || hitCount>1){
		for(int i=0;i<Word.arrayWord.length;i++){
			if('d'==Word.arrayWord[i]){
				Word.tabLabels[i].setText("d");
				if(victoire>=((Word.arrayWord.length)-2)){
					vicBoo=true;
					FinPartie fp=new FinPartie();
					Main.gamePan = new GamePanel();	
					//Main.gamePan.motToFind.setVisible(false);
					for(int tou=0;tou<26;tou++){
						Clavier.tabButtons[tou].setEnabled(false);
					}
					Main.gamePan.add(fp,BorderLayout.WEST);
					Main.cards.add(Main.gamePan,"jeu");
					Main.cardL.last(Main.cards);
				}}
		}
	}
	d.setEnabled(false);
	
	
}




if (source==e){
	
int hitCount=0;
	
	if(Word.lettreDansMot[4]==true){
		hitCount++;
		for(int count=0;count<Word.smallArrayWord.length;count++){
			if(Word.smallArrayWord[count]=='e'){
				hitCount++;
				victoire++;
			}
	}}
	
		if(hitCount<=1){
			Pendu.penduUp();
			Pendu.pendu.setIcon(Pendu.pendusList.get(Pendu.stadePendu));
		}
		
		else if(Word.lettreDansMot[4]==true || hitCount>1){
		for(int i=0;i<Word.arrayWord.length;i++){
			if('e'==Word.arrayWord[i]){
				Word.tabLabels[i].setText("e");
				if(victoire>=((Word.arrayWord.length)-2)){
					vicBoo=true;
					FinPartie fp=new FinPartie();
					Main.gamePan = new GamePanel();	
					//Main.gamePan.motToFind.setVisible(false);
					for(int tou=0;tou<26;tou++){
						Clavier.tabButtons[tou].setEnabled(false);
					}
					Main.gamePan.add(fp,BorderLayout.WEST);
					Main.cards.add(Main.gamePan,"jeu");
					Main.cardL.last(Main.cards);
				}}
		}
	}
	e.setEnabled(false);
	
	
}




if (source==f){
	
int hitCount=0;
	
	if(Word.lettreDansMot[5]==true){
		hitCount++;
		for(int count=0;count<Word.smallArrayWord.length;count++){
			if(Word.smallArrayWord[count]=='f'){
				hitCount++;
				victoire++;
			}
	}}
	
		if(hitCount<=1){
			Pendu.penduUp();
			Pendu.pendu.setIcon(Pendu.pendusList.get(Pendu.stadePendu));
		}
		
		else if(Word.lettreDansMot[5]==true || hitCount>1){
		for(int i=0;i<Word.arrayWord.length;i++){
			if('f'==Word.arrayWord[i]){
				Word.tabLabels[i].setText("f");
				if(victoire>=((Word.arrayWord.length)-2)){
					vicBoo=true;
					FinPartie fp=new FinPartie();
					Main.gamePan = new GamePanel();	
					//Main.gamePan.motToFind.setVisible(false);
					for(int tou=0;tou<26;tou++){
						Clavier.tabButtons[tou].setEnabled(false);
					}
					Main.gamePan.add(fp,BorderLayout.WEST);
					Main.cards.add(Main.gamePan,"jeu");
					Main.cardL.last(Main.cards);
				}}
		}
	}
	f.setEnabled(false);
	
	
}




if (source==g){
	
int hitCount=0;
	
	if(Word.lettreDansMot[6]==true){
		hitCount++;
		for(int count=0;count<Word.smallArrayWord.length;count++){
			if(Word.smallArrayWord[count]=='g'){
				hitCount++;
				victoire++;
			}
	}
	}
		if(hitCount<=1){
			Pendu.penduUp();
			Pendu.pendu.setIcon(Pendu.pendusList.get(Pendu.stadePendu));
		}
		
		else if(Word.lettreDansMot[6]==true || hitCount>1){
		for(int i=0;i<Word.arrayWord.length;i++){
			if('g'==Word.arrayWord[i]){
				Word.tabLabels[i].setText("g");
				if(victoire>=((Word.arrayWord.length)-2)){
					vicBoo=true;
					FinPartie fp=new FinPartie();
					Main.gamePan = new GamePanel();	
					//Main.gamePan.motToFind.setVisible(false);
					for(int tou=0;tou<26;tou++){
						Clavier.tabButtons[tou].setEnabled(false);
					}
					Main.gamePan.add(fp,BorderLayout.WEST);
					Main.cards.add(Main.gamePan,"jeu");
					Main.cardL.last(Main.cards);
				}}
		}
	}
	g.setEnabled(false);
	
	
}




if (source==h){
	
int hitCount=0;
	
	if(Word.lettreDansMot[7]==true){
		hitCount++;
		for(int count=0;count<Word.smallArrayWord.length;count++){
			if(Word.smallArrayWord[count]=='h'){
				hitCount++;
				victoire++;
			}
	}
	}
		if(hitCount<=1){
			Pendu.penduUp();
			Pendu.pendu.setIcon(Pendu.pendusList.get(Pendu.stadePendu));
		}
		
		else if(Word.lettreDansMot[7]==true || hitCount>1){
		for(int i=0;i<Word.arrayWord.length;i++){
			if('h'==Word.arrayWord[i]){
				Word.tabLabels[i].setText("h");
				if(victoire>=((Word.arrayWord.length)-2)){
					vicBoo=true;
					FinPartie fp=new FinPartie();
					Main.gamePan = new GamePanel();	
					//Main.gamePan.motToFind.setVisible(false);
					for(int tou=0;tou<26;tou++){
						Clavier.tabButtons[tou].setEnabled(false);
					}
					Main.gamePan.add(fp,BorderLayout.WEST);
					Main.cards.add(Main.gamePan,"jeu");
					Main.cardL.last(Main.cards);
				}}
		}
	}
	h.setEnabled(false);
	
	
}




if (source==i){
	
int hitCount=0;
	
	if(Word.lettreDansMot[8]==true){
		hitCount++;
		for(int count=0;count<Word.smallArrayWord.length;count++){
			if(Word.smallArrayWord[count]=='i'){
				hitCount++;
				victoire++;
			}
	}}
	
		if(hitCount<=1){
			Pendu.penduUp();
			Pendu.pendu.setIcon(Pendu.pendusList.get(Pendu.stadePendu));
		}
		
		else if(Word.lettreDansMot[8]==true || hitCount>1){
		for(int i=0;i<Word.arrayWord.length;i++){
			if('i'==Word.arrayWord[i]){
				Word.tabLabels[i].setText("i");
				if(victoire>=((Word.arrayWord.length)-2)){
					vicBoo=true;
					FinPartie fp=new FinPartie();
					Main.gamePan = new GamePanel();	
					//Main.gamePan.motToFind.setVisible(false);
					for(int tou=0;tou<26;tou++){
						Clavier.tabButtons[tou].setEnabled(false);
					}
					Main.gamePan.add(fp,BorderLayout.WEST);
					Main.cards.add(Main.gamePan,"jeu");
					Main.cardL.last(Main.cards);
				}}
		}
	}
	i.setEnabled(false);
	
	
}




if (source==j){
	
int hitCount=0;
	
	if(Word.lettreDansMot[9]==true){
		hitCount++;
		for(int count=0;count<Word.smallArrayWord.length;count++){
			if(Word.smallArrayWord[count]=='j'){
				hitCount++;
				victoire++;
			}
	}}
	
		if(hitCount<=1){
			Pendu.penduUp();
			Pendu.pendu.setIcon(Pendu.pendusList.get(Pendu.stadePendu));
		}
		
		else if(Word.lettreDansMot[9]==true || hitCount>1){
		for(int i=0;i<Word.arrayWord.length;i++){
			if('j'==Word.arrayWord[i]){
				Word.tabLabels[i].setText("j");
				if(victoire>=((Word.arrayWord.length)-2)){
					vicBoo=true;
					FinPartie fp=new FinPartie();
					Main.gamePan = new GamePanel();	
					//Main.gamePan.motToFind.setVisible(false);
					for(int tou=0;tou<26;tou++){
						Clavier.tabButtons[tou].setEnabled(false);
					}
					Main.gamePan.add(fp,BorderLayout.WEST);
					Main.cards.add(Main.gamePan,"jeu");
					Main.cardL.last(Main.cards);
				}}
		}
	}
	j.setEnabled(false);
	
	
}




if (source==k){
	
int hitCount=0;
	
	if(Word.lettreDansMot[10]==true){
		hitCount++;
		for(int count=0;count<Word.smallArrayWord.length;count++){
			if(Word.smallArrayWord[count]=='k'){
				hitCount++;
				victoire++;
			}
	}}
	
		if(hitCount<=1){
			Pendu.penduUp();
			Pendu.pendu.setIcon(Pendu.pendusList.get(Pendu.stadePendu));
		}
		
		else if(Word.lettreDansMot[10]==true || hitCount>1){
		for(int i=0;i<Word.arrayWord.length;i++){
			if('k'==Word.arrayWord[i]){
				Word.tabLabels[i].setText("k");
				if(victoire>=((Word.arrayWord.length)-2)){
					vicBoo=true;
					FinPartie fp=new FinPartie();
					Main.gamePan = new GamePanel();	
					//Main.gamePan.motToFind.setVisible(false);
					for(int tou=0;tou<26;tou++){
						Clavier.tabButtons[tou].setEnabled(false);
					}
					Main.gamePan.add(fp,BorderLayout.WEST);
					Main.cards.add(Main.gamePan,"jeu");
					Main.cardL.last(Main.cards);
				}}
		}
	}
	k.setEnabled(false);
	
	
}




if (source==l){
	
int hitCount=0;
	
	if(Word.lettreDansMot[11]==true){
		hitCount++;
		for(int count=0;count<Word.smallArrayWord.length;count++){
			if(Word.smallArrayWord[count]=='l'){
				hitCount++;
				victoire++;
			}
	}}
	
		if(hitCount<=1){
			Pendu.penduUp();
			Pendu.pendu.setIcon(Pendu.pendusList.get(Pendu.stadePendu));
		}
		
		else if(Word.lettreDansMot[11]==true || hitCount>1){
		for(int i=0;i<Word.arrayWord.length;i++){
			if('l'==Word.arrayWord[i]){
				Word.tabLabels[i].setText("l");
				if(victoire>=((Word.arrayWord.length)-2)){
					vicBoo=true;
					FinPartie fp=new FinPartie();
					Main.gamePan = new GamePanel();	
					//Main.gamePan.motToFind.setVisible(false);
					for(int tou=0;tou<26;tou++){
						Clavier.tabButtons[tou].setEnabled(false);
					}
					Main.gamePan.add(fp,BorderLayout.WEST);
					Main.cards.add(Main.gamePan,"jeu");
					Main.cardL.last(Main.cards);
				}}
		}
	}
	l.setEnabled(false);
	
	
}




if (source==m){
	
int hitCount=0;
	
	if(Word.lettreDansMot[12]==true){
		hitCount++;
		for(int count=0;count<Word.smallArrayWord.length;count++){
			if(Word.smallArrayWord[count]=='m'){
				hitCount++;
				victoire++;
			}
	}}
	
		if(hitCount<=1){
			Pendu.penduUp();
			Pendu.pendu.setIcon(Pendu.pendusList.get(Pendu.stadePendu));
		}
		
		else if(Word.lettreDansMot[12]==true || hitCount>1){
		for(int i=0;i<Word.arrayWord.length;i++){
			if('m'==Word.arrayWord[i]){
				Word.tabLabels[i].setText("m");
				if(victoire>=((Word.arrayWord.length)-2)){
					vicBoo=true;
					FinPartie fp=new FinPartie();
					Main.gamePan = new GamePanel();	
					//Main.gamePan.motToFind.setVisible(false);
					for(int tou=0;tou<26;tou++){
						Clavier.tabButtons[tou].setEnabled(false);
					}
					Main.gamePan.add(fp,BorderLayout.WEST);
					Main.cards.add(Main.gamePan,"jeu");
					Main.cardL.last(Main.cards);
				}}
		}
	}
	m.setEnabled(false);
	
	
}




if (source==n){
	
int hitCount=0;
	
	if(Word.lettreDansMot[13]==true){
		hitCount++;
		for(int count=0;count<Word.smallArrayWord.length;count++){
			if(Word.smallArrayWord[count]=='n'){
				hitCount++;
				victoire++;
			}
	}
	}
		if(hitCount<=1){
			Pendu.penduUp();
			Pendu.pendu.setIcon(Pendu.pendusList.get(Pendu.stadePendu));
		}
		
		else if(Word.lettreDansMot[13]==true || hitCount>1){
		for(int i=0;i<Word.arrayWord.length;i++){
			if('n'==Word.arrayWord[i]){
				Word.tabLabels[i].setText("n");
				if(victoire>=((Word.arrayWord.length)-2)){
					vicBoo=true;
					FinPartie fp=new FinPartie();
					Main.gamePan = new GamePanel();	
					//Main.gamePan.motToFind.setVisible(false);
					for(int tou=0;tou<26;tou++){
						Clavier.tabButtons[tou].setEnabled(false);
					}
					Main.gamePan.add(fp,BorderLayout.WEST);
					Main.cards.add(Main.gamePan,"jeu");
					Main.cardL.last(Main.cards);
				}}
		}
	}
	n.setEnabled(false);
	

}




if (source==o){
	
int hitCount=0;
	
	if(Word.lettreDansMot[14]==true){
		hitCount++;
		for(int count=0;count<Word.smallArrayWord.length;count++){
			if(Word.smallArrayWord[count]=='o'){
				hitCount++;
				victoire++;
			}
	}}
	
		if(hitCount<=1){
			Pendu.penduUp();
			Pendu.pendu.setIcon(Pendu.pendusList.get(Pendu.stadePendu));
		}
		
		else if(Word.lettreDansMot[14]==true || hitCount>1){
		for(int i=0;i<Word.arrayWord.length;i++){
			if('o'==Word.arrayWord[i]){
				Word.tabLabels[i].setText("o");
				if(victoire>=((Word.arrayWord.length)-2)){
					vicBoo=true;
					FinPartie fp=new FinPartie();
					Main.gamePan = new GamePanel();	
					//Main.gamePan.motToFind.setVisible(false);
					for(int tou=0;tou<26;tou++){
						Clavier.tabButtons[tou].setEnabled(false);
					}
					Main.gamePan.add(fp,BorderLayout.WEST);
					Main.cards.add(Main.gamePan,"jeu");
					Main.cardL.last(Main.cards);
				}}
		}
	}
	o.setEnabled(false);
	
	
}




if (source==p){
	
int hitCount=0;
	
	if(Word.lettreDansMot[15]==true){
		hitCount++;
		for(int count=0;count<Word.smallArrayWord.length;count++){
			if(Word.smallArrayWord[count]=='p'){
				hitCount++;
				victoire++;
			}
	}}
	
		if(hitCount<=1){
			Pendu.penduUp();
			Pendu.pendu.setIcon(Pendu.pendusList.get(Pendu.stadePendu));
		}
		
		else if(Word.lettreDansMot[15]==true || hitCount>1){
		for(int i=0;i<Word.arrayWord.length;i++){
			if('p'==Word.arrayWord[i]){
				Word.tabLabels[i].setText("p");
				if(victoire>=((Word.arrayWord.length)-2)){
					vicBoo=true;
					FinPartie fp=new FinPartie();
					Main.gamePan = new GamePanel();	
					//Main.gamePan.motToFind.setVisible(false);
					for(int tou=0;tou<26;tou++){
						Clavier.tabButtons[tou].setEnabled(false);
					}
					Main.gamePan.add(fp,BorderLayout.WEST);
					Main.cards.add(Main.gamePan,"jeu");
					Main.cardL.last(Main.cards);
				}}
		}
	}
	p.setEnabled(false);
	
	
}




if (source==q){
	
int hitCount=0;
	
	if(Word.lettreDansMot[16]==true){
		hitCount++;
		for(int count=0;count<Word.smallArrayWord.length;count++){
			if(Word.smallArrayWord[count]=='q'){
				hitCount++;
				victoire++;
			}
	}}
	
		if(hitCount<=1){
			Pendu.penduUp();
			Pendu.pendu.setIcon(Pendu.pendusList.get(Pendu.stadePendu));
		}
		
		else if(Word.lettreDansMot[16]==true || hitCount>1){
		for(int i=0;i<Word.arrayWord.length;i++){
			if('q'==Word.arrayWord[i]){
				Word.tabLabels[i].setText("q");
				if(victoire>=((Word.arrayWord.length)-2)){
					vicBoo=true;
					FinPartie fp=new FinPartie();
					Main.gamePan = new GamePanel();	
					//Main.gamePan.motToFind.setVisible(false);
					for(int tou=0;tou<26;tou++){
						Clavier.tabButtons[tou].setEnabled(false);
					}
					Main.gamePan.add(fp,BorderLayout.WEST);
					Main.cards.add(Main.gamePan,"jeu");
					Main.cardL.last(Main.cards);
				}}
		}
	}
	q.setEnabled(false);
	
	
}




if (source==r){
	
int hitCount=0;
	
	if(Word.lettreDansMot[17]==true){
		hitCount++;
		for(int count=0;count<Word.smallArrayWord.length;count++){
			if(Word.smallArrayWord[count]=='r'){
				hitCount++;
				victoire++;
			}
	}}
	
		if(hitCount<=1){
			Pendu.penduUp();
			Pendu.pendu.setIcon(Pendu.pendusList.get(Pendu.stadePendu));
		}
		
		else if(Word.lettreDansMot[17]==true || hitCount>1){
		for(int i=0;i<Word.arrayWord.length;i++){
			if('r'==Word.arrayWord[i]){
				Word.tabLabels[i].setText("r");
				if(victoire>=((Word.arrayWord.length)-2)){
					vicBoo=true;
					FinPartie fp=new FinPartie();
					Main.gamePan = new GamePanel();	
					//Main.gamePan.motToFind.setVisible(false);
					for(int tou=0;tou<26;tou++){
						Clavier.tabButtons[tou].setEnabled(false);
					}
					Main.gamePan.add(fp,BorderLayout.WEST);
					Main.cards.add(Main.gamePan,"jeu");
					Main.cardL.last(Main.cards);
				}}
		}
	}
	r.setEnabled(false);
	
	
}




if (source==s){
	
int hitCount=0;
	
	if(Word.lettreDansMot[18]==true){
		hitCount++;
		for(int count=0;count<Word.smallArrayWord.length;count++){
			if(Word.smallArrayWord[count]=='s'){
				hitCount++;
				victoire++;
			}
	}
	}
		if(hitCount<=1){
			Pendu.penduUp();
			Pendu.pendu.setIcon(Pendu.pendusList.get(Pendu.stadePendu));
		}
		
		else if(Word.lettreDansMot[18]==true || hitCount>1){
		for(int i=0;i<Word.arrayWord.length;i++){
			if('s'==Word.arrayWord[i]){
				Word.tabLabels[i].setText("s");
				if(victoire>=((Word.arrayWord.length)-2)){
					vicBoo=true;
					FinPartie fp=new FinPartie();
					Main.gamePan = new GamePanel();	
					//Main.gamePan.motToFind.setVisible(false);
					for(int tou=0;tou<26;tou++){
						Clavier.tabButtons[tou].setEnabled(false);
					}
					Main.gamePan.add(fp,BorderLayout.WEST);
					Main.cards.add(Main.gamePan,"jeu");
					Main.cardL.last(Main.cards);
				}}
		}
	}
	s.setEnabled(false);
	
	
}




if (source==t){
	
int hitCount=0;
	
	if(Word.lettreDansMot[19]==true){
		hitCount++;
		for(int count=0;count<Word.smallArrayWord.length;count++){
			if(Word.smallArrayWord[count]=='t'){
				hitCount++;
				victoire++;
			}
	}}
	
		if(hitCount<=1){
			Pendu.penduUp();
			Pendu.pendu.setIcon(Pendu.pendusList.get(Pendu.stadePendu));
		}
		
		else if(Word.lettreDansMot[19]==true || hitCount>1){
		for(int i=0;i<Word.arrayWord.length;i++){
			if('t'==Word.arrayWord[i]){
				Word.tabLabels[i].setText("t");
				if(victoire>=((Word.arrayWord.length)-2)){
					vicBoo=true;
					FinPartie fp=new FinPartie();
					Main.gamePan = new GamePanel();	
					//Main.gamePan.motToFind.setVisible(false);
					for(int tou=0;tou<26;tou++){
						Clavier.tabButtons[tou].setEnabled(false);
					}
					Main.gamePan.add(fp,BorderLayout.WEST);
					Main.cards.add(Main.gamePan,"jeu");
					Main.cardL.last(Main.cards);
				}}
		}
	}
	t.setEnabled(false);
	
	
}




if (source==u){
	
int hitCount=0;
	
	if(Word.lettreDansMot[20]==true){
		hitCount++;
		for(int count=0;count<Word.smallArrayWord.length;count++){
			if(Word.smallArrayWord[count]=='u'){
				hitCount++;
				victoire++;
			}
	}}
	
		if(hitCount<=1){
			Pendu.penduUp();
			Pendu.pendu.setIcon(Pendu.pendusList.get(Pendu.stadePendu));
		}
		
		else if(Word.lettreDansMot[20]==true || hitCount>1){
		for(int i=0;i<Word.arrayWord.length;i++){
			if('u'==Word.arrayWord[i]){
				Word.tabLabels[i].setText("u");
				if(victoire>=((Word.arrayWord.length)-2)){
					vicBoo=true;
					FinPartie fp=new FinPartie();
					Main.gamePan = new GamePanel();	
					//Main.gamePan.motToFind.setVisible(false);
					for(int tou=0;tou<26;tou++){
						Clavier.tabButtons[tou].setEnabled(false);
					}
					Main.gamePan.add(fp,BorderLayout.WEST);
					Main.cards.add(Main.gamePan,"jeu");
					Main.cardL.last(Main.cards);
				}}
		}
	}
	u.setEnabled(false);
	
	
}




if (source==v){
	
int hitCount=0;
	
	if(Word.lettreDansMot[21]==true){
		hitCount++;
		for(int count=0;count<Word.smallArrayWord.length;count++){
			if(Word.smallArrayWord[count]=='v'){
				hitCount++;
				victoire++;
			}
	}
	}
		if(hitCount<=1){
			Pendu.penduUp();
			Pendu.pendu.setIcon(Pendu.pendusList.get(Pendu.stadePendu));
		}
		
		else if(Word.lettreDansMot[21]==true || hitCount>1){
		for(int i=0;i<Word.arrayWord.length;i++){
			if('v'==Word.arrayWord[i]){
				Word.tabLabels[i].setText("v");
				if(victoire>=((Word.arrayWord.length)-2)){
					vicBoo=true;
					FinPartie fp=new FinPartie();
					Main.gamePan = new GamePanel();	
					//Main.gamePan.motToFind.setVisible(false);
					for(int tou=0;tou<26;tou++){
						Clavier.tabButtons[tou].setEnabled(false);
					}
					Main.gamePan.add(fp,BorderLayout.WEST);
					Main.cards.add(Main.gamePan,"jeu");
					Main.cardL.last(Main.cards);
				}}
		}
	}
	v.setEnabled(false);
	
	
}




if (source==w){
	
int hitCount=0;
	
	if(Word.lettreDansMot[22]==true){
		hitCount++;
		for(int count=0;count<Word.smallArrayWord.length;count++){
			if(Word.smallArrayWord[count]=='w'){
				hitCount++;
				victoire++;
			}
	}}
	
		if(hitCount<=1){
			Pendu.penduUp();
			Pendu.pendu.setIcon(Pendu.pendusList.get(Pendu.stadePendu));
		}
		
		else if(Word.lettreDansMot[22]==true || hitCount>1){
		for(int i=0;i<Word.arrayWord.length;i++){
			if('w'==Word.arrayWord[i]){
				Word.tabLabels[i].setText("w");
				if(victoire>=((Word.arrayWord.length)-2)){
					vicBoo=true;
					FinPartie fp=new FinPartie();
					Main.gamePan = new GamePanel();	
					//Main.gamePan.motToFind.setVisible(false);
					for(int tou=0;tou<26;tou++){
						Clavier.tabButtons[tou].setEnabled(false);
					}
					Main.gamePan.add(fp,BorderLayout.WEST);
					Main.cards.add(Main.gamePan,"jeu");
					Main.cardL.last(Main.cards);
				}}
		}
	}
	w.setEnabled(false);
	
	
}




if (source==x){
	
int hitCount=0;
	
	if(Word.lettreDansMot[23]==true){
		hitCount++;
		for(int count=0;count<Word.smallArrayWord.length;count++){
			if(Word.smallArrayWord[count]=='x'){
				hitCount++;
				victoire++;
			}
	}}
	
		if(hitCount<=1){
			Pendu.penduUp();
			Pendu.pendu.setIcon(Pendu.pendusList.get(Pendu.stadePendu));
		}
		
		else if(Word.lettreDansMot[23]==true || hitCount>1){
		for(int i=0;i<Word.arrayWord.length;i++){
			if('x'==Word.arrayWord[i]){
				Word.tabLabels[i].setText("x");
				if(victoire>=((Word.arrayWord.length)-2)){
					vicBoo=true;
					FinPartie fp=new FinPartie();
					Main.gamePan = new GamePanel();	
					//Main.gamePan.motToFind.setVisible(false);
					for(int tou=0;tou<26;tou++){
						Clavier.tabButtons[tou].setEnabled(false);
					}
					Main.gamePan.add(fp,BorderLayout.WEST);
					Main.cards.add(Main.gamePan,"jeu");
					Main.cardL.last(Main.cards);
				}}
		}
	}
	x.setEnabled(false);
	
	
}




if (source==y){
	
int hitCount=0;
	
	if(Word.lettreDansMot[24]==true){
		hitCount++;
		for(int count=0;count<Word.smallArrayWord.length;count++){
			if(Word.smallArrayWord[count]=='y'){
				hitCount++;
				victoire++;
			}
	}
	}
		if(hitCount<=1){
			Pendu.penduUp();
			Pendu.pendu.setIcon(Pendu.pendusList.get(Pendu.stadePendu));
		}
		
		else if(Word.lettreDansMot[24]==true || hitCount>1){
		for(int i=0;i<Word.arrayWord.length;i++){
			if('y'==Word.arrayWord[i]){
				Word.tabLabels[i].setText("y");
				if(victoire>=((Word.arrayWord.length)-2)){
					vicBoo=true;
					FinPartie fp=new FinPartie();
					Main.gamePan = new GamePanel();	
					//Main.gamePan.motToFind.setVisible(false);
					for(int tou=0;tou<26;tou++){
						Clavier.tabButtons[tou].setEnabled(false);
					}
					Main.gamePan.add(fp,BorderLayout.WEST);
					Main.cards.add(Main.gamePan,"jeu");
					Main.cardL.last(Main.cards);
				}}
		}
	}
	y.setEnabled(false);
	
	
}




if (source==z){
	
int hitCount=0;
	
	if(Word.lettreDansMot[25]==true){
		hitCount++;
		for(int count=0;count<Word.smallArrayWord.length;count++){
			if(Word.smallArrayWord[count]=='z'){
				hitCount++;
				victoire++;
			}
	}
	}
		if(hitCount<=1){
			Pendu.penduUp();
			Pendu.pendu.setIcon(Pendu.pendusList.get(Pendu.stadePendu));
		}
		
		else if(Word.lettreDansMot[25]==true || hitCount>1){
		for(int i=0;i<Word.arrayWord.length;i++){
			if('z'==Word.arrayWord[i]){
				Word.tabLabels[i].setText("z");
				if(victoire>=((Word.arrayWord.length)-2)){
					vicBoo=true;
					FinPartie fp=new FinPartie();
					Main.gamePan = new GamePanel();	
					//Main.gamePan.motToFind.setVisible(false);
					for(int tou=0;tou<26;tou++){
						Clavier.tabButtons[tou].setEnabled(false);
					}
					Main.gamePan.add(fp,BorderLayout.WEST);
					Main.cards.add(Main.gamePan,"jeu");
					Main.cardL.last(Main.cards);
				}}
		}
	}
	z.setEnabled(false);
	
	
}




		
		
		if (source==b){
			boolean estLa=false;
			for(int i=0;i<Word.arrayWord.length;i++){
				if('b'==Word.arrayWord[i]){
					estLa=true;
					Word.tabLabels[i].setText("b");
					}
			}
			if(estLa==false){
				Pendu.penduUp();
				Pendu.pendu.setIcon(Pendu.pendusList.get(Pendu.stadePendu));
				}
			b.setEnabled(false);
		}
		
	}


}
