import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter a string: ");
		String original = s.nextLine();
		
		palindromeCheck(original);
				
		s.close();
	}

	public static void palindromeCheck(String original) {
		
		String reverse = "";
				
		for (int i = original.length() - 1; i >= 0; i--) {
		
			reverse += original.charAt(i);
		}
		
		if (original.equals(reverse)){
			System.out.println("This is a palindrome!");
		}else {
			System.out.println("This is not a palindrome...");
		}
					
	}
}
