package TwoD_Array;
import java.util.*;

public class Rotate90 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row and columns");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int arr[][] = new int[m][n];
		System.out.println("Enter your 2d array");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Before rotation");
		print(arr,m,n);
		rotate(arr,m,n);
		System.out.println("After rotation");
		print(arr,m,n);
		
		
	}

	private static void print(int[][] arr, int m, int n) {

		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	private static void rotate(int[][] arr, int m, int n) {
		
		for(int i = 0; i < m; i++) {
			for(int j = i; j < n; j++) {
	
				int temp = arr[j][i];
				arr[j][i] = arr[i][j];
				arr[i][j] = temp;
				
			}
		}
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n/2; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[i][n-1-j];
				arr[i][n-1-j] = temp;
			}
		}
		
	}

}
