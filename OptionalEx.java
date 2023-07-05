package Java8;

import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {
		
		Optional<String> op = Optional.of("Male");
		String s1 = "Yes";
		String s2 = null;
		
		//System.out.println(op.empty());
		System.out.println(op.isEmpty());
		System.out.println(op.get());
		System.out.println(op.of(s1));
	}
}
