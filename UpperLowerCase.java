import java.util.Scanner;

public class UpperLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Write a program to convert every even position to upper case 
		 * and every odd position to lower case. 
		 * eg input "Banana" output :"bAnAnA" 
		 * or input "StLouis" output:"sTlOuIs"*/
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter a string:");
		String a = s.nextLine();
		
		String z = CaseConverter(a);
		System.out.println("Your new string is: " + z);
		s.close();
		
	}
	
	public static String CaseConverter(String a) {
		
		String b = "";
		
		for (int i = 0; i < a.length(); i++) {
			
			if (i % 2 != 0) {
				//b += a.toUpperCase();
				String temp = a.charAt(i) + "";
				b += temp.toUpperCase();
			}else{
				//b += a.toLowerCase();
				String temp = a.charAt(i) + "";
				b += temp.toLowerCase();
			}
			
		}return b;
		
	}
		
}
