package app;

import java.util.*;

/* Task:
Suppose that we want to create crews for boat cruises. Each crew can include several sailors.

INSTRUCTION

Create classes Sailor and Crew as below

Example output:
=== First crew ===
Frank (frank@mail.com) 
Susan (susan@mail.com) 
Ann (ann@sailors.com) 

=== Second crew ===
John (john@sailors.com) 
Susan (susan@mail.com) 

=== Second crew ===
John (john@sailors.com) 
Susan (Susan@sailors.com)  */

class Sailor {

	private String name;

	private String email;

	public Sailor(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	void setEmail(String email) {
		this.email = email;
	}
}

class Crew {

	private ArrayList<Sailor> sailorList = new ArrayList<Sailor>();

	public Crew() {

	}

	public void addCrewMember(Sailor sailor) {
		sailorList.add(sailor);
	}

	public String toString() {
		String toString = "";
		for (Sailor sailorObject : sailorList) {
			toString += sailorObject.getName() + " (" + sailorObject.getEmail() + ")";
		}
		return toString;
	}

}

public class App {
    public static void main(String[] args) {

        Sailor firstSailor = new Sailor("Frank", "frank@mail.com");
        Sailor secondSailor = new Sailor("Susan", "susan@mail.com");
        Sailor thirdSailor = new Sailor("John", "john@sailors.com");
        Sailor fourthSailor = new Sailor("Ann", "ann@sailors.com");
        
        Crew firstCrew = new Crew();
        Crew secondCrew = new Crew();
                
        firstCrew.addCrewMember(firstSailor);
        firstCrew.addCrewMember(secondSailor);
        firstCrew.addCrewMember(fourthSailor);
        
        secondCrew.addCrewMember(thirdSailor);
        secondCrew.addCrewMember(secondSailor);
        
        System.out.println("=== First crew ===\n" + firstCrew);
        System.out.println("=== Second crew ===\n" + secondCrew);
        
        secondSailor.setEmail("Susan@sailors.com");
        System.out.println("=== Second crew ===\n" + secondCrew); 
    }
}