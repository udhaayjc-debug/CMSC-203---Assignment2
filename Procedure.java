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
 * Description: Assignment 2 Procedure class(class that represents a medical procedure)
 * 
*/

public class Procedure {

    // Variables to hold procedure information
    private String name;
    private String date;
    private String practitioner;
    private double charge;

    // No-arg constructor
    public Procedure() {
    }

    // Parametrized constructor that initializes procedure’s name and date
    public Procedure(String name, String date) {
        this.name = name;
        this.date = date;
    }

    // Parametrized constructor that initializes all attributes of the procedure
    public Procedure(String name, String date, String practitioner, double charge) {
        this.name = name;
        this.date = date;
        this.practitioner = practitioner;
        this.charge = charge;
    }

    // Accessors Getter methods for all the procedure attributes
    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getPractitioner() {
        return practitioner;
    }

    public double getCharge() {
        return charge;
    }

    // Mutator Setter methods for all the procedure attributes
    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPractitioner(String practitioner) {
        this.practitioner = practitioner;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }

    // Method isExpensiveProcedure that checks if the charge is at least 1000
    public boolean isExpensiveProcedure() {
        return charge >= 1000.00;
    }

    // Method applyDiscount that applies a valid discount between 0 and 100 percent
    public void applyDiscount(double percent) {
        if (percent >= 0 && percent <= 100) {
            charge = charge - (charge * percent / 100);
        }
    }

    // Method getChargeCategory that returns Low, Medium, or High
    public String getChargeCategory() {
        if (charge < 500) {
            return "Low";
        }
        else if (charge < 1000) {
            return "Medium";
        }
        else {
            return "High";
        }
    }

    // Method isPerformedBy that checks the practitioner name
    public boolean isPerformedBy(String practitionerName) {
        return practitioner != null && practitioner.equalsIgnoreCase(practitionerName);
    }

    // Method getFormattedCharge that returns the charge with dollar sign, commas and two decimals
    public String getFormattedCharge() {
        return String.format("$%,.2f", charge);
    }

    // Method toString that display all information of a procedure
    @Override
    public String toString() {
        return "Procedure Name: " + name + "\n"
                + "Date: " + date + "\n"
                + "Practitioner: " + practitioner + "\n"
                + "Charge: " + getFormattedCharge();
    }
}
