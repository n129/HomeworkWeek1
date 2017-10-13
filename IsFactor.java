import java.util.Scanner;

public class IsFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//isFactor
		System.out.println("Welcome!\nPlease enter your first number (divisor): ");
		int k = sc.nextInt();
		
		System.out.println("Please enter your second number (dividend): ");
		int n = sc.nextInt();
		
		boolean factor = isFactor(k, n);
		if (factor == true) {
			System.out.println("These numbers are divisible! " + n + " is divisible by " + k + "!");
		}else {
			System.out.println("These numbers are not divisible. " + n + " is not divisible by " + k + ".");
		}
					
		sc.close();
		
	}

	public static boolean isFactor(int k, int n) {
		boolean result = true;
		
		if (n % k == 0) {
			result = true;
		}
		else {
			result = false;
		}
				
		return result;
	}
	
}
