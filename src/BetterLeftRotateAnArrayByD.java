import java.util.Arrays;

public class BetterLeftRotateAnArrayByD {
	
	static void leftRotate(int arr[],int d) {
		int n=arr.length;
		int temp[]=new int[d];
		for(int i=0;i<d;i++) {
			temp[i]=arr[i];
			}
		for(int i=d;i<n;i++) {
			arr[i-d]=arr[i];
		}
		for(int i=0;i<d;i++) {
			arr[n-d+i]=temp[i];
		}
		System.out.println(Arrays.toString(arr));
		
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4,2,1,10 };
		leftRotate(arr, 2);

	}

}
