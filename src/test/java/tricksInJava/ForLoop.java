package tricksInJava;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int row;
		int col;
		String symbol;

		System.out.println("Enter the number of row");
		row = s.nextInt();
		System.out.println("Enter the number of coloumn");
		col = s.nextInt();
		System.out.println("Enter the number of symbol");
		symbol = s.next();

		for (int i = 1; i <= row; i++) {
			System.out.println();
			for (int j = 1; j <= col; j++) {
				System.out.print(symbol + "\t");
			}
		}
	}

}
