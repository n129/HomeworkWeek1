import java.util.Scanner;

public class MaxMinMedian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome!\nPlease enter your first number: ");
		int a = sc.nextInt();
		
		System.out.println("Please enter your second number: ");
		int b = sc.nextInt();
		
		System.out.println("Please enter your third number: ");
		int c = sc.nextInt();
		
		int max = max3(a, b, c);
		int min = min3(a, b, c);
		double med = median3(max, min);
		System.out.println("The maximum value is: " + max +
				"\nThe minimum value is: " + min +
				"\nThe median is: " + med);
		
		sc.close();
	}
public static int max3 (int a, int b, int c) {
		
		if ((a > b) && (a > c)){
			return a;
		}
	
		else if ((b > a) && (b > c)) {
			return b;
		}
		
		else {
			return c;
		}
		
	}
	
	public static int min3 (int a, int b, int c) {
		
		int min = a;
		
		if (min > b) {
			min = b;
		}
		if (min > c) {
			min = c;
		}
		
		return min;
		
	}
	
	public static double median3(int max, int min) {
	
		return ((min + max)/2);
	}
}
