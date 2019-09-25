package app;

/* Task:
Create a program called MethodsFirst that has a method called printNumbers
 that prints even integers between 2 and 50 to the console. Call the 
 printNumbers method from the main method.
 */
public class App {
    public static void main(String[] args) throws Exception {
        printNumbers();

	}

	private static void printNumbers() {
		for (int i = 2; i <= 50; i = i + 2) {
			System.out.print(i + " ");
		}

	}
}