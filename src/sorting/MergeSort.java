package sorting;

public class MergeSort {

	public static void mergeSort(int[] array) {
		int[] helper = new int[array.length];
		mergeSort(array, helper, 0, array.length - 1);
	}
	
	private static void mergeSort(int[] array, int[] helper, int start, int end) {
		if (start < end) {			
			int mid = (start + end) / 2;
			mergeSort(array, helper, start, mid);
			mergeSort(array, helper, mid + 1, end);
			merge(array, helper, start, mid, end);
		}
	}
	
	private static void merge(int[] array, int[] helper, int start, int mid, int end) {
		
		for (int i = 0; i <= end; i++) {
			helper[i] = array[i];
		}
		
		int low = start;
		int high = mid + 1;
		int curr = low;
		
		while (low != mid + 1 && high != end + 1) {
			if (helper[low] <= helper[high]) {
				array[curr++] = helper[low++];
			} else {
				array[curr++] = helper[high++];
			}
		}

//		int remaining = mid - low;
//		for (int i = 0; i <= remaining; i++) {
//			array[curr++] = helper[low + i];
//		}
		
		while (low != mid + 1) {
			array[curr++] = helper[low++];
		}
		

	}

	public static void main(String[] args) {
		int[] a = {3, 5, 2, 7, 4, 9, 1, 8, 6};
		mergeSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
