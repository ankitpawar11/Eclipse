import java.util.Arrays;

public class NaiveMoverZeroToEnd {
	
	static int moveZeroEle(int arr[],int n) {
	    int temp;
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				for(int j=i+1;j<n;j++) {
					if(arr[j]!=0) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
					
					
					System.out.println(Arrays.toString(arr));
				}
				//arr[n]=0;
				System.out.println(Arrays.toString(arr));
			}
				
		}
		
		
		
		//System.out.println(Arrays.toString(arr));
		return n-1;
		}
		
	

	public static void main(String[] args) {
		int arr[]= {1,0,0,10,0};
		moveZeroEle(arr, 4);
	}

}
