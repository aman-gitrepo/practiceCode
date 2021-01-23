package practiceDigital;

public class RecursionSumOfDigits {

	public int recursivesum(int num) {
		int a=0;
		if(num==0)
			return 0;
		else
	    a=num%10+(recursivesum(num/10));
		return a;
	}
	
	public static void main(String[] args) {
		
	System.out.println(new RecursionSumOfDigits().recursivesum(1253));
	}

}
