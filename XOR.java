import java.util.Scanner;

public class XOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the first value - true or false?");
		boolean d = sc.nextBoolean();
		System.out.println("What is the second value - true or false?");
		boolean e = sc.nextBoolean();
		
		boolean res = xor(d, e);
		System.out.println("This set of statements are " + res);
		
		sc.close();
	}

	public static boolean xor(boolean d, boolean e) {
		boolean result = true;
		
		if ((d == true) && (e == true)) {
			result = false;
		}else if ((d == true) && (e == false)) {
			result = true;
		}else if ((d == false) && (e == true)) {
			result = true;
		}else if ((d == false) && (e == false)) {
			result = false;
		}

		return result;
	}
}
