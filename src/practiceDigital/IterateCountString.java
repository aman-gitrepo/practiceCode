package practiceDigital;

import java.util.*;
import java.util.Map.Entry;

public class IterateCountString {

	public static void main(String[] args) {

		String str1 = "aabaabbBcddaee";
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		// New hash map creation same as we do in for Scanner

		for (int i = 0; i < str1.length(); i++) {
			String key = str1.charAt(i) + "";

			if (m.containsKey(key))

				m.put(key, m.get(key) + 1);
			// if key found in map (Key which will be equal to char , value will be added
			// with 1 )

			else
				m.put(key, 1);

			// key not found so char will become new key and value will be 1
		}
		//2 KeysetIteration(m);
		
		System.out.println(m);
		
		
		Iterator<Entry<String, Integer>> it = m.entrySet().iterator();		
		
		
		while (it.hasNext()) {
			Map.Entry<String, Integer> m1 = (Map.Entry<String, Integer>) it.next();
			System.out.print(m1.getKey() + "" + m1.getValue());
		}

	}
//2
//	private static void KeysetIteration(HashMap<String, Integer> m) {
//		for(String keys :m.keySet()) {
//			System.out.println(keys+""+m.get(keys));
//		}
//		
//	}

}
