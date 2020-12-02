import java.util.Arrays;

public class NaiveReverseAnArray {
	
	static void reverseArray(int arr[]) {
		int high=arr.length-1,low=0;
		int temp;
		while(low<high) {
			temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			high--;
			low++;
		}
		System.out.println(Arrays.toString(arr));
		
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,10};
		reverseArray(arr);

	}

}
