// Import the scanner library
import java.util.Scanner;

// Class to echo back requested information to the user
public class AskUser {

// Creating the class variable of the scanner object to allow user input
static Scanner scanner = new Scanner(System.in);

// Static class object to hold the string array for user info
static String[] userVars;
static String[] dob;
static String[] userDetails;

// Method to say goodbye
public static void exitApplication() {
	System.out.println("\nSee you later");
	// Exit the application
	System.exit(0);
}

// The method or function
    public static String[] requestUserInfo(String name, String dob, String...details) {
        // Create an array of string type objects to hold values for the user
        userVars = new String[details.length];
        // Issue the greeting
        System.out.println("I am happy to learn more about you " + name + "!");
        // Perform the loop with the details equal to the length of of items
        for (int i = 0; i < details.length; i++) {
        	System.out.println("Can I get your " + details[i] + ", please? ");
        	// Capture the user input in the array
        	userVars[i] = scanner.nextLine();
        }
        // Return the string of supplied details
        return details;
    }

    public static void main(String[] args) {
    	// Declare local variables
    	String name;
    	String dob;
    	// Output welcome message to the user
    	System.out.println("Welcome to my program");
    	// Requet the users name
    	System.out.println("Can I have your name? ");
    	name = scanner.nextLine();
    	// Request the users dob
    	System.out.println("What is your date of birth? ");
    	dob = scanner.nextLine();
    	// Call method to get user input and place it in the array
    	userDetails = requestUserInfo(name, dob, "age", "city of residence", "favorite color", "favorite historical character");
    	// Output the information to the user
    	outputUserDetails(name);
    	// Call method to which says goodbye and exit the application
    	exitApplication();
    }

    public static void outputUserDetails(String name) {
    	// Begin outputting user details
    	System.out.println("\nWell " + name + ", you were born in " + dob + ".");
    	System.out.println("\nThat was a good year for wine.");
    	// Iterate through the user details backwords
    	for (int i = userVars.length -1; i > 0; i--) {
    		// Echo detail gathered of user input
    		System.out.println("Your " + userDetails[i] + " is " + userVars[i] + ".");
    	}
    }
}