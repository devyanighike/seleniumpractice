package practice_examples;

import net.bytebuddy.asm.Advice.Exit;

public class ForLoop {

	public static void  main(String[] args) {
		// TODO Auto-generated method stub
 int[] a= {1,2,4,5,6};
 int length= a.length;
 int i;
 for (i=0;i<length;i++)
	 
 {
	 if(a[i]<=2)
	 {
		 System.out.print( a[i] + "\n");
		 //break leads to control getting out of the loop
		 //break;
	 }
 }
 System.out.print("end of program");
 
}

}

