import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class MPGApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Miles Per Gallon calculator");
        System.out.println();
        
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter miles driven: ");
            String milesStr = sc.next();
            //BigDecimal miles = sc.nextBigDecimal();
            BigDecimal miles = new BigDecimal(milesStr);
//            System.out.println(miles);

            
            System.out.print("Enter gallons of gas used: ");
            String galStr = sc.next();
            BigDecimal gallons = new BigDecimal(galStr);
            //BigDecimal gallons = sc.nextBigDecimal();
//            System.out.println(gallons);
            
            BigDecimal mpg = miles.divide(gallons, 2, RoundingMode.HALF_UP);
//            		mpg.setScale(2, RoundingMode.HALF_UP);            
            
            System.out.println("Miles per gallon is " + mpg + ".");
            System.out.println("");
            
            System.out.print("Calculate another MPG? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
        System.out.println("Goodbye!");
    }
    
}
