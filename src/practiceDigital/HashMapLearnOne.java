package practiceDigital;
import java.util.*;
import java.util.Map.Entry;

public class HashMapLearnOne {

	public static void main(String[] args) {
		String str="aaa bbb ddd aaa";
		HashMap<String,Integer> map = new HashMap<String,Integer>(); 
			
		for(int i=0;i<str.length();i++) {
			if (str.charAt(i)!=' ') {
			String mapKey = str.charAt(i)+"";
			if(map.containsKey(mapKey)){
				map.put(mapKey,(map.get(mapKey)+1));
			}
			else
			map.put(mapKey,1);
		} 
		}
	System.out.println(map);
	Iterator<Entry<String,Integer>> en = map.entrySet().iterator();
	while(en.hasNext()) {
		Map.Entry<String,Integer> emap = en.next();
		System.out.println(""+emap.getValue());
	}
}	
}
