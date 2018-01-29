package essai.instanciation.dynamique;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {

		String nom = Paire.class.getName();
		
		try{
			
			//On crée un objet Class
			Class cl = Class.forName(nom);
			
			//Nouvelle instance de la classe Paire
			Object o = cl.newInstance();
			
			//On crée les paramètres des constructeurs
			Class[] types = new Class[]{String.class, String.class};
			//On récupère le constructeur avec les deux paramètres
			Constructor ct = cl.getConstructor(types);
			
			//On instancie l'objet avec le constructeur surchargé
			Object o2 = ct.newInstance("valeur1", "valeur2");
			
			//On va chercher la méthode toString, elle n'a aucun paramètres
			Method m = cl.getMethod("toString", null);
			
			//La méthode Invoke exécute la méthode sur l'objet passé en paramètre
			//Pas de paramètre, donc null en deuxième paramètre de la méthode Invoke!
			System.out.println("-------------------------------");
			System.out.println("Méthode "+ m.getName() + " sur o2 : " + m.invoke(o2, null));
			System.out.println("Méthode "+ m.getName() + " sur o : " + m.invoke(o, null));

			
		}
		catch(SecurityException se){
			se.printStackTrace();
		}
		catch(IllegalArgumentException iae){
			iae.printStackTrace();
		}
		catch(ClassNotFoundException cnfe){
			cnfe.printStackTrace();
		}
		catch(InstantiationException ie){
			ie.printStackTrace();
		}
		catch(IllegalAccessException iae){
			iae.printStackTrace();
		}
		catch(NoSuchMethodException nsme){
			nsme.printStackTrace();
		}
		catch(InvocationTargetException ite){
			ite.printStackTrace();
		}
	}

}
