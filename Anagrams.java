package stringQ;
import java.util.*;

public class Anagrams {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of String array");
		int n = sc.nextInt();
		
		String str[] = new String[n];
		System.out.println("Enter strings ");
		for(int i = 0; i < n; i++) {
			str[i] = sc.next();
		}
		
		System.out.println(anagramList(str));
		
		
	}

	private static List<List<String>> anagramList(String[] str) {
		
		HashMap<String,List<String>> map = new HashMap<>();
		
		for(String s : str) {
			
			char[] ca = s.toCharArray();
			Arrays.sort(ca);
			String sortCA = new String(ca);
			
			if(!map.containsKey(sortCA)) {
				map.put(sortCA,new LinkedList<String>());
			}
			map.get(sortCA).add(s);
			
		}
		return new LinkedList(map.values());
		
	}
	
	
}
