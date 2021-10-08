package array;
import java.util.*;

public class First_Last {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter array size");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter target value");
		int target = sc.nextInt();
		
		
		
	
		findIndex(arr,target);
		
		
	
	}


	private static void findIndex(int[] arr,int target) {
		int i = 0; 
		int j = arr.length-1;
		int firstIndex = -1;
		int lastIndex = -1;
		while(i<=j) {
			int mid = (i+j)/2;
			if(arr[mid] == target) {
				firstIndex =mid;
				j = mid-1;
			}
			else if(target < arr[mid]){
				j = mid-1;
			}
			else {
				i = mid+1;
			}
		}
		System.out.print(firstIndex+",");
		 i = 0; 
		 j = arr.length-1;
		
		while(i<=j) {
		
			int mid = (i+j)/2;
			if(arr[mid] == target) {
				lastIndex =mid;
				i = mid+1;
			}
			else if(target < arr[mid]){
				j=mid-1;
			}
			else {
				i = mid+1;
			}
		}
		System.out.print(lastIndex);
		
		
	}

}
