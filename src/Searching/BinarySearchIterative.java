package Searching;

public class BinarySearchIterative {
	// For sorted and unsorted array
	static int naiveFun(int arr[], int x) {
		int n = arr.length;
		if (arr[0] == x) {
			return 0;
		}
		for (int i = 1; i < n; i++) {
			if (arr[i] == x) {
				return i;
			}
		}
		return -1;
	}

	// For sorted array
	static int naiveSortedArrayFun(int arr[], int x) {
		int n = arr.length;
		int mid = n / 2;
		if (arr[mid] == x) {
			return mid;
		} else {
			if (arr[mid] > x) {
				for (int i = 0; i < mid; i++) {
					if (arr[i] == x)
						return i;
				}
			} else {
				for (int i = mid; i < n; i++) {
					if (arr[i] == x)
						return i;
				}
			}
		}
		return -1;

	}

	static int effSortedArrayFun(int arr[], int x) {
		int n=arr.length;
		int low=0, high=n-1;
		
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==x) {
				return mid;
			}
			else if(arr[mid]<x) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		int arr[] = { 1, 5, 12, 20, 25 };
		int sarr[] = { 1, 2, 3, 4, 5, 6 };
		System.out.println(naiveFun(arr, 21));
		System.out.println(naiveSortedArrayFun(sarr, 4));
		System.out.println(effSortedArrayFun(sarr, 4));

	}

}
