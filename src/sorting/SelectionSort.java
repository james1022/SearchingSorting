package sorting;

public class SelectionSort {

	public static int[] selectionSort(int[] array) {
		
		int min = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}
			swap(array, i, min);
		}
		
		return array;
	}
	
	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static void main(String args[]) {
		int[] a = {3, 5, 2, 7, 4, 9, 1, 8, 6};
		a = selectionSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
}
