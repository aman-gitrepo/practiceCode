package practiceDigital;

import java.util.*;

public class HashMapLearn {

	public static void main(String[] args) {
		{

			HashMap<Integer, String > mapname = new HashMap<Integer,String>();
			mapname.put(1, "one");
			mapname.put(2, "two");
			
			System.out.println(mapname.get(1));
//			
//			Iterator<Entry<Integer,String>> itmapname =mapname.entrySet().iterator();
//			while(itmapname.hasNext()) {
//				Map.Entry<Integer, String> iteratemap =itmapname.next();
//				System.out.println(iteratemap.getValue()+""+iteratemap.getKey());
//			} 
			entrysetofmap(mapname);
			// Create an empty hash map 
			
			
			HashMap<String, Integer> map = new HashMap<>(); 
//	        // Add elements to the map 
//	        
	        map.put("vishal", 10); 
	        map.put("sachin", 30); 
	        map.put("vaibhav", 20);
	        map.put("Key", 0);

//	        // Print size and content 
//	        
	        System.out.println("Size of map is:- "+ map.size()); 
//	        
	        System.out.println(map); 
//	        
//	        // Check if a key is present and if 
//	        // present, print value 
//	        
	        if (map.containsKey("vishal")) { 
//	            
	        	Integer a = map.get("vishal"); 
//	            
	            System.out.println("value for key"+" \"vishal\" is:- " + a); 
	        } 

		}			

	}

	private static void entrysetofmap(HashMap<Integer, String> mapname) {
	for(Map.Entry<Integer,String> en: mapname.entrySet()) {
		System.out.println("here it is :"+en.getValue());
	}	
	}
	
}
