package oop;

public  class Abstract_1 extends Abstract {

	@Override
	public double checkBalance() {
	
		return this.balacne;
	}

	@Override
	public void deposit(double amount) {
	
	this.balacne=this.balacne+amount;	
	}

	@Override
	public void withdraw(double amount) {
		
	 this.balacne=this.balacne-amount;
	}

	
}
