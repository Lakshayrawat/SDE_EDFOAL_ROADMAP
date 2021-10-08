package array;

import java.util.*;

public class Contiguous_SubArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter array");
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		maxSubSum(arr);

	}

	private static void maxSubSum(int[] arr) {
		
		int max = arr[0];
		int currMax = 0;
		for(int i =0; i < arr.length; i++) {
			currMax += arr[i]; 
			max = Math.max(max, currMax);
			
			if(currMax<0) {
			currMax = 0;
			}
		
		}
		System.out.println(max);
		
	}

}
