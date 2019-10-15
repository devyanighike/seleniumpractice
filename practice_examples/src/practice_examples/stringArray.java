package practice_examples;

public class stringArray {

	public static void  main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "dtvewrw";
		String str2 = "gtewrww";
		int len=str1.length();
		int i=0,j=0;
		for(i=0;i<len;)
		{
       if(str1.charAt(i)==(str2.charAt(j)))
       {
    	   System.out.print(str1.charAt(i));
       }
       else
       {
    	   return;     
}
       i++; 
       j++;
  }
}
}