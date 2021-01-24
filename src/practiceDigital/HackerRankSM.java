package practiceDigital;

public class HackerRankSM {

	public static void main(String[] args) {
		String s = "chill out";
		System.out.println(new HackerRankSM().encrypt(s));

	}

	private String encrypt(String s) {
		String str1 = "";
		// remove spaces from string
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ')
				continue;
			else
				str1 = str1 + s.charAt(i);
		}

		// nth root int type casted and row column for char matrix
		int strlength = str1.length();
		//System.out.println(strlength);
		int row = (int) Math.sqrt(strlength);
		int column = row+1,k=0;
		if ((row * column) < strlength) {
			row = row + 1;
		}
		System.out.println(row+""+column);
		// convert string to matrix
		char carr[][] = new char[row][column]; 
		for (int i = 0; i < row; i++)  
        { 
            for (int j = 0; j < column; j++)  
            { 	
                if(k < str1.length()) {
                    carr[i][j] = str1.charAt(k); 
                k++; 
                }	
            } 
        }
		//placing matrix back to encrypted string
		String str3="";
		for (int j= 0; j<column; j++)  
        { 
			int m =0;
            for (int i = 0; i <row; i++)  
            {	char cr=carr[i][j];
            	if(m<column&& cr!=0) {
            	str3=str3+carr[i][j]; 
            	}
            	m++;
            }
            str3=str3+' ';
        }
		return (str3.trim());
	}
}
