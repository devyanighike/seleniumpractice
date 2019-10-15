package practice_examples;
import java.util.ArrayList;

public class ArrayMethods {

	static public void main(String[] args) {
		// TODO Auto-generated method stub
/*ArrayList<String> emp=new ArrayList<>();
emp.add("devyani");
emp.add("dev");
emp.ensureCapacity(20);
System.out.println(emp.get(1).startsWith("de"));
System.out.println(emp);*/


String[] abc= {"DEvyani" ,"is" ,"home" ,"tonite","at","5pm"};
int length = abc.toString().length();
int i=0;
//String[] split =abc[i].toString().chars();
//System.out.print(split);
//int mid = length/2;
for (i=0;i<length-1;i+=1)
{
	System.out.print(abc[i]);
}
int j=0;
	for(j=length-2;j>0;j--)
	{
		System.out.print(abc[j]);
	}
	}
}
