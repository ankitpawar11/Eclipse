
public class EffRemoveDupEleFromArray {
	
	static int distinctArray(int arr[]) {
		int res=1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=arr[res-1]) {
				arr[res]=arr[i];
				res++;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int a[]= {10,20,20,30,30};
		System.out.println(distinctArray(a));

	}

}
