package essai.field;

import java.lang.reflect.Field;

public class Main {

	public static void main(String[] args) {
		Class c = new String().getClass();

		Field[] m = c.getDeclaredFields();


		System.out.println("Il y a " + m.length + " champs dans cette classe");

		//On parcourt le tableau de méthodes

		for(int i = 0; i < m.length; i++)

		System.out.println(m[i].getName());

	}

}
