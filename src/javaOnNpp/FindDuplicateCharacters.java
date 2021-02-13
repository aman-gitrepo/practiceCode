import java.util.*;
public class FindDuplicateCharacters{
	public static char[] count(String str){
		char[] a = new char[10];
		int n = 0;
			for(int i=0 ; i<str.length(); i++){
				for(int j=i+1;j<str.length(); j++){
					 if  ((str.charAt(i)) == (str.charAt(j))){
						a[n]=str.charAt(i);
						n=n+1;
					}
				}
			}
			return a;
	}
	
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(count(str));
	}
}