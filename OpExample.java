package Day10;

import java.util.Optional;

public class OpExample {

	public static void main(String[] args) {
		String [] str = new String[10];
		Optional<String> cn = Optional.ofNullable(str[4]);
		if(cn.isPresent())
		{
			String lc = str[4].toLowerCase();
			System.out.println(lc);
		}
		else
		{
			System.out.println("String value is not present");
		}
	}
}
