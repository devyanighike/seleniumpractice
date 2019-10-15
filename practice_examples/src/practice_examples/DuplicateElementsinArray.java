package practice_examples;

public class DuplicateElementsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int abc[]= new int[7];
abc[0]=2;
abc[1]=3;
abc[2]=2;
abc[3]=4;
abc[4]=5;
abc[5]=3;
abc[6]=5;
int length=abc.length;
int i=0,j;
for(i=0;i<length-1;i++)
{
	for(j=1;j<length-1;j++)
	{
	if((abc[i] == abc[j]) && (i != j))
	{
		System.out.print("duplicate is" + abc[j] + "\n");
	}
}

	}
	}
}
