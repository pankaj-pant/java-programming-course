package app;

import java.util.Scanner;

/* Task:
Example output:
Enter 1. name: John Doe
Enter points: 60
Enter 2. name: Susan Smith
Enter points: 49
Enter 3. name: Frank Zappa
Enter points: 50
Enter 4. name: Mark Matthews
Enter points: 30

Enter the minimum of required points: 50

The following applicants achived the minimum of 50 points:
John Doe, 60 points
Frank Zappa, 50 points */


class Applicant {

	private String name;

	private int points;

	public Applicant(String name, int points) {
		this.name = name;
		this.points = points;
	}

	public String getName() {
		return name;
	}

	public int getPoints() {
		return points;
	}
}



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		Applicant[] applicantProgramArray = new Applicant[4];

		for (int i = 0; i < 4; i++) {
			System.out.print("Enter " + (i + 1) + ". name: ");
			String name = input.nextLine();
			System.out.print("Enter points: ");
			int points = Integer.parseInt(input.nextLine());
			applicantProgramArray[i] = new Applicant(name, points);
		}

		System.out.print("\nEnter the minimum of required points: ");
		int minimumPoints = Integer.parseInt(input.nextLine());

		System.out.print("\nThe following applicants achived the minimum of " + minimumPoints + " points:");

		for (int i = 0; i < 4; i++) {
			if (applicantProgramArray[i].getPoints() >= minimumPoints) {
				System.out.print("\n" + applicantProgramArray[i].getName() + ", " + applicantProgramArray[i].getPoints()
						+ " points");
			}
		}

		input.close();
	}

}
