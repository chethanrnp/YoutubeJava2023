package tricksInJava;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name = "";
        //while loop get exicuted until it get false condition
		while (name.isBlank()) {
			System.out.print("Enter the name!");
			name = s.nextLine();
		
		}

		System.out.println("Welcome " + name);
	}

}
