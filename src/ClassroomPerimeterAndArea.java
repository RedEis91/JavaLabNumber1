//imported scanner as method
import java.util.Scanner;
public class ClassroomPerimeterAndArea {
    public static void main(String[] args) {
        //created a new scanner called scan to take in user input
        Scanner scan = new Scanner(System.in);
        //greeting to user
        System.out.println("Welcome to Grand Circus' Room Detail Generator!");
        //Prompt for user to enter room length
        System.out.println("Enter Room Length: ");
        //initialized double variables to store the length and width of the room, respectively.
        double length;
        double width;
        //takes first input from user and stores this double in the variable called length
        length = scan.nextDouble();
        //move on to the next command
        scan.nextLine();
        //prints out message to user to validate their input
        System.out.println("You entered " + length + " as length.");
        //Prompt for user to enter room width
        System.out.println("Enter Room Width: ");
        //takes second input from user and stores this double in the variable called width
        width = scan.nextDouble();
        //move on the next line
        scan.nextLine();
        //prints message to user to validate their entry for width
        System.out.println("You entered " + width + " as width.");
        //initialized double variables to store area and perimeter
        double area;
        double perimeter;
        //assign area variable to value of length times width
        area = length * width;
        //assign perimeter variable to the value of length * 2 + width * 2
        perimeter = length + length + width + width;
        //prints area to user with explanatory message
        System.out.println("Area of your room = " + area);
        //print perimeter to user with explanatory message
        System.out.println("Perimeter of your room = " + perimeter);
        //Prompt for user to continue
        System.out.println("Continue? (y/n): ");
        //takes y or n from user and stores in variable called continue
        String question = scan.nextLine();
        System.out.println(question);
    }
}
