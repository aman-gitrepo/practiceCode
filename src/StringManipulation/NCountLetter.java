package StringManipulation;

import java.util.*;

public class NCountLetter {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		String str1 = a.nextLine();
		int C_letter = 0;
		int C_number = 0;
		int C_special=0;
		for (int i = 0; i < str1.length(); i++) {
			if ((str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z') || (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z')) {
				C_letter++;
			} else if (str1.charAt(i)>='0' && str1.charAt(i)<='9')
				C_number++;
			else 
				C_special++;
				
		}
		System.out.println(C_letter + " " + C_number+" "+C_special);
	}
}