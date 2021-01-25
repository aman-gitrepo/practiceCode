public class StringCombinations {
  public static void main(String[] args) {
    permutation("ab");
  }
  
  public static void permutation(String str) {
    permutation("", str);
  }
  
  
  // recursive method
  private static void permutation(String prefix, String str) {
	  
    int str_len = str.length();
    //if we have iterated whole string then we return
    if (str_len == 0){	
      System.out.println(prefix);
    }
    else {
      for (int i  = 0;  i < str_len;  i++){
    	  //increment prefix with string
    	  String incoming =prefix + str.charAt(i);
    	  permutation(incoming , str.substring(0, i) + str.substring(i+1, str_len));
    	  //permutation(prefix , str.substring(0, i) + str.substring(i+1, str_len));
    	  
      }
    }
  }
}
 