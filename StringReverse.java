import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to reverse a word. eg input "Java" output "avaJ"
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter a string: ");
		String a = s.nextLine();
		
		reverse(a);
		s.close();
	}
	
	public static String reverse(String a) {
		
		char[] newArray = a.toCharArray();
			
		for (int i = newArray.length - 1; i >= 0; i--) {
			System.out.print(newArray[i]);
		
		}
		return (newArray.toString());
	}

}
