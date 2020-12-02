import java.util.Arrays;

public class EffMoveZeroToEnd {
	
	static void moveZero(int arr[]) {
		int n=arr.length;
		int count=0,temp;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				temp=arr[i];
				arr[i]=arr[count];
				arr[count]=temp;
				count++;
			}
			
		}
		System.out.println(Arrays.toString(arr));
		
	}

	public static void main(String[] args) {
		int arr[]= {1,0,0,10,0,12,1,2 };
		moveZero(arr);

	}

}
