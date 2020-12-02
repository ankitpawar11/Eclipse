
public class NaiveArrayIsSorted {
	
	static boolean isSorted(int arr[]) {
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int arr[]= {4,3,2,1};
		System.out.println(isSorted(arr));

	}

}
