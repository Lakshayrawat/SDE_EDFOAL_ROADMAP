package array;
import java.util.*;


public class BinarySearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter array in sorted format");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter target value");
		int tar = sc.nextInt();
		
		found(arr,tar);
		

	}

	private static void found(int[] arr, int tar) {
		
		int l = 0;
		int h = arr.length-1;
		
		while(l<h) {
			int mid = (l+h)/2;
			if(arr[mid]==tar) {
				System.out.println("Element found at "+mid );
				return;
			}
			else if(arr[mid]<tar) {
				l=mid+1;
			}
			else {
				h = mid-1;
			}
		}
		System.out.println("element should be inserted at "+ (l+1));
		
	}

}
