import java.util.HashMap;
import java.util.Map;

public class Test {
	
	public static void main (String args[]) {
		
		Map<String,Integer> map = null;
//				new HashMap<String,Integer>();
		if(map!=null) {
		
		map.put("b", 2);
		map.put("c", 3);
		
		map.put("a", 4);

		map.put("b", 5);

		map.put("c", 6);
		
		map.put("A", 8);

		map.put("B", 9);

		map.put("C", 10);
		
		for(Map.Entry<String,Integer> entry : map.entrySet() ) {
			System.out.println(entry.getValue());
		}
		}
	}

}
