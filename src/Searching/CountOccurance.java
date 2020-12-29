package Searching;

public class CountOccurance {
	
	static int firstOcc(int arr[],int x) {
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
					high= mid-1;
			}
		}
		return -1;
	}

	
	static int lastOcc(int arr[],int x) {
		int n =arr.length;
		int low=0,high=n;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]>x) {
				high=mid-1;
			}
			else if(arr[mid]<x) {
				low=mid+1;
			}
			else {
				if(mid==n-1||arr[mid]!=arr[mid+1]) {
					return mid;
				}
				else {
					return low=mid+1;
				}
			}
		}
		return -1;
		
	}
	
	static int countOcc(int arr[],int x) {
		int indexFirstOcc=firstOcc(arr, x);
		if(indexFirstOcc==-1) {
			return 0;
		}
		else {
			return (lastOcc(arr, x)-indexFirstOcc+1);
		}
	}


	public static void main(String[] args) {
		int arr[]= {10,20,20,20,40,40};
		System.out.println(firstOcc(arr, 20));
		System.out.println(countOcc(arr, 20));

	}

}
