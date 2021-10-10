package array;
import java.util.*;

public class RotatedArray {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter array");
		for(int i = 0; i < size; i++) {
			
			arr[i] = sc.nextInt();
			
		}
		
		System.out.println("Enter value for k :");
		int k = sc.nextInt();
		
		rotate(arr,k);
		for(int i : arr) {
			System.out.print(i+" ");
		}
		
	}

	private static void rotate(int[] arr, int k) {
		
		int len = arr.length;
		k = k%len;
		rev(arr,0,len-k-1);
		rev(arr,len-k,len-1);
		rev(arr,0,len-1);
		
	}
	
	private static void rev(int[] arr, int i, int j) {
		
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
	}
	

}
