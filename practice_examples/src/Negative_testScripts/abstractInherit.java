package Negative_testScripts;

public class abstractInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		child1 ch= new child1();
		ch.getAge();
	}}
		class grandParent {
			final int age = 20;
			String address="madhuban nagpur";
			private String name = "Radhika";

			final public void getName() {
				System.out.print(name);
			}

			abstract public void getAge();
		}

		class child1 extends grandParent {
			int age=30;
			String address;
			public void getAddress(String address) {
				System.out.print( address);

				System.out.print("\n" + super.address);
			}
			abstract public void getAge()
			{
			System.out.print(age);
			}
		}

