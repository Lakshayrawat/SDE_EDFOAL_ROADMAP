package stringQ;
import java.util.*;

public class ValidParenthesis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string");
		String s = sc.next();
		System.out.println(isValid(s));
		
		
		
	}

	private static boolean isValid(String s) {
		
		Stack<Character> st = new Stack<>();
		int n = s.length();
		
		for(int i =0; i < n; i++) {
			char c = s.charAt(i);
			if(c == '(') {
				st.push(')');
			}
			else if(c == '[') {
				st.push(']');
			}
			else if(c == '{') {
				st.push('}');
			}
			else if(st.isEmpty() || st.pop() != c){
				return false;
			}
			
		}
		return st.isEmpty();
		
	}

}
