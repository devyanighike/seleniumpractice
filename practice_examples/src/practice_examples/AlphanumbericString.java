package practice_examples;

public class AlphanumbericString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "1vyani123@abc";
		int i = 0;
		int length= name.length();
		System.out.print(name.indexOf("1") +"\n");
		for (i=0;i<length;i++)
		{
				if(Character.isDigit(name.charAt(i)))
			 {
			 System.out.print(name.charAt(i) + "\n");

			 }
		
		 else if(Character.isLetter(name.charAt(i)))
		 	{
			 System.out.print(name.charAt(i) + "\n");
		 	}
		 else
		 	{
			 System.out.print("its a symbol");
		 	}
		 }
}
}