package StringManipulation;

import java.util.Arrays;

public class StringFunctions {
public static void main(String []args)
{
	String m="Hello 56 97 239 i know klk";
	
	//System.out.println(new StringBuilder(m) . reverse() .toString());
	//String f=g+"dwdwd"; // to convert to string
	/*
	 * System.out.println(f);
	 * 
	 * System.out.println(m.replaceAll("el", "f")); //takes string input
	 * 
	 * System.out.println(m.replace('e','g'));//take character input
	 * 
	 * System.out.println(m.replaceAll("\\s", ""));// we use \\s to remove space
	 * 
	 * [a-z]{3}
	 */  
	
	String aks[]=new String[30];
	int a=Integer.MIN_VALUE;
	String j[]=m.split("\\s");//split using space as delimiter
	
	
	for(String u:j)
	{
		if(u.matches("[0-8]*")){
				{
			int temp=Integer.parseInt(u);
			if(temp>a)
				a=temp;
				}
			
		}
	}
	System.out.println(a);
	
	/*Arrays.sort(num);
	System.out.println(num[num.length-1]);
	*/
	/*
	 * if("Aman".contains("ma")) 
	 * { System.out.println("no"); }
	 * 
	 * if("Aman".equalsIgnoreCase("aman")) { System.out.println("hi"); }
	 * if("Aman".compareToIgnoreCase("aman")==0) { System.out.println("byw"); }
	 * 
	 * System.out.println((char)67);
	 */
	}
}