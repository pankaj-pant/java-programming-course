package app;
import java.util.Scanner;

/* Task:
Create a program called ArrayLanguageTranslation that inputs an English word
 from the user and translates it to Finnish. This time, the program can
  translate only the following words:

"bird", "bus", "car", "cat", "dog", "school", "thanks", "train", "teacher"

 If the word is unknown, the program should display "Unknown word".
  Use two arrays in the program. */

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[] englishWords = { "bird", "bus", "car", "cat", "dog", "school", "thanks", "train", "teacher" };

		String[] finnishWords = { "lintu", "linja-auto", "auto", "kissa", "koira", "koulu", "kiitos", "juna",
				"opettaja" };

		System.out.print("Enter an English word: ");
		String enteredInput = input.nextLine();

		boolean found = false;

		for (int i = 0; i < englishWords.length; i++) {
			if (enteredInput.equals(englishWords[i])) {
				found = true;
				System.out.print(finnishWords[i]);
			}
		}

		if (found == false) {
			System.out.print("Unknown word");
		}

		input.close();

	}

}
