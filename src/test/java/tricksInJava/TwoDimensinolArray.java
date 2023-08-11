package tricksInJava;

public class TwoDimensinolArray {

	public static void main(String[] args) {
		// Storing value in two dimensional array
		String[][] name = new String[][] { { "c", "h" }, { "e", "t" }, { "h", "a" } };

		// Retriving Data from Array
		for (int i = 0; i < name.length; i++) {
			// Run until the row run
			for (int j = 0; j < name[i].length; j++) {
				System.out.print(name[i][j]+" ");
			}
			System.out.println();
		}
	}

}
