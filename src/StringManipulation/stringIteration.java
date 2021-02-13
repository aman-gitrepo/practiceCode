package StringManipulation;

import java.util.*;

public class stringIteration {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		String str1 = a.nextLine();
		String name = (str1.charAt(0)+". ");
		
		for (int i = 0; i <str1.length(); i++) {
			if (str1.charAt(i) == ' ' && str1.charAt(i + 1) != ' ' && i + 1 < str1.length()) {
				name = (name + str1.charAt(i + 1) + ". ");
				break;
			}

		}
		
		for(int i =str1.length()-1;i>=0;i--) {
			if (str1.charAt(i)==' ') {
				name = (name+str1.substring(i+1));
				break;
			}
			
		}
		System.out.println(name);
	}

}
