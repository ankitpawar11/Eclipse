
public class MaxSubArraySum {
	//Kadane's Algo
	static int effSubArraySum(int arr[]) {
		int n= arr.length;
		int currMax=arr[0],Max=arr[0];
		
		for(int i=1;i<n;i++) {
			
			currMax=Math.max(arr[i], arr[i]+currMax);
			if(currMax>Max) {
				Max=currMax;
			}
			
		}
		return Max;
		
	}

	public static void main(String[] args) {
		int ar[]= {-3,8,-2,4,-5,6};
		System.out.println(effSubArraySum(ar));

	}

}
