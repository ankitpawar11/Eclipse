
public class SlidingWindow {

	static int naiveFun(int arr[], int k) {
		int n = arr.length;
		int max_sum = 0;
		for (int i = 0; i + (k - 1) < n; i++) {
			int sum = 0;
			for (int j = 0; j < k; j++) {
				sum += arr[i + j];
				max_sum = Math.max(max_sum, sum);
			}
		}

		return max_sum;
	}

	static int effFun(int arr[], int k) {
		int n = arr.length;
		int cur_sum = 0;
		for (int i = 0; i < k; i++) {
			cur_sum += arr[i];
		}
		int max_sum = cur_sum;

		for (int i = k; i < n; i++) {
			cur_sum += (arr[i] - arr[i - k]);
			max_sum = Math.max(max_sum, cur_sum);
		}
		return max_sum;

	}
	
	//Works for non negative integer array
	static boolean withoutWindowFun(int arr[],int sum) {
		int n=arr.length;
		
		int cur_sum=arr[0], s=0;
		
		for(int e=1;e<n;e++) {
			//clean the previous window
			while(cur_sum>sum && s<e-1) {
				cur_sum-=arr[s];
				s++;
			}
			if(cur_sum==sum) {
				return true;
			}
			if(e<n) {
				cur_sum+=arr[e];
			}
		}
		return (cur_sum==sum);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 8, 30, -5, 20, 7 };
		int ar[]= {1,4,20,3,10,5};
		System.out.println(naiveFun(arr, 3));

		System.out.println(effFun(arr, 3));
		
		System.out.println(withoutWindowFun(ar, 33));

	}

}
