import java.util.Arrays;

public class EffLeftRotateAnArrayByD {

	static void reverse(int arr[], int low, int high) {
		int temp;
		while (low < high) {
			temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}

	}

	static void leftRotate(int arr[], int d) {
		int n = arr.length;
		reverse(arr, 0, d-1);
		reverse(arr, d, n-1);
		reverse(arr, 0, n-1);
		System.out.println(Arrays.toString(arr));
		
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4,2,1,10 };
		leftRotate(arr, 3);

	}

}
