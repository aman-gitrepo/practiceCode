import java.util.*;
public class dup{
	public static int[] count(String str){
		int[] a = new int[300];
		
		for(int i=0;i<a.length;i++)
			a[i]=0;
		
			for(int i=0 ; i<str.length(); i++){
			 a[(int)str.charAt(i)]=a[(int)str.charAt(i)]+1;
			}
			return a;
	}
	
	
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int m[]=(count(str));
		for(int i=0;i<m.length;i++)
			if(m[i]>0)
			System.out.println((char)(i)+" : " +m[i]); 
	}
}