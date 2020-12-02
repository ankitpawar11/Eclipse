import java.util.Arrays;

public class NaiveDeleteAnElement {
	
	static int deleteEle(int arr[],int x,int n) {
		int i;
		for(i=0;i<n;i++) {
			if(arr[i]==x)
				break;
			if(i==n)
				return n;
		}
		for(int j=i;j<n;j++) {
			arr[j]=arr[j+1];
		}
		System.out.println(Arrays.toString(arr));
		return n-1;
		
		
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		System.out.println(deleteEle(arr, 3, 4));

	}

}
