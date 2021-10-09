package array;
import java.util.*;
public class SmallestMissing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0; i < n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(smallMis(arr,n));
		

	}

	private static int smallMis(int[] arr, int n) {
		int i=0;
		while(i<n) {
			if(arr[i] > 0 && arr[i] < n+1 && arr[i] != arr[arr[i]-1]) {
				int temp = arr[arr[i]-1];
				arr[arr[i]-1] = arr[i];
				arr[i] = temp;
			}
			else {
				i++;
			}
		}
		
		for(i = 0; i < n ; i++) {
			if(arr[i] != i+1) {
				return i+1;
			}
		}
		return n;
	}

}
