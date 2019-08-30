package iutsd;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Classe qui extrait tous les mots du fichier listeMots.txt
 * 
 * @author Mehdi Littame
 * @author Maxime Brimaud
 * @author David Hoeffel
 *
 */
public class ExtractLine {
	
public static ArrayList <String> listeMots = new ArrayList <String>();
String mot="";
int i=0;
String separateur="\n";


public ExtractLine(){
	
	// lecture du fichier texte
	
	try {
	InputStream ips = new FileInputStream("src/main/resources/listeMots.txt");
	InputStreamReader ipsr = new InputStreamReader(ips);
	BufferedReader br = new BufferedReader(ipsr);

	for(;br.readLine()!=separateur && i<168265;mot+=br.readLine()){
		listeMots.add(mot);
		
		i++;
		mot="";
		}	
	}
	catch (Exception e) {
		System.out.println(e.toString());
		} 
}
	

public static void main(String[] args)
{
	for (int j=0;j<168265;j++){
		System.out.println(listeMots.get(j));
	}
}










/*String ligne;
int numLigne = 0;
int nombreDeLignes = 336500; // par exemple
int[] var = new int[nombreDeLignes];

while ((ligne = br.readLine()) != null)
{
numLigne++;
System.out.println(ligne);
//chaine += ligne + "\n";
int ind = ligne.indexOf(" ");
var[numLigne -1] = Integer.parseInt(ligne.substring(0, ind));
}

for (int i = 0; i < var.length; i++)
{
System.out.println("var[" + i + "] = " + var[i]);
}

br.close();
}*/

	

}
