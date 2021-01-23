package practiceDigital;

import java.util.*;

public class WordCountString {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		String str1 = a.nextLine();
		int no_of_space=0;
		for (int i=0;i<str1.length();i++) {
			if(str1.charAt(i)==' ') {
				no_of_space++;
			}
		}
		System.out.println(no_of_space+1);
	
	}
}