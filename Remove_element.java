//APPROACH
/*To do this problem in O(1) space we use the following approach. In this, first we take input array from user the value that we want to remove. 
After taking the input,we start iterating on the input array and also make a pointer variable that point on the starting element of the array.
Now, while iterating it will check the 'i' element is equal to the val(value to be removed) or not.
If not it will simply put element present at 'j' position to the 'i' and increment j.
But if it is equal then it will not put the 'i' element to 'j' and not increment 'j'.
After doing the full iteration. It will print the element less than jth index.

Basically in this approach we are just replacing the val(value to be removed) with value which is not to be removed.

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
