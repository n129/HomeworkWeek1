import java.util.Scanner;

public class AddDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a number: ");
		int number = sc.nextInt();
		
		System.out.println("The new number is: " + decimal(number));
		
		sc.close();
	}
	
	public static double decimal(int number) {
		double last = (int)number;
		return last;
	}

}
