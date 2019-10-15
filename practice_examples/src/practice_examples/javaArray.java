package practice_examples;


public class javaArray {
	public static void main(String[] args) {
		int[] abc;
		abc=new int[100];
	    abc[0]=10;
	    abc[1]=9;
	    abc[2]=11;
		int i=0;
	for (i=0;i<=100;i++)
{
	if(i==(abc[i]))
		System.out.print("element is present");
		
		else {
			System.out.print(" ");
			System.out.print(i);
		}
	}
}

}