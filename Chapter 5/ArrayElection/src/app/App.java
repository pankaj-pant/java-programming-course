package app;
import java.util.Scanner;

/* Task:
Create a program called ArrayElection. The program first inputs the number of
 candidates in the election. Then the program inputs name and votes for each
  candidate. Finally, the program determines the winner and displays the
   winner's name and votes.

* If the election is a tie, then the program prints the names of the
 candidates who share the highest votes.

The election is a tie between the following candidates:
Susan (15 votes)
John (15 votes) */

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of candidates: ");
		int numberOfCandidatesUserInput = Integer.parseInt(input.nextLine());

		String[] nameOfCandidates = new String[numberOfCandidatesUserInput];

		int[] votesPerCandidate = new int[numberOfCandidatesUserInput];

		for (int i = 0; i < numberOfCandidatesUserInput; i++) {
			System.out.print("Enter " + (i + 1) + ". name:");
			nameOfCandidates[i] = input.nextLine();
			System.out.print("Enter votes: ");
			votesPerCandidate[i] = Integer.parseInt(input.nextLine());
		}

		int maxNumberOfVotes = votesPerCandidate[0];
		String nameOfWinner = "";
		for (int i = 1; i < votesPerCandidate.length; i++) {
			if (votesPerCandidate[i] > maxNumberOfVotes) {
				maxNumberOfVotes = votesPerCandidate[i];
				nameOfWinner = nameOfCandidates[i];
			}
		}

		int counter = 0;

		for (int i = 0; i < votesPerCandidate.length; i++) {
			if (maxNumberOfVotes == votesPerCandidate[i]) {

				counter++;
			}
		}

		if (counter > 1) {
			System.out.print("\nThe election is a tie between the following candidates: ");
			for (int i = 0; i < votesPerCandidate.length; i++) {
				if (maxNumberOfVotes == votesPerCandidate[i]) {
					System.out.print("\n" + nameOfCandidates[i] + " (" + maxNumberOfVotes + " votes)");
				}
			}

		} else {

			System.out.print("\nThe winner is " + nameOfWinner + " with " + maxNumberOfVotes + " votes!");

		}

		input.close();
	}

}
