package superKeyword;

public class Hero extends Person {

	String name;

	public Hero(String name, int age, String power) {
		super(age, power);
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name = " + name + " " + super.toString();

	}
}
