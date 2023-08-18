package oop;

public abstract class Abstract {

	double balacne = 50000;

	public abstract double checkBalance();

	public abstract void deposit(double amount);

	public abstract void withdraw(double amount);

	public static void main(String[] args) {
		Abstract_1 ob = new Abstract_1();
		System.out.println(ob.balacne);
		ob.deposit(10000);
		System.out.println(ob.balacne);
		ob.withdraw(50000);
		System.out.println(ob.balacne);
	}
}
