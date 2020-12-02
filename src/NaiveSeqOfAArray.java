
public class NaiveSeqOfAArray {
	
	static void seqOfArray(int arr[]) {
		int count=0;
		int n=arr.length;
		int res=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]==res) {
				res=arr[i];
				count++;
			}
			System.out.println("Sequence of" +res +"is"+ +count);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4,2,1,10 };
		seqOfArray(arr);

	}

}
