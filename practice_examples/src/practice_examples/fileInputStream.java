package practice_examples;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class fileInputStream {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream fm = new FileInputStream("C:\\Users\\Devayani\\Desktop\\insurance notes.txt");
System.out.println(fm.read());
FileReader r =new FileReader("C:\\Users\\Devayani\\Desktop\\insurance notes.txt");

BufferedReader bf = new BufferedReader(r);
//System.out.print(bf.readLine() + "\n");
String line;
bf.readLine();
while((line=bf.readLine())!=null)
{
	System.out.print(line + "\n");

}
}
}