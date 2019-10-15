package practice_examples;

public class methooverloading {

	public static void main(String[] args) {
		
		Ecosport obj=new Ecosport();
		Car obj1=new Car();
		obj1.getModel("ecooo");
		obj.getAvg(50);
		obj.getAvg(50, 105);
	    obj.getModel("Version1");
	    obj.getModel("version1", "red", 1500000);
		
	}
	
}
		// TODO Auto-generated method stub

		class Car
		{
			int avg;
			String model;
			public void getAvg(int avg)
			{
				System.out.print("quantity is" + avg+ "\n");
			}
			public void getModel(String model)
			{
				System.out.print(model);
			}
		}
		
		class Ecosport extends Car
		{
			 int avg,cc;
			 String model,color;
			 int cost;
			 
			public void getAvg(int avg,int cc)
			{
				System.out.print("average and cc are" + avg + cc +"\n");
			}
			public void getModel(String model,String color,int cost)
			{
				
				System.out.print("\n" + "Model ,cost and color are" + model + color+ cost );

			}
		}
		



