package file;

import java.io.File;

public class Main {

	public static void main(String[] args) {

		// creating object of File
		File file = new File(".\\src\\test\\resources\\github.txt");

		if (file.exists()) {
			System.out.println("That file Exists");
			// gets path of the file
			System.out.println(file.getPath());
			// gets the absolute path of the file
			System.out.println(file.getAbsolutePath());
			// delete the file
			file.delete();
		} else {
			System.out.println("That file does not Exists");
		}
	}

}
