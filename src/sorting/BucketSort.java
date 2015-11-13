package sorting;

public class BucketSort {

	public static void bucketSort(int[] array, int maxVal) {
		int[] buckets = new int[maxVal + 1];
		for (int i = 0; i < array.length; i++) {
			buckets[array[i]]++;
		}
		int counter = 0;
		for (int i = 0; i < buckets.length; i++) {
			for (int j = 0; j < buckets[i]; j++) {
				array[counter++] = i;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] a = {3, 5, 2, 7, 4, 9, 1, 8, 6};
		bucketSort(a, 9);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
