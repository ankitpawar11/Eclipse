
public class EffSecondLargestInAArray {
	
	static int secondLargest(int ar[]) {
		int res=-1,largest=0;
		
		for(int i=1;i<ar.length;i++) {
			if(ar[i]>ar[largest]) {
				res=largest;
				largest=i;
				
			}
			else if(ar[i]!=ar[largest]) {
				if(res==-1||ar[i]>ar[res]) {
					res=i;
				}
			}
		}
		return res;
		
	}

	public static void main(String[] args) {
		int arr[]= {1,2,4,3};
		System.out.println(secondLargest(arr));
				

	}

}
