package oops;

public class BankTest {

	public static void main(String[] args) {
		Bank bank= new AxisBankImpl();
		bank.deposit(500);
		bank.withdraw(200);
		
		Bank bank1=new CitiBankImp();
		bank1.deposit(50000);
		bank1.withdraw(25000);

	}

}
