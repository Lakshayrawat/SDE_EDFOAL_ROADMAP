package array;
import java.util.*;


public class Rotated_BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter array elements");
		for(int i = 0; i < n;i++) {
		
			arr[i] = sc.nextInt();
			
		}
		
		//Target element - element to be found;
		System.out.println("Enter target element");
		int tar = sc.nextInt();
		int left  = 0 ;
		int right = arr.length-1;
		int flag =0;
		
		 while(left<=right)
	        {
	            int mid = (left+right)/2;

	            if(arr[mid]==tar) {
	            	System.out.println(mid);
	            	flag =1;
	            	return;
	            }
	                
	            
	            else if(arr[mid]>=arr[left])
	            {
	                if(tar<=arr[mid] && tar>=arr[left])
	                    right = mid-1;
	                else
	                    left = mid+1;
	            }
	            else
	            {
	                if(tar>=arr[mid] && tar<=arr[right])
	                    left = mid+1;
	                else
	                    right = mid-1;
	            }
	        }
		 if(flag == 0)
			 System.out.println(-1);
		
	}

}
