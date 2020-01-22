package curso_programacao;

public class Texto {

	// trabalhando com String.
	
	public static void main(String[] args) {
		String s = "potato apple lemon"; 
		String[] vect = s.split(" "); 
		@SuppressWarnings("unused")
		String word1 = vect[0];
		@SuppressWarnings("unused")
		String word2 = vect[1];
		@SuppressWarnings("unused")
		String word3 = vect[2];
		
		String original = "abcde FGHIJ ABC abc DEFG  ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		System.out.println("Original: " + original);
		System.out.println("toLowerCase: " + s01);
		System.out.println("toUpperCase: " + s02);
		System.out.println("Trim: " + s03);
		System.out.println("Substring(2): " + s04);
		
		System.out.println("Substring(2,9) " + s05);
		System.out.println("replace('a','x') " + s06);
		System.out.println("replace('abc','xy') " + s07);
		System.out.println("index of 'bc': " + i);
		System.out.println("Lastindex of 'bc': " + j);
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
	}

}
