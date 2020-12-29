package Searching;

public class IndexOfLastOccInSortedArray {
	
	static int itrFun(int arr[],int x) {
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

	public static void main(String[] args) {
		int arr[]= {5,10,10,10,10,20,20};
		System.out.println(itrFun(arr, 10));

	}

}
