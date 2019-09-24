package app;
import java.util.Scanner;

/* Task:
Create a program called StringCount that inputs strings from the user 
until he/she decides to quit by entering an empty string. The user enters 
an empty string by pressing Enter without typing anything. Finally, 
the program displays the number of the entered strings (excluding the 
empty string). */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first string: ");
		String text = readText(input);
		
		if (text.isEmpty()) {
			System.out.print("Nothing to write home about.");
		} else {
			int count = 0;
			
			while (text.length() != 0) {
				System.out.print("Enter a string: ");
				text = readText(input);
				count = count + 1;	
			}
			
			System.out.print( count + " strings");
		}
		
	
		
		input.close();
		
		
	}
	
	private static String readText(Scanner input) {
		return input.nextLine().trim();
		}

}