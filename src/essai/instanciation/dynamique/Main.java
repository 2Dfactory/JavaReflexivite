package essai.instanciation.dynamique;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {

		String nom = Paire.class.getName();
		
		try{
			
			//On cr�e un objet Class
			Class cl = Class.forName(nom);
			
			//Nouvelle instance de la classe Paire
			Object o = cl.newInstance();
			
			//On cr�e les param�tres des constructeurs
			Class[] types = new Class[]{String.class, String.class};
			//On r�cup�re le constructeur avec les deux param�tres
			Constructor ct = cl.getConstructor(types);
			
			//On instancie l'objet avec le constructeur surcharg�
			Object o2 = ct.newInstance("valeur1", "valeur2");
			
			//On va chercher la m�thode toString, elle n'a aucun param�tres
			Method m = cl.getMethod("toString", null);
			
			//La m�thode Invoke ex�cute la m�thode sur l'objet pass� en param�tre
			//Pas de param�tre, donc null en deuxi�me param�tre de la m�thode Invoke!
			System.out.println("-------------------------------");
			System.out.println("M�thode "+ m.getName() + " sur o2 : " + m.invoke(o2, null));
			System.out.println("M�thode "+ m.getName() + " sur o : " + m.invoke(o, null));

			
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