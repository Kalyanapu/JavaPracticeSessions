package oops;

public class StaticTest {

	public static void main(String[] args) {
		StaticDemo sd=new StaticDemo();
		StaticDemo sd1=new StaticDemo();
		StaticDemo sd2=new StaticDemo();
		
		sd.method();
		sd1.method();
		sd2.method();
	
		System.out.println(sd.n);
		System.out.println(sd1.n);
		System.out.println(sd2.n);
		

	}

}
