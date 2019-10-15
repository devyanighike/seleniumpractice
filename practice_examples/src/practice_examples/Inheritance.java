package practice_examples;

public class Inheritance {

	public static void main(String[] args) {
		
		child ch = new child();
ch.b=50;
System.out.print(ch.b);
ch.getAge();
		ch.getAge(10, "radhika");
		ch.getAge(30);
	}
		
	}
		// TODO Auto-generated method stub
class parent
{
	private int a;
	protected int b=20;
	String name;
	protected int c=50;
	
	public  void getAge()
	{
		a=50;
		System.out.print( "\n"+ (a+c));
		
	}
	protected void getAge(int b,String name)
	{
		System.out.print("\n" + b + "\n" + name);
	}
	
}
class child extends parent
{
  public String a;
  public  void getName(String name)
	{
		System.out.print("\n" + name);
	}
  public  void getAge(int b)
	{
		System.out.print("\n" +b);
	}
	
}

	

