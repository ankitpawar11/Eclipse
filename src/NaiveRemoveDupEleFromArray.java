import java.util.Arrays;

public class NaiveRemoveDupEleFromArray {
	
	 static int distinctSize(int arr[],int n) {
		//int n =arr.length-1;
		int temp[]=new int[n];
		int res=1;
		temp[0]=arr[0];
		for(int i=1;i<n;i++) {
			if(temp[res-1]!=arr[i]) {
				temp[res]=arr[i];
				res++;
			}
			
		}
		System.out.println(Arrays.toString(temp));
		for(int i=0;i<res;i++) {
			arr[i]=temp[i];
		}
		System.out.println(Arrays.toString(arr));
		return res-1;
		
		
		
	}

	public static void main(String[] args) {
		int a[]= {10,10,1,2,3,4,4};
		System.out.println(distinctSize(a, 6));

	}

}
