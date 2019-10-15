package practice_examples;

public class NestedForLoop {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
 int[] a= {1,2,4,5,4,7,8,9,10,11,12,6,3,9};
 int length= a.length;
 int i,j;
 for (i=0;i<4;i++)
	 {
	 for(j=0;j<4;j++)
	 	{
		  if(a[i]==a[j])
		  {
		 System.out.print( a[i] + "\n");
		 //break leads to control getting out of the loop
		  }//break;
	 	}
 }
 System.out.print("end of program");
 
}

}


	
}
