import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variables
        double fahrenheit;
        double celsius = 0;
        boolean valid = false;
        //input
        System.out.println("Enter the temperature in celsius.");
        do {
            if (scan.hasNextDouble()) {
                celsius = scan.nextDouble();
                valid = true;
            }
           else {
                System.out.println("Please enter a valid temperature.");
                scan.nextLine();
            }
        } while (!valid);
        //process
        fahrenheit = ((double) 9 /5) * celsius + 32;
        System.out.printf("%5s %10.2f %5s %10.2f", "Degrees C:", celsius, "\nDegrees F:", fahrenheit);

    }
}