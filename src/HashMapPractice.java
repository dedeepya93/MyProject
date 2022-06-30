import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

	public static void main(String[] args) {
		// put , get, remove, removeAll, entrySet
//		Map<Integer, String> map = new HashMap<Integer, String>();
//		map.put(0, "a");
//		map.put(1, "b");
//		map.put(0, "c");
//		
//		for(Map.Entry entry : map.entrySet()){
//			System.out.println(entry.getKey()+","+entry.getValue());
//		}
//		map.remove(0,"a");
//		
//		for(Map.Entry entry : map.entrySet()){
//			System.out.println(entry.getKey()+","+entry.getValue());
//		}
//		System.out.println(map.get(2));
		
		
		
		//count occurences of each character
		String s= "hello world";
		char[] sChar=s.toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(char c : sChar){
			if(!(map.containsKey(c))){
				map.put(c, 1);
			}
			else{
				map.put(c, map.get(c) +1);
			}
		}
		for(Map.Entry entry : map.entrySet()){
			System.out.println(entry.getKey() +":" +entry.getValue());
		}
		
	}
}
