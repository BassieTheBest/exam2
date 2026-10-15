package problem3;

public class Problem3 {

	public static void main(String[] args) {
		String str = "This is a test";
		char delim = ' ';
		String[] tokens;
		
		tokens = split(str,delim);
		showArray(tokens);
		

	}
	public static void showArray(String[] array) {
		int index;
		
		System.out.printf("[");
		for(index=0;index<array.length;index++) {
			if(index!=0) {
				System.out.printf(",");
			}
			System.out.printf("%s", array[index]);
		}
		System.out.printf("]\n");
	}
	
	public static String[] split(String str, char delim) {
		String[] returnSplit;
		int index;
		int array = 0;
		String temp = "";
		
		for (index = 0; index < str.length(); index++) {
			if (str.charAt(index) != delim) {
				temp += str.charAt(index);
				
			}
			else {
				array++;
				temp = "";
			}
		}
		returnSplit = new String[array + 1];
		array = 0;
		temp = "";
		for (index = 0; index < str.length(); index++) {
			
			if (str.charAt(index) != delim) {
				temp += str.charAt(index);
			}
			else {
				returnSplit[array] = temp;
				temp = "";
				array++;
			}
		}
		returnSplit[array] = temp;
		
		return returnSplit;
	}

}
