package Day10;

public class StaticRefer {
	
	public static void hello()
	{
		System.out.println("World");
	}
	public static void main(String[] args) {
		
		StaticInter si = StaticRefer::hello;
		
		si.demo();
	}
}
