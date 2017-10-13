import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter the base for your triangle: ");
	double base = sc.nextDouble();
	
	System.out.println("Please enter the height for your triangle: ");
	double height = sc.nextDouble();
	
	double result = area(base, height);
	
	System.out.println("The area of your triangle is: " + result);
	
	sc.close();
	}
	
	public static double area(double base, double height) {
		return (0.5 * base * height);
	}

}
