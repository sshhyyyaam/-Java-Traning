package interfaceExample;

public class TestInterface implements Printable{
	

	public char[] msg;
	

	@Override
	public void showData()
	{
		System.out.println("I am using interface");
		
	}
}
