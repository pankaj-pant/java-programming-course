package app;
import java.util.Scanner;

/* Task:
Create a program called StringLength that inputs strings from the user
 until he/she decides to quit by entering the text "quit". Finally, the
program displays the total length of the entered strings 
(NB! excluding the text "quit"). */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
		
		String exitString = "quit";
		
		System.out.print("Enter first string: ");
		String text = input.nextLine().trim();
		
		if (text.equals(exitString)) {
			System.out.print("The total length is 0");
		} else {
			int totalLength = text.length();
			int length = text.length();
			
			while (text.equals(exitString) == false) {
				System.out.print("Enter a string: ");
				text = input.nextLine().trim();
				length = text.length();
				totalLength = totalLength + length;
			}
			System.out.print("The total length is " + (totalLength - 4));
			
		}
		
		
		input.close();
    }
}