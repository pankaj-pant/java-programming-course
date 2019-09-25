package app;

import java.util.*;

/* Task:
Create a program called ObjectsWordList that first inputs words from 
the user until he/she decides to quit by entering "quit".
Finally, the program should print the words in alphabetical order. */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		ArrayList<String> objectWordList = new ArrayList<String>();

		boolean quit = false;

		for (int i = 0; i <= objectWordList.size(); i++) {
			if (quit == false) {
				System.out.print("Enter a word (quit ends): ");
				String enteredText = input.nextLine();

				if (enteredText.equals("quit")) {
					quit = true;
				} else {
					objectWordList.add(enteredText);
				}

			}
		}

		Collections.sort(objectWordList);
		System.out.print("\n");

		for (int i = 0; i < objectWordList.size(); i++) {
			System.out.println(objectWordList.get(i));
		}

		input.close();
	}

}
