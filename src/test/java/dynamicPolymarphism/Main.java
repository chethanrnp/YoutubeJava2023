package dynamicPolymarphism;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// creating Scanner Object
		Scanner scanner = new Scanner(System.in);
		// creating Animal class
		Animal animal;
		System.out.println("What animal do you want");
		System.out.println("(1==Dog) Or (2==Cat)");
		// stroing the number
		int choice = scanner.nextInt();
		if (choice == 1) {
			animal = new Dog();
			animal.speak();
		} else if (choice == 2) {
			animal = new Cat();
			animal.speak();
		} else {
			animal = new Animal();
			System.out.println("Invalid Selection");
			animal.speak();
		}
		// close the Scanner
		scanner.close();
	}

}
