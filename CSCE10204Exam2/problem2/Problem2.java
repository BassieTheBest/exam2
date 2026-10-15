package problem2;

public class Problem2 {

	public static void main(String[] args) {
		int[] array1 = {1,1,1,1,1};
		int[] array2 = {2,2,2,2,2};
		int[] result;
		
		result = interleave(array1,array2);
		showArray(result);
		

	}
	public static void showArray(int[] array) {
		int index;
		
		System.out.printf("[");
		for(index=0;index<array.length;index++) {
			if(index!=0) {
				System.out.printf(",");
			}
			System.out.printf("%d", array[index]);
		}
		System.out.printf("]\n");
	}
	
	public static int[] interleave(int[] array1, int[] array2) {
		int[] comArray = new int[array1.length + array2.length];
		int endCond = 0;
		int curPlace = 0;
		while (endCond != comArray.length/2) {
			comArray[curPlace] = array1[endCond];
			curPlace++;
			comArray[curPlace] = array2[endCond];
			curPlace++;
			endCond++;
		}
		return comArray;
	}

}
