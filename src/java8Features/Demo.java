package java8Features;

public class Demo implements Function, Employee {

	@Override
	public void name() {

	}

	@Override
	public void display() {
		Employee.super.display();
	}

}
