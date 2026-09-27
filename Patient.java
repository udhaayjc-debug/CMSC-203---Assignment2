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
 * Description: Assignment 2 Patient class(class to hold patient information)
 * 
*/

public class Patient {

    // Variables to hold patient information
    private String firstName;
    private String middleName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String emergencyName;
    private String emergencyPhone;

    // No-arg constructor
    public Patient() {
    }

    // Parameterized constructor that initializes patient’s first, middle and last name
    public Patient(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    // Parameterized constructor that initializes all attributes of the patient
    public Patient(String firstName, String middleName, String lastName,
                   String streetAddress, String city, String state, String zip,
                   String phoneNumber, String emergencyName, String emergencyPhone) {

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.emergencyName = emergencyName;
        this.emergencyPhone = emergencyPhone;
    }

    // Accessors Getter methods for all the patient attributes 
    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmergencyName() {
        return emergencyName;
    }

    public String getEmergencyPhone() {
        return emergencyPhone;
    }

    // Mutators Setter methods for all the patient attributes
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmergencyName(String emergencyName) {
        this.emergencyName = emergencyName;
    }

    public void setEmergencyPhone(String emergencyPhone) {
        this.emergencyPhone = emergencyPhone;
    }

    // Method buildFullName that returns a String which is the concatenation of first, middle and last name separated by space.
    public String buildFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    // method buildAddress that returns a String which is the concatenation of address, city, state and zip separated by space. 
    public String buildAddress() {
        return streetAddress + " " + city + " " + state + " " + zip;
    }

    // method buildEmergencyContact that returns a String which is the concatenation of emergency name and emergency phone separated by space.
    public String buildEmergencyContact() {
        return emergencyName + " " + emergencyPhone;
    }

    // Method isValidPhoneNumber that checks patient phone number format
    public boolean isValidPhoneNumber() {
        return phoneNumber != null && phoneNumber.matches("\\d{3}-\\d{3}-\\d{4}");
    }

    // Method isValidEmergencyPhoneNumber that checks emergency phone number format
    public boolean isValidEmergencyPhoneNumber() {
        return emergencyPhone != null && emergencyPhone.matches("\\d{3}-\\d{3}-\\d{4}");
    }

    // Method getLastFirstMiddle that returns the patient's name in Last, First Middle format
    public String getLastFirstMiddle() {
        return lastName + ", " + firstName + " " + middleName;
    }

    // Method hasSameCityState that checks whether city and state match
    public boolean hasSameCityState(String city, String state) {
        return this.city != null && this.state != null
                && this.city.equalsIgnoreCase(city)
                && this.state.equalsIgnoreCase(state);
    }

    // Method updateAddress that updates street, city, state and zip
    public void updateAddress(String street, String city, String state, String zip) {
        this.streetAddress = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    // Method getContactSummary that returns patient and emergency contact details
    public String getContactSummary() {
        return "Phone Number: " + phoneNumber + "\n"
                + "Emergency Contact: " + buildEmergencyContact();
    }

    // method toString that display all information of a patient
    @Override
    public String toString() {
        return "Name: " + buildFullName() + "\n"
                + "Address: " + buildAddress() + "\n"
                + "Phone Number: " + phoneNumber + "\n"
                + "Emergency Contact: " + buildEmergencyContact() + "\n"
                + "Phone Valid: " + isValidPhoneNumber() + "\n"
                + "Emergency Phone Valid: " + isValidEmergencyPhoneNumber();
    }
}
