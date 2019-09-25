package app;
import java.util.Scanner;

/* Task:
Create a program called ObjectsLanguageTranslationArray that inputs an 
English word from the user and translates it to Finnish. The program is
 a variation of your ArrayLanguageTranslation program.

This time, the program can translate only the following words: "bird", 
"bus", "car", "cat", "dog".

If the word is unknown, the program should display "Unknown word". */

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

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		WordPair[] wordPairArray = new WordPair[5];

		wordPairArray[0] = new WordPair("bird", "lintu");
		wordPairArray[1] = new WordPair("bus", "bussi");
		wordPairArray[2] = new WordPair("car", "auto");
		wordPairArray[3] = new WordPair("cat", "kissa");
		wordPairArray[4] = new WordPair("dog", "koira");

		System.out.print("Enter an English word: ");
		String enteredText = input.nextLine();

		boolean match = false;
		for (int i = 0; i < wordPairArray.length; i++) {

			if (match == true) {
				break;
			}
			if (enteredText.matches(wordPairArray[i].getEnglishWord())) {
				System.out.print(wordPairArray[i].getFinnishWord());
				match = true;
			}

		}
		if (match == false) {
			System.out.print("Unknown word");
		}

		input.close();
	}

}
