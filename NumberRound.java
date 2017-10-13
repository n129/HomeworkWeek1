import java.util.Scanner;

public class NumberRound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a decimal number: ");
		double number = sc.nextDouble();
		
		round(number);
		sc.close();
	}
	
	public static void round(double number) {

		int result = (int)Math.round(number);
		System.out.println(result);
	}

}
