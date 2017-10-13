import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a year: ");
		int year = sc.nextInt();
		
		checkYear(year);
		sc.close();		
	}
	
	public static void checkYear(int year) {

		if (year % 4 == 0) {
			System.out.println("This is a leap year!");
		}else{
			System.out.println("This is not a leap year...");
		}
		
	}

}
