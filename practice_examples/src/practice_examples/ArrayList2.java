package practice_examples;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> list=new ArrayList<String>();
list.add("goa");
list.add("mumbai");
list.add("1");
//System.out.print(list.containsAll(list));
System.out.print(list);
ArrayList<Integer> listnew=new ArrayList<Integer>();
listnew.add(0,10);
listnew.add(1,20);
ArrayList<Serializable> listint=new ArrayList<Serializable>();
listint.ensureCapacity(10);
listint.add(0,20);
listint.add(1,20);
listint.add(2,"devyani");
//System.out.print(listint.contains(listnew));
listint.add(list);
System.out.print(listint);
Iterator<Serializable> i=listint.iterator();
//ListIterator<Serializable> i1=new ListIterator();
//i1.hasPrevious();
Serializable a=i.next();
System.out.println(a);
System.out.println(i.next());



	}

}
