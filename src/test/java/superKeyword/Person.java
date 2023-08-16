package superKeyword;

public class Person {

	int age;
	String power;

	public Person(int age, String power) {

		this.age = age;
		this.power = power;
	}

	//overriding to string
	@Override
	public String toString() {

		return "Age = " + age + " Power = " + power;
	}
}
