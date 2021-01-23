package practiceDigital;
import java.util.*;
public class CheckFirstLast {

	public static void main(String[] args) {
		// To check if letter is there in string of a certain length

		boolean b = false;
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		System.out.println(a.length());
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == 'l') {
				b = true;
				break;
			}
		}

		System.out.println(b);
		s.close();

		// To Check if word is present in given string

//		System.out.println("enter  string");
//
//		Scanner n = new Scanner(System.in);
//		String str = n.nextLine();
//		boolean check = str.contains("help");
//		System.out.println("does this contain string mentioned: " + check);
//		n.close();

		// to check first and last occurence of certain letter in a string

		Scanner n = new Scanner(System.in);
		String str = n.nextLine();
		int len = str.length();
		System.out.println(len);
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == 'a') {
				System.out.println("char first found at" + i);
				break;
			}
		}
		System.out.println(str.lastIndexOf('a'));

	}

}
