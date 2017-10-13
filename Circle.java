import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the radius of your circle: ");
		double radius = sc.nextDouble();
				
		System.out.println("Here are the stats for your circle: "
				+ "\nArea = " + area(radius)
				+ "\nCircumference = " + circumference(radius));
		
		sc.close();
	}
	
	public static double area (double radius) {
		return (radius * radius * Math.PI);
	}
	
	public static double circumference (double radius) {
		return (radius * 2 * Math.PI);		
	}

}
