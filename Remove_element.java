package array;
import java.util.*;

public class Remove_element {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter elements of array");
		
		for(int i = 0; i < n; i++) {
		arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter value to be remove from array");
		int val = sc.nextInt();
		int j = 0;
		for(int i = 0; i < n; i++) {
			if(arr[i]!=val) {
				arr[j]=arr[i];
				j++;
			}
		}
		for(int i = 0; i < j; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
