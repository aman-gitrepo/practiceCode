package practiceDigital;

public class Recursionfactorial {
		public int fact(int num) {
			
			if(num<=0)
				return 1;
			else
				return (num*fact(num-1));
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((new Recursionfactorial().fact(5)));
	}
}
