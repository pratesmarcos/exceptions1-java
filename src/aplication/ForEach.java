package aplication;

public class ForEach {

	public static void main(String[] args) {

		String[] vect = new String[] { "maria", "Bob", "Alex" };

		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		System.out.println("---------------------------------------");
		for (String obj : vect) {
			System.out.println(obj);
		}
	}

}
