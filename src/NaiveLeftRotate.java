import java.util.Arrays;

public class NaiveLeftRotate {

	static void leftRotate(int arr[]) {
		int n = arr.length, temp;
		int i = 1;
		temp = arr[0];
		while (i < n) {

			arr[i - 1] = arr[i];
            i++;
		}
		arr[n-1] = temp;
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4,2,1,10 };
		leftRotate(arr);
	}

}
