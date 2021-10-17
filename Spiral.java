package TwoD_Array;
import java.util.*;

public class Spiral {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rows and columns");
		int r = sc.nextInt();
		int c = sc.nextInt();
		int arr[][] = new int[r][c];
		
		System.out.println("Enter your array");
		
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				arr[i][j]  = sc.nextInt();
			}
		}
		System.out.println(spiralOrder(arr));
		
	}
private static List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> result = new ArrayList<>();
        int minR = 0;
        int minC = 0;
        int maxR = matrix.length-1;
        int maxC = matrix[0].length-1;
        
        int n = (maxR+1) * (maxC+1);
        int count =0;
        System.out.println(n);
        while(count <n){
            
         //top wall
            System.out.println("top wall");
          for(int j = minC; j <= maxC && count <n; j++){
              
              result.add(matrix[minR][j]);
              count++;
              
          } 
            minR++;
            
         //right wall
             System.out.println("right wall");
           for(int i = minR; i <= maxR && count <n;i++){
               
               result.add(matrix[i][maxC]);
               count++;
           } 
            maxC--;
            
         //bottom wall
             System.out.println("bottom wall");
             for(int j = maxC; j >=minC && count <n;j--){
                 
              result.add(matrix[maxR][j]);
                 count++;
                 
           } 
          maxR--;
            
         //left wall   
             System.out.println("left wall");
               
          for(int i = maxR;i >=minR && count <n; i--){
              
              result.add(matrix[i][minC]);
              count++;
              
          }
            
            minC++;
           
            
            
        }
        
        return result;
        
         
    }

}
