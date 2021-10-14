package stringQ;
import java.util.*;

public class LongestCommonPrefix {

	public static void main(String[] arg) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of String array");
		int n = sc.nextInt();
		
		String[] str = new String[n];
		
		System.out.println("Enter strings");
		for(int i = 0; i < n; i++) {
			str[i] = sc.next();
		}
		
		System.out.println(lcp(str));
		
		
	}
	
	private static String lcp(String str[]) {
		
		   
        String prefix = "";
        if(str == null || str.length == 0){
            return prefix;
        }
   
        int index = 0;
        
        for(char c : str[0].toCharArray()){
            for(int i = 1; i < str.length; i++){
                if(index >= str[i].length() || c != str[i].charAt(index)){
                  return prefix;  
                }
                 
            }
            prefix += c;
            index++;
            
           
        } 
        
        return prefix;
		
	}
	
}
