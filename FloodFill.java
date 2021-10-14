package TwoD_Array;
import java.util.*;

public class FloodFill {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no. of rows and columns");
		int row = s.nextInt();
		int col = s.nextInt();
		
		int arr[][] = new int[row][col];
		
		System.out.println("Enter your 2d image array");
		for(int i = 0; i < row; i++ ) {
			for(int j = 0; j < col; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		
		System.out.println("Enter source row and column of image");
		int sr = s.nextInt();
		int sc = s.nextInt();
		
		System.out.println("Enter new color");
		int newColor = s.nextInt();
		
		floodFill(arr,sr,sc,newColor);
		
		for(int i = 0; i < row; i++ ) {
			for(int j = 0; j < col; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

	private static void floodFill(int[][] arr, int sr, int sc, int newColor) {
		
		if(arr[sr][sc] == newColor) {
			return;
		}
		    int row = arr.length;
	        int col = arr[0].length;
	        int src = arr[sr][sc];
	        
	        dfs(arr,sr,sc,newColor,row,col,src);
	        return;
	
	}

	private static void dfs(int[][] arr, int sr, int sc, int newColor, int row, int col, int src) {
		 if(sr < 0 || sr >= row || sc < 0 || sc >= col)
	            return;
	        else if(arr[sr][sc] != src)
	            return;
	        
	        arr[sr][sc] = newColor;
	        dfs(arr,sr-1,sc,newColor,row,col,src);
	        dfs(arr,sr+1,sc,newColor,row,col,src);
	        dfs(arr,sr,sc-1,newColor,row,col,src);
	        dfs(arr,sr,sc+1,newColor,row,col,src);
		
	}

}
