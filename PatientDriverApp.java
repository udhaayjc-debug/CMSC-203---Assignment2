import java.util.Scanner;

/*
 * Class: CMSC203 
 * Instructor: Huseyin Aygun
 * Student Name: Udhaay Jayachandran 
 * Due: 09/27/2026
 * Platform/compiler: IDE eclipse/Java 21
 *  
 * I pledge that I have completed the programming assignment independently. 
 * I have not copied the code from a student or any source. I have not given my code to any student.
 * 
 * Description: Assignment 2 PatientDriverApp class
 * 
*/

public class PatientDriverApp {

	// Method inputPatient that reads patient information from the keyboard
	public static Patient inputPatient(Scanner input) {
		System.out.print("Enter first name: ");
		String firstName = input.nextLine();

		System.out.print("Enter middle name: ");
		String middleName = input.nextLine();

		System.out.print("Enter last name: ");
		String lastName = input.nextLine();

		System.out.print("Enter street address: ");
		String streetAddress = input.nextLine();

		System.out.print("Enter city: ");
		String city = input.nextLine();

		System.out.print("Enter state: ");
		String state = input.nextLine();

		System.out.print("Enter zip: ");
		String zip = input.nextLine();

		System.out.print("Enter phone number (###-###-####): ");
		String phoneNumber = input.nextLine();

		System.out.print("Enter emergency contact name: ");
		String emergencyName = input.nextLine();

		System.out.print("Enter emergency contact phone (###-###-####): ");
		String emergencyPhone = input.nextLine();

		return new Patient(firstName, middleName, lastName, streetAddress, city, state, zip, phoneNumber, emergencyName,
				emergencyPhone);
	}

	// Method create medical Procedure1 that uses the no-arg constructor
	public static Procedure createProcedure1() {
		Procedure procedure = new Procedure();

		procedure.setName("Physical Exam");
		procedure.setDate("09/27/2026");
		procedure.setPractitioner("Dr. Anika");
		procedure.setCharge(225.00);

		return procedure;
	}

	// Method create medical Procedure2 that uses the name and date constructor
	public static Procedure createProcedure2() {
		Procedure procedure = new Procedure("X-ray", "09/27/2026");

		procedure.setPractitioner("Dr. Anika");
		procedure.setCharge(535.00);

		return procedure;
	}

	// Method create medical Procedure3 that uses the constructor with all attributes
	public static Procedure createProcedure3() {
		return new Procedure("Blood Test", "09/27/2026", "Dr. Anika ", 1500.00);
	}

	// Method displayPatient that displays all patient information
	public static void displayPatient(Patient patient) {
		System.out.println();
		System.out.println("Patient Information");
		System.out.println("-------------------");
		System.out.println(patient);
	}

	// Method displayProcedure that displays one procedure in table format
	public static void displayProcedure(Procedure procedure) {
		System.out.printf("%-20s %-12s %-20s %-15s %-10s%n", procedure.getName(), procedure.getDate(),
				procedure.getPractitioner(), procedure.getFormattedCharge(), procedure.getChargeCategory());
	}

	// Method displayProcedureTable that displays all three procedures
	public static void displayProcedureTable(Procedure p1, Procedure p2, Procedure p3) {
		System.out.println();

		System.out.printf("%-20s %-12s %-20s %-15s %-10s%n", "Procedure", "Date", "Practitioner", "Charge", "Category");

		System.out.println("------------------------------------------------------------------------------------------");

		displayProcedure(p1);
		displayProcedure(p2);
		displayProcedure(p3);
	}

	// Method calculateTotalCharges that calculates the total procedure charges
	public static double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3) {
		return p1.getCharge() + p2.getCharge() + p3.getCharge();
	}

	// Method calculateAverageCharge that calculates the average procedure charge
	public static double calculateAverageCharge(Procedure p1, Procedure p2, Procedure p3) {
		return calculateTotalCharges(p1, p2, p3) / 3.0;
	}

	// Method findHighestChargeProcedure that returns the procedure with the highest
	// Charge
	public static Procedure findHighestChargeProcedure(Procedure p1, Procedure p2, Procedure p3) {
		Procedure highest = p1;

		if (p2.getCharge() > highest.getCharge()) {
			highest = p2;
		}

		if (p3.getCharge() > highest.getCharge()) {
			highest = p3;
		}

		return highest;
	}

	// Method countExpensiveProcedures that counts charges of 1000 or more
	public static int countExpensiveProcedures(Procedure p1, Procedure p2, Procedure p3) {
		int count = 0;

		if (p1.isExpensiveProcedure()) {
			count++;
		}

		if (p2.isExpensiveProcedure()) {
			count++;
		}

		if (p3.isExpensiveProcedure()) {
			count++;
		}

		return count;
	}

	// Method displaySummary that displays all procedure calculations
	public static void displaySummary(Procedure p1, Procedure p2, Procedure p3) {
		double total = calculateTotalCharges(p1, p2, p3);
		double average = calculateAverageCharge(p1, p2, p3);
		Procedure highest = findHighestChargeProcedure(p1, p2, p3);
		int expensive = countExpensiveProcedures(p1, p2, p3);

		System.out.println();
		System.out.printf("Total Charges: $%,.2f%n", total);
		System.out.printf("Average Charge: $%,.2f%n", average);
		System.out.println("Highest Charge Procedure: " + highest.getName());
		System.out.println("Number of Expensive Procedures: " + expensive);
	}

	public static void main(String[] args) {
		
		// Scanner input
		Scanner input = new Scanner(System.in);

		// Initial patient instance.
		Patient patient = inputPatient(input);

		// call the medical procedure methods
		Procedure procedure1 = createProcedure1();
		Procedure procedure2 = createProcedure2();
		Procedure procedure3 = createProcedure3();

		// Display patient information in to the console
		displayPatient(patient);
		displayProcedureTable(procedure1, procedure2, procedure3);
		displaySummary(procedure1, procedure2, procedure3);

		// Print the student information with the due date.
		System.out.println();
		System.out.println("The program was developed by a Student: Udhaay Jayachandran 09/27/26");

		input.close();
	}
}
