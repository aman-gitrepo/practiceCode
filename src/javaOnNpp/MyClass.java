import java.util.*;
public class MyClass{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		String output="";
		output =str.replaceAll("56","");
		output = output.replaceAll("7","");
		System.out.println(output);
	}
}