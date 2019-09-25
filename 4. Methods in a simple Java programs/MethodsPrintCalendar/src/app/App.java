package app;
import java.time.LocalDate;
import java.util.Scanner;

/* Task:
Create a program called MethodsPrintCalendar that has a method called
 printCalendar. The method should take year and month number as parameters
  and print a one-month calendar. */

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter year: ");
		int userInputYear = Integer.parseInt(input.nextLine());

		System.out.print("Enter month: ");
		int userInputMonth = Integer.parseInt(input.nextLine());

		System.out.print("\n");

		printCalendar(userInputYear, userInputMonth);

		input.close();
	}

	private static void printCalendar(int year, int month) {

		String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		String displayMonth = "";

		for (int i = 0; i <= monthName.length; i++) {
			if (month == i) {
				displayMonth = monthName[i - 1];

				// System.out.print(displayMonth);
			}

		}

		System.out.print(" > " + displayMonth + " " + year + " <");
		System.out.print("\n");

		String[] dayName = { " Mon", " Tue", " Wed", " Thu", " Fri", " Sat", " Sun" };

		for (int i = 0; i < dayName.length; i++) {
			System.out.print(dayName[i]);
		}

		LocalDate myDate = LocalDate.of(year, month, 1);

		int daysInMonth = myDate.lengthOfMonth();

		int dayOfWeek = myDate.getDayOfWeek().getValue();

		String empty = "   ";

		int emptySpaces = dayOfWeek - 1;
		int daysToPrintFirstRow = 8 - dayOfWeek;
		int remainingDaysStart = daysToPrintFirstRow + 1;

		System.out.print("\n");
		for (int i = 0; i < emptySpaces; i++) {
			System.out.print(empty + " ");
		}

		for (int i = 1; i <= daysToPrintFirstRow; i++) {
			System.out.printf("%4d", i);
		}

		System.out.print("\n");
		int countDaysPrintedInWeek = 0;
		for (int i = remainingDaysStart; i <= daysInMonth; i++) {
			System.out.printf("%4d", i);
			countDaysPrintedInWeek++;
			if (countDaysPrintedInWeek % 7 == 0) {
				System.out.printf("\n");
			}
		}
		System.out.printf("\n");
	}

}
