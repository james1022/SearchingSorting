package sorting;

public class QuickSort {

	public static void quickSort(int[] array, int left, int right) {
		int index = partition(array, left, right);
		if (left < index - 1) {
			quickSort(array, left, index - 1);
		}
		if (right > index) {
			quickSort(array, index, right);
		}		
	}
	
	private static int partition(int[] array, int left, int right) {
		int mid = (left + right) / 2;
		while (left <= right) {
			while (array[left] <= array[mid]) {
				left++;
			}
			while (array[right] > array[mid]) {
				right--;
			}
			if (left <= right) {
				swap(array, left, right);
				left++;
				right--;				
			}

		}
		
		return left;
	}
	
	private static void swap(int[] array, int left, int right) {
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}
		
	public static void main(String[] args) {
		int[] a = {3, 5, 2, 7, 4, 9, 1, 8, 6};
		quickSort(a, 0, a.length - 1);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
		
}
