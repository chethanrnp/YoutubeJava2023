package objectIntoMethod;

public class ObjectInsideArray {

	public static void main(String[] args) {
		// Creating object of the Car
		Car car1 = new Car("BMW");
		Car car2 = new Car("Audi");
		Car car3 = new Car("Tesla");

		// creating Array of Car Class
		Car[] array = { car1, car2, car3 };
		System.out.println(array[0].name);

	}

}
