import java.util.Arrays;

public class StringCombinationNR {

	public static void main(String[] args) {
		permute("ABC");
	}
	
	

	public static void permute(String str) {
		 
		char[] temp_string = str.toCharArray();
		Arrays.sort(temp_string);
		
		System.out.println("Print first sorted string");
		System.out.println(String.valueOf(temp_string));

		int index = 0;
		int lowest = 0;
		
		while (true) {
			
			
			// Step 2. Rightmost char smallest than its neighbour
			for (int i = 0; i < temp_string.length - 1; i++) {
				if (temp_string[i] < temp_string[i + 1]) {
					lowest = i;
				}
			}

			System.out.println(temp_string[lowest]);
			// index of CHAR1	
			index = lowest;
			
			//Step3. Find the ceiling of the
			
			int j = findCeiling(temp_string, index);
			
			if (j == index)
				break;

			swap(temp_string, index, j);
			String a = String.valueOf(temp_string);
			
			//Step4. Sort the substring
			
			char[] b = a.substring(index + 1).toCharArray();
			Arrays.sort(b);
			a = a.substring(0, index + 1) + String.valueOf(b);
			temp_string = a.toCharArray();
			System.out.println("Print later sorted strings");
			System.out.println(String.valueOf(temp_string));
			}
	}


	public static int findCeiling(char[] temp_string, int index) {
		int k = index;
		char test = temp_string[index];
		while (k < temp_string.length - 1) {
			if (temp_string[index] < temp_string[k + 1]) {
				index = k + 1;
				break;
			}
			k++;
		}
		k = index;
		while (k < temp_string.length - 1) {
			if ((temp_string[index] > temp_string[k + 1]) && (temp_string[k + 1] > test)) {
				index = k + 1;
			}
			k++;
		}
		return index;
	}


	 //Method used for swapping the char
	
	private static void swap(char[] str, int i, int j) {
		char temp_string = str[i];
		str[i] = str[j];
		str[j] = temp_string;
	}
}