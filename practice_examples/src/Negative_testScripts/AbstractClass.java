package Negative_testScripts;

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		name obj=new name();
		obj.getName();
	}
	abstract class name
	{
			public void getName()
			{
				System.out.print("hi m devyani");
			}
			public void getAge()
		{
			System.out.print("my age is 30");
		}
	} 
			class devyani extends name
			{
				void name()
				{
					System.out.print(" i am class devyani");
				}
			}
}