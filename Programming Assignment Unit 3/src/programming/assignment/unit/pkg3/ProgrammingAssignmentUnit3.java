package programming.assignment.unit.pkg3;

public class ProgrammingAssignmentUnit3 {

    public static void main(String[] args) {
        //Open file for reading; if it can't be opened, end the program 
        try {
            TextIO.readFile("/home/kudzie/netbeans-workspace/Programming Assignment Unit 3/src/programming/assignment/unit/pkg3/icecream.txt");
        } catch (IllegalArgumentException e) {
            System.out.println("Cannot open the file \"icecream.dat\"!");
            System.exit(1);// Terminates the program.
        }
        int totalNumberIcecream = 0;
        int numberStrawberries = 0;
        
        // checking whether the entire file has been read or not
        while (!TextIO.eof()) {
            String flavour = TextIO.getln();
            totalNumberIcecream++;

            if (flavour.equals("Strawberry")) { //checking if the flavour is strawberry
                numberStrawberries++;
            }
        }
        System.out.println("The total number of sold cones is: " + totalNumberIcecream);
        System.out.println("The total number of sold Strawberry cones is: " + numberStrawberries);
        System.out.printf("The percentage of Strawberry cones is: ");
        System.out.printf("%.2f", numberStrawberries * 100.0 / totalNumberIcecream);

    }

}
