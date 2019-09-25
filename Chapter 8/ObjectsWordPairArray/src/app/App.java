package app;

/* Task:
Objects Word Pair Program with Arrays.
Example output:
class = luokka
object = olio
variable = muuttuja */

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

		WordPair[] wordPairArray = new WordPair[3];

		wordPairArray[0] = new WordPair("class", "luokka");
		wordPairArray[1] = new WordPair("object", "olio");
		wordPairArray[2] = new WordPair("variable", "muuttuja");

		for (WordPair wordPairObject : wordPairArray) {
			System.out.println(wordPairObject.getEnglishWord() + " = " + wordPairObject.getFinnishWord());
		}
	}

}
