package oops;

public class CitiBankImp implements Bank {

	@Override
	public void withdraw(float amount) {
		iamADefault();
		System.out.println("The Withdraw amount in citi Bank:" + amount);

	}

	@Override
	public void deposit(float amount) {
		System.out.println("The Withdraw amount in citi bank:" + amount);

	}

	@Override
	public void balance(float amount) {
		// TODO Auto-generated method stub

	}

	@Override
	public void iamADefault() {
		Bank.super.iamADefault();
	}

}
