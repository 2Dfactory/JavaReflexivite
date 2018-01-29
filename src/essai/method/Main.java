package essai.method;

import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		
		Class c = new String().getClass();
		Method[] m = c.getMethods();
		                
		System.out.println("Il y a " + m.length + " méthodes dans cette classe");
		  //On parcourt le tableau de méthodes
		for(Method mbis : m){
			
			System.out.println(mbis);
			
			Class[] p = mbis.getParameterTypes();

		    for(Class pbis : p) System.out.println("Paramétres : " + pbis.getName());

		    System.out.println("----------------------------------\n");	
			
		}
		
	}

}
