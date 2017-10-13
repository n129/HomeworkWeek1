import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter a string: ");
		String input = s.nextLine();
		
		int number = vowelCounter(input);
		
		System.out.println("The total number of vowels in your string is: " + number);
		
		s.close();
	}
	
	public static int vowelCounter (String input) {
		
		int count = 0;
		//You can take input.toLowerCase(); and avoid doing the upper case 
		for (int k = 0; k < input.length(); k++) {
			
			if (input.charAt(k) == 'a' || input.charAt(k) == 'e' || input.charAt(k) == 'i'
                    || input.charAt(k) == 'o' || input.charAt(k) == 'u' || input.charAt(k) == 'A' 
                    || input.charAt(k) == 'E' || input.charAt(k) == 'I' || input.charAt(k) == 'O' 
                    || input.charAt(k) == 'U') {
				count++;
			}
		}
		
		return count;
	}

}
