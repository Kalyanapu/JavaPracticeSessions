package oops;

public interface Banks {

	void balance(float amount);

	void withdraw(float amount);
	
	default void iamADefault() {
		System.out.println("in the default method");
	}

}
