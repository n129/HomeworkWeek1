import java.util.Scanner;

public class LetterValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a letter: ");
		char letter = sc.nextLine().charAt(0);
	
		System.out.println("The value is: " + value(letter));
		sc.close();						
		}
	
	public static int value(char letter) {
		
		int res = (int)letter;
		return res;
		}
}