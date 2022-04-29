package testcases;

class A
{
	public void display()
	{
	 System.out.println("hello");
	}
}
class B extends A
{
	public void display()
	{
		System.out.println("hello world");
	}
}
public class OverRiding {

	public static void main(String[] args) {
		B b = new B();
		b.display();
	}

}
