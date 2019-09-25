package app;

import java.util.*;

/* Task:
Create a program called ObjectsLanguageTranslationArrayList that first
 inputs pairs of English and Finnish words from the user until he/she 
 enters "ok" as the English word.

Then the program should input English words from the user until the user
 decides to quit by entering "quit". For each entered word the program 
 prints the corresponding Finnish word. If the word is unknown, the 
 program should display "Unknown word". */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		ArrayList<WordPair> wordList = new ArrayList<WordPair>();

		System.out.println("=== Creating an English-Finnish dictionary (ok ends) ===");

		boolean ok = false;

		while (ok == false) {
			System.out.print("Enter an English word: \n");
			String englishEnteredText = input.nextLine();

			if (englishEnteredText.equals("ok")) {
				ok = true;
			} else {
				System.out.println("Enter a Finnish word: ");
				String finnishEnteredText = input.nextLine();
				wordList.add(new WordPair(englishEnteredText, finnishEnteredText));
			}
		}

		System.out.println("=== English-Finnish translation service (quit ends) ===");

		boolean quit = false;

		while (quit == false) {
			System.out.println("Enter an English word: ");
			String englishEnteredTextNew = input.nextLine();

			if (englishEnteredTextNew.equals("quit")) {
				System.out.println("Bye!");
				quit = true;
			} else {
				boolean match = false;

				for (int i = 0; i < wordList.size(); i++) {
					if (englishEnteredTextNew.equals(wordList.get(i).getEnglishWord())) {
						System.out.println(wordList.get(i).getFinnishWord());
						match = true;
					}
				}
				if (match == false) {
					System.out.println("Unknown word");
				}
			}

		}

	}

}


class WordPair {

	private String englishWord;

	private String finnishWord;

	public WordPair(String englishWord, String finnishWord) {
		this.englishWord = englishWord;
		this.finnishWord = finnishWord;
	}

	public String getEnglishWord() {
		return englishWord;
	}

	public String getFinnishWord() {
		return finnishWord;
	}

	public String toString() {
		return englishWord + " = " + finnishWord;
	}
}