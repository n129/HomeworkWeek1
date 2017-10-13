import java.util.Scanner;

public class LetterRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Write a method to remove a given character from a string. 
		 * E.g. remove all 'a' from Averange should return vernge*/
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter a string: ");
		String inputString = s.nextLine();
		
		System.out.println("Now enter the letter you wish to remove: ");
		char inputLetter = s.next().charAt(0);
		
		String outputString = removeLetter(inputString, inputLetter);
		System.out.println("Your new string is: " + outputString);
		
		s.close();
	
	}
	
	public static String removeLetter(String inputString, char inputLetter) {
		
		StringBuilder sb = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            
            if (c == inputLetter)
                
            	continue;
            
            sb.append(c);
            
        }
        
        return sb.toString ();
		
	}
	
}
