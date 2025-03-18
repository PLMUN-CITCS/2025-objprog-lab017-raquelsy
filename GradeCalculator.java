import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {
        // Get the student's score
        double score = getStudentScore();
        
        // Get the letter grade based on the score
        String grade = calculateGrade(score);
        
        // Display the grade to the user
        System.out.println("Your grade is: " + grade);
    }

    // Method to get the student's score
    public static double getStudentScore() {
        Scanner scanner = new Scanner(System.in); // Create a scanner object to read user input
        double score = -1; // Initialize the score with a default invalid value

        // Continue prompting the user until a valid score is entered
        while (true) {
            System.out.print("Please enter your score: ");
            
            // Check if the input is a valid number (either integer or floating-point)
            if (scanner.hasNextDouble()) {
                score = scanner.nextDouble(); // Read the score as a double
                break; // Exit the loop once a valid number is entered
            } else {
                // If the input is not a valid number, display an error message
                System.out.println("Invalid input. Please enter a valid numeric score.");
                scanner.next(); // Consume the invalid input to prevent an infinite loop
            }
        }

        return score; // Return the valid score
    }

    // Method to calculate the letter grade based on the score
    public static String calculateGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
