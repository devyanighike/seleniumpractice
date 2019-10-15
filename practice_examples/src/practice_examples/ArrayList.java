package practice_examples;

import java.util.Arrays;
import java.util.Collections;
public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] name = {"devyani","radhika","janhavi","sonam","sumita"};
//converting array to arrayList
ArrayList Arr=new ArrayList();
//Collections.addAll(Arr, name);
int length = name.length;
int i;
for(i=0;i<length;i++)
{
		System.out.println(name[i]);
		i++;
		int size=name[i].length();
		
String name1=name[i];
int j;
for(j=length-1;j>0;j--)
{
	System.out.println(name1.charAt(j));
}

}
}
}	
