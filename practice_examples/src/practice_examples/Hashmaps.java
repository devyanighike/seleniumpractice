package practice_examples;
import java.util.HashMap;
import java.util.Map;
public class Hashmaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String, String> map=new HashMap<String, String>();
map.put("1", "abc");
map.put("2", "def");
map.put("1", "abc");
map.remove("1");
System.out.print(map.get("2"));

	}

}
