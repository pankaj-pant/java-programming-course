package app;
import java.util.Scanner;

/* Task:
Create a program called ArrayBloodTypes that first inputs a blood type from
 the user. Then the program shows the percentage of the blood type found in
  an array that contains the following values:

"A+", "O-", "AB+", "O+", "AB+", "AB+", "O-", "AB+", "O+", "AB+" 

*/

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[] bloodType = { "A+", "O-", "AB+", "O+", "AB+", "AB+", "O-", "AB+", "O+", "AB+" };

		System.out.print("Enter blood type: ");
		String enteredInput = input.nextLine();
		int counter = 0;

		for (int i = 0; i < bloodType.length; i++) {
			if (enteredInput.equals(bloodType[i])) {
				counter++;
			}

		}

		System.out.print((counter * 10) + ",0 %");

		input.close();

	}

}
