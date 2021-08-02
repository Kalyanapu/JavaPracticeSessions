package oops;

public class DerivedClass extends FinalDemo {
	
	@Override
	void displayX() {
		System.out.println("in the derived class");
	}

	public static void main(String[] args) {
		FinalDemo f=new FinalDemo();
		System.out.println(f.x);

	}

}
