package practice_examples;

public class StringREverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	String sen= "devayani";
		int length= sen.length();
		for (int i=length-1;i>=0;i--)
			System.out.print(sen.charAt(i));*/
		
		String[] str= { "dev","rad","son","bun","cut","but","que"};
		int i=0;
		int Length= str.length;
		for (i=0;i<Length;i++)
			
		{
			if(str[i].contains("e"))
			{
				System.out.print(str[i] + "\n");
			}
		
		}
}
}