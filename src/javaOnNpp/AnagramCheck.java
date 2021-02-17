import java.util.*;

public class AnagramCheck{
		public static String check(String one , String two){
			one = one.toLowerCase();
			two = two.toLowerCase();
			
			char[] onearr = one.toCharArray();
			char[] twoarr = two.toCharArray();
			
			Arrays.sort(onearr);
			Arrays.sort(twoarr);
			
			one = String.valueOf(onearr);
			two = String.valueOf(twoarr);
			
			if(one.equals(two))
			System.out.printf("Anagram check for input string : true \n");
			else
			System.out.printf("Anagram check for input string : fasle");
			
			return null;
		}
	
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			String str_ = sc.nextLine();
			check(str , str_);
			sc.close();
		}
}