import java.util.Arrays;

public class MaxCircularSubArray {
	
	static int naiveMaxSum(int arr[]) {
		
		int n=arr.length;
		System.out.println(n);
		int res=arr[0];
		for(int i=0;i<n;i++) {
			int curr_max=arr[i];
			int curr_sum=arr[i];
			
			for(int j=1;j<n;j++) {
				int index=(i+j)%n;
				System.out.println(index);
				curr_sum+=arr[index];
				curr_max=Math.max(curr_max, curr_sum);
			}
			res=Math.max(curr_max, res);
			
		}
		return res;
	}
	
	//Kadane's Algo
	static int effNormalMaxSum(int arr[]) {
		int n=arr.length;
		int res=arr[0];
		int max=arr[0];
		
		for(int i=1;i<n;i++) {
			max=Math.max(arr[i], arr[i]+max);
			res=Math.max(max, res);
		}
		return res;
	}
	static int effOverallMaxSum(int arr[]) {
		int n=arr.length;
		//normal sum
		int max_Normal=effNormalMaxSum(arr);
		System.out.println(max_Normal);
		if(max_Normal<0) {
			return max_Normal;
		}
		//circular sum
		int arr_sum=0;
		for(int i=0;i<n;i++) {
			arr_sum+=arr[i];
			arr[i]=-arr[i];
		}
		System.out.println(Arrays.toString(arr));
		
		int max_Circular=arr_sum+effNormalMaxSum(arr);
		
		return Math.max(max_Normal, max_Circular);
	}

	public static void main(String[] args) {
		int arr[]= {8,-4,3,-5,4};
		System.out.println(effOverallMaxSum(arr));

	}

}
