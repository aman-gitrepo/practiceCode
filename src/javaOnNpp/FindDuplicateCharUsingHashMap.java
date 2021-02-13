import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicateCharUsingHashMap{
	
	public static void main (String[] args){
		printDuplicateCharacters("Programming");
	}
	
	public static void printDuplicateCharacters(String str){
		char[] c_array = str.toCharArray();
		
		Map<Character , Integer> charMap = new HashMap<Character , Integer>();
		
		for(Character ch : c_array){
			if (charMap.containsKey(ch)){
				
				charMap.put(ch, charMap.get(ch) + 1);
				//mapname.put(key,value) will give values to map --- mapname.get(key) will give value for key
			}
			else{
				charMap.put(ch,1);
			}
		}
		
		Set<Map.Entry<Character , Integer>> entrySet = charMap.entrySet();
		for (Map.Entry<Character, Integer> entry : entrySet) { 
		if (entry.getValue() > 1) { 
		System.out.printf("%s : %d %n", entry.getKey(), entry.getValue()); 
		}
		}
	}
}