
public class NaiveConsecutive1s {

	static int consecutiveOnes(int arr[]) {
		int n = arr.length;
		int res = 0;

		for (int i = 0; i < n; i++) {
			int curr = 0;
			for (int j = i+1; j < n; j++) {
				if (arr[j] == 1)
					curr++;
				else
					break;
			}
			res = Math.max(curr, res);
		
		}
		//System.out.println("Max no. of consecutive 1 is " + res);
		return res;
	}
	static int effConsecutiveOnes(int arr[]) {
		int n=arr.length;
		int count=0;
		int max=0;
		for(int i=0;i<n;i++) {
			
			if(arr[i]==1) {
				count++;
				max=Math.max(max, count);
				
			}
			else
				count=0;
			
		}
		return max;
		
	}

	public static void main(String[] args) {
		int ar[] = { 1, 0, 1, 1, 1, 1, 0, 0, 1, 1 };
		System.out.println(consecutiveOnes(ar));
		System.out.println(effConsecutiveOnes(ar));

	}

}
