package searching;

public class BinarySearch {
	
	public static int binarySearch(int[] array, int target) {
		return binarySearch(array, target, 0, array.length - 1);
	}
	
	private static int binarySearch(int[] array, int target, int start, int end) {
	
		if (start < end) {
			int midIndex = (start + end) / 2;
			if (target == array[midIndex]) {
				return midIndex;
			} else if (target < array[midIndex]) {
				return binarySearch(array, target, start, midIndex);
			} else {
				return binarySearch(array, target, midIndex + 1, end);
			}
		}
		return -1;
	}
	
	
	
	
	public static void main(String[] args) {
		int[] a = {1, 2, 4, 6, 7, 9, 13, 15, 17, 20, 24, 26};
		System.out.println(binarySearch(a, 9)); //5
	}
}
