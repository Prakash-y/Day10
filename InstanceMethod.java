package Day10;

@FunctionalInterface

public interface InstanceMethod {
  void display();
}
 class MethodRefer
{
	public void demo()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args) {
	MethodRefer mr = new MethodRefer();
		InstanceMethod im = mr::demo;
		im.display();
	}
}
