package practiceDigital;

import java.util.*;

public class RecursionLearn {
	
	public int recursive(int n) {
		System.out.println(n);
		if(n==8) //base condition
			return n ;
		
		else
		return recursive(n+1);
	}
	
	public static void main(String args[]) {
		int a = 0;
		System.out.println((new RecursionLearn()).recursive(a));
	}


}