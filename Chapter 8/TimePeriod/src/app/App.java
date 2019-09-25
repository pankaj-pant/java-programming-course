package app;
import java.util.Scanner;

/* Task:
Clock object

Example output:
0 h 0 min
Enter hours to add: 3
Enter minutes to add: 10
3 h 10 min

Enter hours to add: 2
Enter minutes to add: 35
5 h 45 min
 */
class TimePeriod {

	private int hours;

	private int minutes;

	public TimePeriod() {
		this.hours = 0;
		this.minutes = 0;
	}

	public void addHours(int hoursToAdd) {

		if (hoursToAdd > 0 && hoursToAdd <= 99) {
			this.hours += hoursToAdd;
		}
	
	}

	public void addMinutes(int minutesToAdd) {
		if (minutesToAdd > 0 && minutesToAdd <= 59) {
			this.minutes += minutesToAdd;
		}
		if (this.hours < 99 && this.minutes > 59) {
			this.minutes = this.minutes - 60;
			this.hours = this.hours + 1;
		} else if (this.hours >= 99 && this.minutes <= 59) {
			this.hours = 99;
		} else if (this.hours >= 99 && this.minutes > 59) {
			this.hours = 99;
			this.minutes = this.minutes - minutesToAdd;
		}
		
	}

	public String toString() {
		return this.hours + " h " + this.minutes + " min";

	}

}



public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TimePeriod period = new TimePeriod();

        System.out.println(period);

        for (int i = 1; i <= 2; i++) {
            System.out.print("Enter hours to add: ");
            int hours = Integer.parseInt(input.nextLine());
            
            System.out.print("Enter minutes to add: ");
            int minutes = Integer.parseInt(input.nextLine());

            period.addHours(hours);
            period.addMinutes(minutes);
            
            System.out.println(period);
            System.out.println();
        }
        
        input.close();
    }
}