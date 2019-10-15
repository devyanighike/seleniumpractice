package practice_examples;

public class Array2Dimentional {
	
	public static void main(String[] args) {

	String[][] abc=new String[2][3];
	abc[0][0]="devyani";
	abc[0][1]="ghike";
	abc[0][2]="pune";

	abc[1][0]="radhika";
	abc[1][1]="Abhinesh";
	abc[1][2]="bangalore";
	
	int i;
	int j;
	for(i=0;i<3;i++)//outer for loop stands for row
	{
		for(j=0;j<3;j++)//inner for column
	{
			//if(i==j)
		System.out.print((abc)[i][j] + "\n" );
		
	}
		
}
}
}
