package tricksInJava;

public class PrintF {

	public static void main(String[] args) {
		// To add any thing in a statement place '%' where it has to be added
		boolean b = true;
		char c = 'c';
		String s = "Chethan";
		int d = 123;
		double f = 100;

		// print boolean use %d
		System.out.printf("Ple add %b", b);
		// print char use %c
		System.out.printf("Ple add %c", c);
		// print String use %s
		System.out.printf("Ple add %s", s);
		// print int use %d
		System.out.printf("Ple add %d", d);
		// print int use %f
		System.out.printf("Ple add %f", f);
		//to give gap use %number
		System.out.printf("Ple add %10s", s);
	}
}
