package TwoDoubles;
import java.util.Scanner;

public class TwoDoubles {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number of tries needed");
		int num = scan.nextInt();
		
		System.out.println("\nPlease enter a string");
		for (int i = 0; i < num; ++i) {
			String word = scan.next();
			
			boolean h = twoDoubles(word);
			System.out.println(h + "\n");
			
		}
		
	}
	
	public static boolean twoDoubles(String s) {
		
		int p = s.length();
		boolean result = false;
		
		for (int i = 0; i < p; ++i) {
			
			char t = s.charAt(i);
			int k = i + 1;
			
			if (k >= p) {
				
				break;
			}
			
			
			if (t == s.charAt(k)) {
				result = true;
			}
			
		}
		
		return result;
	}

}
