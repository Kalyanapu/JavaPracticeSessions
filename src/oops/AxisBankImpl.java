package oops;

public class AxisBankImpl implements Bank {

	@Override
	public void withdraw(float amount) {
		System.out.println("The Withdraw amount in axis Bank:"+amount);

	}

	@Override
	public void deposit(float amount) {
		System.out.println("The deposited amount in axis Bank:"+amount);

	}

	@Override
	public void balance(float amount) {
		// TODO Auto-generated method stub
		
	}

}
