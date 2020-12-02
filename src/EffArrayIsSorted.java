
public class EffArrayIsSorted {
	
	static boolean isSorted(int arr[]) {
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<arr[i-1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int ar[]= {1,2,3,4,8,6};
		System.out.println(isSorted(ar));
	}

}
