import java.util.Scanner;

public class StringManipulation{
	
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
			System.out.println("Please enter your choice in numbers ");
			System.out.println("1. for string comparison");
			System.out.println("2. for string related functions");
			System.out.printf("3. for seeing diff in Integer and int \n");
			System.out.printf("4. for conversion back and fourth to char array and string\n");
		int a = sc.nextInt();
		
		if(a == 1){
		System.out.println("Please enter  two strings one after other :");
				Scanner scb = new Scanner(System.in);
					String strone = scb.nextLine();
					String strtwo = scb.nextLine();
		
		//String equal or not using hashCode() CaseSensitive
		if(strone.hashCode() == strtwo.hashCode()){
			System.out.println("hashcode() response = equal");
		}
		else
		System.out.println("not equal");
		
		//String equal or not using equals() CaseSensitive
		if (strone.equals(strtwo)){
			System.out.println("equals() response = equal");
		}
		else
		System.out.println("not equal");
		
		//String can not be directly compared using == operator as that will compare and find different address to each.
		if (strone == strtwo){
			System.out.println("| == | response = equal");
		}
		else
		System.out.println("not equal");
	
		//String comparison with case ignoring
		if (strone.equalsIgnoreCase(strtwo)){
			System.out.println("equalsIgnoreCase() response = equal");
		}
		else
		System.out.println("not equal");
		}
		
		if(a == 2){
		System.out.println("Please input a test string (Numeric incase u want perform related operations)");
				Scanner scb = new Scanner(System.in);
					String test= scb.nextLine();
					
		//return index of char in string  string.indexOf(searchvalue, start_index)
		System.out.println("Index of a in input string is : " + test.indexOf('a',0));
		
		//tocharArray() conversion
		char[] ch = test.toCharArray();
		for(int i = 0 ; i < ch.length ; i++)
			System.out.println("response to toCharArray : "+ch[i]);
		
		//Convert String to integer using Integer.parseInt(inputString) or Integer.valueOf(inputString)
		int n1 = Integer.parseInt(test);
		int n2 = Integer.valueOf(test);
		System.out.printf("Response from Integer.parseInt(inputString) %d and from Integer.valueOf(inputString) %d  \n",n1,n2);
	}
		
		if(a == 3){
			//Integer vs int
			Integer first   = 300;
			int     second  = 300;
			String  numeric = "300";
			int		third   = Integer.valueOf(numeric);
			// Integer is class and int is primitive data type
			if(first == second && third == second)
				System.out.printf("Integer first=300 int second=300 String  numeric='300' third=Integer.valueOf(numeric) All equal \n");
		}
		
		if(a == 4){
			String test = "This is a test string";
			
			char[]  carr = test.toCharArray();
			String carr_s = String.valueOf(carr) ;
			
			StringBuilder carrstringbuilder = new StringBuilder(); 
			for (int i = 0; i < carr.length; i++) { 
			carrstringbuilder.append(carr[i]); 
			} 
			System.out.printf("Char array is : \n");
			for(int i = 0; i<carr.length ; i++){
				System.out.print(carr[i]);
			}
			System.out.println("");
			System.out.println("String output using String.valueOf(carr):");
			System.out.println(carr_s);
			System.out.println("output using string builder :\n"+ carrstringbuilder);
		}
 }
}