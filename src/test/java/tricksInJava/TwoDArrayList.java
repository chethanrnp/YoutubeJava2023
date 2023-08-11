package tricksInJava;

import java.util.ArrayList;

public class TwoDArrayList {

	public static void main(String[] args) {
		// Creating 2D Array List
		ArrayList<ArrayList<String>> twoDArray = new ArrayList();
		//Creating car list
		ArrayList<String> carList = new ArrayList<String>();
        carList.add("BMW");
        carList.add("Audi");
        carList.add("KIA");
        //Creating bike list
        ArrayList<String> bikeList = new ArrayList<String>();
        bikeList.add("CBZ");
        bikeList.add("Unicon");
        //Adding all in 2D Array List
        twoDArray.add(carList);
        twoDArray.add(bikeList);
        
        //Retriving all data from 2D Array List
        System.out.println(twoDArray);
      //Retriving BMW from 2D Array List
		System.out.println(twoDArray.get(0).get(0));
        
	}

}
