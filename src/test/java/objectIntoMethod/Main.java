package objectIntoMethod;

public class Main {

	public static void main(String[] args) {
		//Creating object of the Garage
		Garage garage = new Garage();

		//Creating object of the Car
		Car car1 = new Car("BMW");
		
		//passing refrence of car object to the garage method
		garage.park(car1);
	}

}
