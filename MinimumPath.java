package TwoD_Array;
import java.util.*;

public class MinimumPath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of row and column of 2D array");
		int m =sc.nextInt();
		int n =sc.nextInt();
		int arr[][] = new int[m][n];
		for(int i = 0; i < m;i++) {
			for(int j = 0; j < n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}

	
		System.out.println(minPath(arr, 0, 0));
	}

	private static int minPath(int[][] arr,int i,int j) {
		if(i == arr.length-1 && j == arr[0].length-1) {
			return arr[i][j];
		}
		 if(i==arr.length || j==arr[0].length) {
		      return Integer.MAX_VALUE;
		 }
		return arr[i][j] + Math.min(minPath(arr,i+1,j),minPath(arr, i, j+1));
		
	}

}
