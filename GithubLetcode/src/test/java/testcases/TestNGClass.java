package testcases;

public class TestNGClass
{
	public void test(String s)
	{
		
		for(int i = 0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
	}
	
	public void test1()
	{
		String s = "hello how are you";
		String[] s1 = s.split(" ");
		for(int i = 0;i<s1.length;i++)
		{
		System.out.println(s1[i]);
		}
		
		
	}
	public static void main(String[] args)
	{
		TestNGClass tc  = new TestNGClass();
		tc.test("sheela");
		tc.test1();
	}
	

}
