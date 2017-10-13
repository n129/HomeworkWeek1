import java.util.Scanner;

public class UniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s = new Scanner(System.in);
	System.out.println("Please enter a string: ");
	String a = s.nextLine();
	
	unique(a);
	
	if (unique(a) == true) {
		System.out.println("The string \"" + a + "\" has all unique characters!");
	}else {
		System.out.println("There are repeat characters in your string \"" + a + "\"");
	}
	
	s.close();
	}
	
	public static boolean unique(String a) {
		
		for (int i = 0; i < a.length(); i++) {
			for (int j = i + 1; j < a.length(); j++) {
				if (a.charAt(i) == a.charAt(j)){
					return false;
				}
			}
		}return true;
	}
}
