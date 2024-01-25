import java.util.Scanner;

public class Demo {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        boolean x = true;
        while (x)
        {
            System.out.println("Choose a Vehicle to see how many wheels it has (Car/Dually/Boat) or (exit): ");
            String choice = scanner.nextLine();

            Vehicle vehicle = null; 
            if (choice.equalsIgnoreCase("car"))
            {
                vehicle = new Car();
            }
            else if (choice.equalsIgnoreCase("dually")) 
            {
                vehicle = new Dually();
            }
            else if (choice.equalsIgnoreCase("boat"))
            {
                vehicle = new Boat();
            }
            else if (choice.equalsIgnoreCase("exit"))
            {
                x = false;
            }
            else 
            {
                System.out.println("Not a valid choice... (Car/Dually/Boat)ca");
            }

            // Calling make() of the polymorphic variable
            if (vehicle != null) 
            {
                vehicle.make();
            }

            
            
        }
        
        scanner.close();
    }
}
