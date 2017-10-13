import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter a string: ");
		String a = s.nextLine();
		
		removeDuplicates(a);
		s.close();
		
	}
	public static void removeDuplicates(String a) {
		
		char[] input = a.toCharArray(); 
		String output = "";
		
		boolean check = true;
		char test = 0;
		
		for (int i = 0; i < a.length(); i++) {
			
			for (int j = i + 1; j < a.length(); j++) {
				
				if (input[i] == input[j]) {

					check = false;
					}					
				}
				//loads to new string
				if (check != false) {
					output = output + input[i];
				
				}
				//reset of the flag
				check = true;		
			}
		System.out.println("The new string is: " + output);	
		}
		
	}

