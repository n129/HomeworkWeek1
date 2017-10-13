import java.util.Scanner;

public class LetterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter a string: ");
		String input = s.nextLine();
		
		int vnumber = vowelCounter(input);
		int cnumber = consonantCounter(input);
				
		System.out.println("Here is the breakdown of your string:\nVowels: " + vnumber + "\nConsonants: " + cnumber);
		
		s.close();
	}
	
	public static int vowelCounter (String input) {
		
		int vcount = 0;
				
		for (int i = 0; i < input.length(); i++) {
			//Could have just done input.toLowerCase() and wouldn't have to do uppercase conditions
			if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i'
                    || input.charAt(i) == 'o' || input.charAt(i) == 'u' || input.charAt(i) == 'A' 
                    || input.charAt(i) == 'E' || input.charAt(i) == 'I' || input.charAt(i) == 'O' 
                    || input.charAt(i) == 'U') {
				vcount++;
			}
		}
		return vcount;
		
	}	
	public static int consonantCounter (String input) {		
			
			int ccount = 0;
		
			for (int i = 0; i < input.length(); i++) {
			
				if (input.charAt(i) == 'b' || input.charAt(i) == 'c' || input.charAt(i) == 'd'
                    || input.charAt(i) == 'f' || input.charAt(i) == 'g' || input.charAt(i) == 'h' 
                    || input.charAt(i) == 'j' || input.charAt(i) == 'k' || input.charAt(i) == 'l' 
                    || input.charAt(i) == 'm' || input.charAt(i) == 'n' || input.charAt(i) == 'p' 
                    || input.charAt(i) == 'q' || input.charAt(i) == 'r' || input.charAt(i) == 's' 
                    || input.charAt(i) == 't' || input.charAt(i) == 'v' || input.charAt(i) == 'w' 
                    || input.charAt(i) == 'x' || input.charAt(i) == 'y' || input.charAt(i) == 'z'
                    || input.charAt(i) == 'B' || input.charAt(i) == 'C' || input.charAt(i) == 'D'
                    || input.charAt(i) == 'F' || input.charAt(i) == 'G' || input.charAt(i) == 'H' 
                    || input.charAt(i) == 'J' || input.charAt(i) == 'K' || input.charAt(i) == 'L' 
                    || input.charAt(i) == 'M' || input.charAt(i) == 'N' || input.charAt(i) == 'P' 
                    || input.charAt(i) == 'Q' || input.charAt(i) == 'R' || input.charAt(i) == 'S' 
                    || input.charAt(i) == 'T' || input.charAt(i) == 'V' || input.charAt(i) == 'W' 
                    || input.charAt(i) == 'X' || input.charAt(i) == 'Y' || input.charAt(i) == 'Z'
                    ) {
				ccount++;
			}
		}
		
		return ccount;
	}

}
