package app;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;

/* Task:
Create a program called ObjectsSortingWordPairs that first inputs pairs 
of English and Finnish words from the user until he/she enters "OK" as 
the English word.

Next, the program should sort the list of WordPairs in alphabetical 
order by English word and print the words as shown in the example output.

Finally, the program should sort the list of WordPairs in alphabetical 
order by Finnish word and print the words as shown in the example output. */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		ArrayList<WordPair> wordList = new ArrayList<WordPair>();

		boolean isQuit = false;

		while (!isQuit) {
			System.out.print("Enter an English word (quit ends): ");
			String englishEnteredText = input.nextLine();

			if (englishEnteredText.equals("quit")) {
				isQuit = true;
				break;
			} else {
				System.out.print("Enter a Finnish word: ");
				String finnishEnteredText = input.nextLine();

				wordList.add(new WordPair(englishEnteredText, finnishEnteredText));
				System.out.println();
				
			}
		}
				Collections.sort(wordList); // sort english words

				String toPrintEnglish = "";
				for (int i = 0; i < wordList.size(); i++) {

					toPrintEnglish += wordList.get(i).getEnglishWord() + " = " + wordList.get(i).getFinnishWord() + "\n";
				}

				System.out.println();

				Collections.sort(wordList, new WordPair_FinnishWordComparator()); // sort finnish words
				String toPrintFinnish = "";

				for (int i = 0; i < wordList.size(); i++) {

					toPrintFinnish += wordList.get(i).getFinnishWord() + " = " + wordList.get(i).getEnglishWord() + "\n";
				}

				System.out.print(toPrintEnglish + "\n" + toPrintFinnish);
			

		input.close();
	}

}

class WordPair implements Comparable<WordPair> {

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
	
	public int compareTo (WordPair anotherWordPair) {
		return englishWord.compareTo(anotherWordPair.englishWord);
	}

	public String toString() {
		return englishWord + " = " + finnishWord;
	}
	
}

class WordPair_FinnishWordComparator implements Comparator<WordPair>  {

	public int compare(WordPair a, WordPair b) {
		 return a.getFinnishWord().compareTo(b.getFinnishWord());
		}
	
}
