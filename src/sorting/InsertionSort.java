package sorting;

public class InsertionSort {

	public static void insertionSort(int[] array) {
		
		for (int i = 1; i < array.length; i++) {
			int curr = array[i];
			int j;
			for (j = i - 1; j >= 0 && curr < array[j]; j--) {
				array[j + 1] = array[j];
			}
			array[j + 1] = curr;
		}
		
	}
	
	
	public static void main() {
		int[] a = {3, 5, 2, 7, 4, 9, 1, 8};
		insertionSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	
}
