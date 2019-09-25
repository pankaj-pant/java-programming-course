package app;

/* Task:
Word Pai Object Program.
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

		WordPair word_1 = new WordPair("class", "luokka");
		WordPair word_2 = new WordPair("object", "olio");
		WordPair word_3 = new WordPair("variable", "muuttuja");
		
		System.out.println(word_1.toString());
		System.out.println(word_2.toString());
		System.out.println(word_3.toString());
	}

}