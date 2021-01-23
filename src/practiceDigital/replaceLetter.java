package practiceDigital;
import java.util.*;
public class replaceLetter {
	public static void main(String []args) {
		Scanner a = new Scanner(System.in);
		String str1=a.nextLine();
		String str2="";
		for (int i =0 ; i< str1.length();i++ ) {
			if(str1.charAt(i)=='a'||str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u') {
				continue;
			}
			else
			{
				str2=str2+str1.charAt(i);
				
			}
		}
		System.out.println(str2);
	} 
}
