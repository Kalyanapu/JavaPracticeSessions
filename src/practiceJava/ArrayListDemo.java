package practiceJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Naveen");
		names.add("kalyanapu");
		names.add("Dhoni");
		names.add("Mahi");
		System.out.println(names);
		List<String> tool = Arrays.asList("bat", "ball");
		names.addAll(tool);
		System.out.println(names);

	}

}
