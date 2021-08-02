package oops;

public class ConstructorChaining {
	int a=10;
	String b="Naveen";
	float c=20.5f;

	public static void main(String[] args) {
		 ConstructorChaining  c=new ConstructorChaining(10);
		 ConstructorChaining  c1=new ConstructorChaining(1, "Naveen");
		 ConstructorChaining  c2=new ConstructorChaining(1,"kumar",20.02f);
		 System.out.println(c.a);
		 System.out.println(c.b);
		 System.out.println(c2.c);
		
	
	}
	public ConstructorChaining(int a) {
		this.a = a;
	}

	public ConstructorChaining(int a, String b) {
		this.a = a;
		this.b = b;
	}

	public ConstructorChaining(int a, String b, float c) {
		this(a,b);
		this.c = c;
	}
	
	}


