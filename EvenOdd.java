import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter a number: ");
	long number = sc.nextLong();
	
	evenOdd(number);
	
	sc.close();
	}
	
	public static void evenOdd(long number) {
		
		if(number % 2 == 0) {
			System.out.println("This number is EVEN");
		}else {
			System.out.println("This number is ODD");
		}
	}

}
