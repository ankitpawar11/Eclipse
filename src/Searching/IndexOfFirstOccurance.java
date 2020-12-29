package Searching;

public class IndexOfFirstOccurance {
	
	static int reccurciveFun(int arr[], int low, int high, int x) {
		
		if(low>high) {
			return -1;
		}
		int mid=(low+high)/2;
		
		if(arr[mid]>x) {
			return reccurciveFun(arr, low, mid-1, x);
		}
		else if(arr[mid]<x) {
			return reccurciveFun(arr, mid+1, high, x);
			
		}
		else {
			if(mid==0 || arr[mid-1]!=arr[mid]) {
				return mid;
			
			}
			else
				return reccurciveFun(arr, low, mid-1, x);
		}
		
	}
	
	static int iterativeFun(int arr[],int x) {
		int low=0, high=arr.length;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]>x) {
				high= mid-1;
			}
			else if(arr[mid]<x) {
				low= mid+1;
			}
			else {
				if(mid==0 || arr[mid-1]!=arr[mid]) {
					return mid;
				}
				else
					return mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[]= {5,10,10,15,20,20,20};
		System.out.println(reccurciveFun(arr, 0, 6, 5));
		System.out.println(iterativeFun(arr, 5));

	}

}
