package oops;

public class WrapperClasses {
	

	public static void main(String[] args) {
		int i = 10;
		Integer integer = 20; // Boxing
		Integer integer1 = i; // Boxing S
		System.out.println(Integer.valueOf(i));
		System.out.println(integer1.intValue());
		
		System.out.println(integer.getClass().getSimpleName());

		String s = "500";
		Float b=20.5f;
		System.out.println(b.getClass().getSimpleName());
		int a = Integer.parseInt(s);
		System.out.println(s.getClass().getSimpleName());
		System.out.println(a);

	}

}
