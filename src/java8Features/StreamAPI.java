package java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamAPI {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 3, 5, 7);
		
		Consumer<Integer>c=new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				
			}
			
		};

		numbers.forEach(j -> System.out.println(j));
	}

}
