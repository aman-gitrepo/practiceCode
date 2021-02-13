package StringManipulation;

import java.util.*;
public class StringOmission {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String str= sc.nextLine();
		System.out.println(omission(str));
	}
	
	public static String omission(String s) {
		String st="";
		st=s.replaceAll("56","");
		st=st.replaceAll("7", "");
		st=st.replaceAll("\\s", "");
		return st;
	}
	
	
	
}