import java.util.*;

public class PalindroneCheck{
	public static String check(String str){
		str = str.replaceAll(" ",""); 
		String revstr = "";
		char[] sarr = str.toCharArray();
		for(int i = (str.length())-1 ; i>=0;i--)
			revstr= revstr + sarr[i];
		
		//System.out.printf(revstr);
		
		if(revstr.equals(str))
			System.out.printf("true");
		return null;
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String test = sc.nextLine();
		check(test);
		
	}
}