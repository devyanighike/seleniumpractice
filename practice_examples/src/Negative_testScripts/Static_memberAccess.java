package Negative_testScripts;

public class Static_memberAccess {
	public static void main(String[] args) {
	counter c= new counter();
	c.getCount();
	counter cb= new counter();
	cb.getCount();

	System.out.print(c.count + "\n");
	System.out.print(counter.count);

	}
}
	class counter
	{
	static int count =100;
	
	public int getCount()
	{
		return count++;	
		}

	}
	


