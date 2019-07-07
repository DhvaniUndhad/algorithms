
public class BinarySearch {

	public static void main(String[] args) {

		int s = 78;
		int[] input = { 1, 3, 7, 10, 23, 35, 39, 55, 77, 100, 135, 166, 203, 245 };
		System.out.println(binary(input, s));
	}

	public static int binary(int[] a, int ss) {
		int low = 0;
		int high = a.length - 1;
		
		while (low <= high) {
			int mid = (low + high) / 2;
			if (a[mid] == ss)
				return mid;
			else if (a[mid] < ss)
				low = mid + 1;
			else if (a[mid] > ss)
				high = mid - 1;
		}
		return -1;
	}

}
