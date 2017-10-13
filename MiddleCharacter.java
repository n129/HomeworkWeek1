import java.util.Scanner;

public class MiddleCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to remove the middle character of a string.
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter a word or string to edit: ");
		String a = s.nextLine();
		//There are two different methods I created for this.  Uncomment/comment out the one you like.
		//Method1
		//System.out.println("Your new string is: " + removeMiddle(a));
		//Method2
		rMiddle(a);
			
		s.close();
	}

	public static String removeMiddle(String a) {
		String output = "";

		StringBuilder sb = new StringBuilder(a);
		
		if (a.length() % 2 == 0) {
			
			char even1 = sb.charAt(a.length() / 2 - 1);
			char even2 = sb.charAt(a.length() / 2 - 1);
			
			sb.deleteCharAt(a.length() / 2 - 1);
			sb.deleteCharAt(a.length() / 2 - 1);
			
		}else{
			
			char odd = sb.charAt(a.length() / 2);
			sb.deleteCharAt(a.length() / 2);
				
	}
		output = sb.toString();
		return output;
	}
	
	public static void rMiddle(String a) {
		String output = "";

		StringBuilder sb = new StringBuilder(a);
		
		if (a.length() % 2 == 0) {
			
			char even1 = sb.charAt(a.length() / 2 - 1);
			char even2 = sb.charAt(a.length() / 2 - 1);
			
			sb.deleteCharAt(a.length() / 2 - 1);
			sb.deleteCharAt(a.length() / 2 - 1);
			
			output = sb.toString();
			System.out.println("The letters you removed are: " + even1 + even2 + "\nThe new string is: " + output);
			
		}else{
			
			char odd = sb.charAt(a.length() / 2);
			sb.deleteCharAt(a.length() / 2);
			
			output = sb.toString();
			System.out.println("The letter you removed is: " + odd + "\nThe new string is: " + output);
				
	}
		
	}
}
