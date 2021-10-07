package array;
import java.util.*;

public class pairSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter array");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter target :");
		int target = sc.nextInt();
		
/*		Approach-1 -->O(n^2) time complexity
//		for(int i = 0; i < n-1; i++) {
//			for(int j = i+1; j <n; j++ ) {
//				if(arr[i]+arr[j] == target) {
//					System.out.println(i+","+j);
//					return;
//				}
//			}
		}*/
		
		
	//Approach 2 - O(nlogn) time Complexity;
	/*	Arrays.sort(arr);
		int i = 0,j = arr.length-1;
		while(i < j) {
			if(arr[i]+arr[j] == target) {
				System.out.println(i+","+j);
				break;
			}
			else if(arr[i]+arr[j] < target) {
				i++;
			}
			else {
				j--;
			}
		}*/

	//Approach 3 - O(n)
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0; i < n; i++) {
			if(!map.containsKey(target-arr[i])) {
				map.put(arr[i], i);
			}else {
				System.out.println(map.get(target-arr[i])+""+i);
				break;
			}
		}
	}

}
