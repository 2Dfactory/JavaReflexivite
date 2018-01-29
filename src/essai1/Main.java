package essai1;

public class Main {

	public static void main(String[] args) {
		
		Class c = new String().getClass();
		
		Class[] faces = c.getInterfaces();
		
		System.out.println("Il y a " + faces.length + " interfaces implémentées.");
		
		for(Class f : faces){
			System.out.println(f);
		}
		
	}

}
