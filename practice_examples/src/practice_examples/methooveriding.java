package practice_examples;

public class methooveriding {

	public static void main(String[] args) {
		
		Apple obj=new Apple();
		//Fruit ob1=new Apple();
		obj.getName("Devyani");
		obj.getQuantity(10);
		//Fruit ft= new Fruit();
		//ft.getQuantity(30);
		
	}
	
}
		// TODO Auto-generated method stub

		class Fruit
		{
			int a;
			String name="Sunita";
			public void getQuantity(int a)
			{
				System.out.print("quantity is" + a);
			}
			public void getName()
			{
				System.out.print("superclass method" + name );
			}
		}
		
		class Apple extends Fruit
		{
			 int b,c;
			public void getQuantity(int a)
			{
				super.getName();

				System.out.print((a+10));
			}
			public void getName(String name)
			{
				String surname="Ghike";
				System.out.print( name + surname);

			}
		}
		



