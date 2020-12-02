
public class LGreatestElementInAnArray {
	
	static int greatestElement(int ar[]){
		int n=ar.length;
		int res=0;
		for(int i=0;i<n;i++) {
			if(ar[i]>ar[res]) {
				res=i;
			}
		}
		
		return res;
		}
	static int secondLargest(int ar[]) {
		int largest=greatestElement(ar);
		int res=-1;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]!=ar[largest]) {
				if(res==-1) {
					res=i;
				}
				else if(ar[i]>ar[res]) {
					res=i;
				}
			}
		}
		return res;
		
		
	}

	public static void main(String[] args) {
		int arr[]= {2,5,50,1,4,8,50};
		System.out.println(secondLargest(arr));

	}

}
