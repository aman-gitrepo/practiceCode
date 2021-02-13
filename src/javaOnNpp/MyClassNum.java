import java.util.*;
public class MyClassNum {
	public static int multiply(int n){
		int  result=1;
		int num = 0;
		
		while(n !=0) {
			num=n%10;
			result=result*num;
			n=n/10;
		}
		
		return result;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(multiply(num));
		sc.close();
	}
	
} 