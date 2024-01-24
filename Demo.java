import java.util.Scanner; 
Class Typecars extends Car
{
    Scanner car_type = new Scanner(System.in);
    System.out.print("Enter (Car/Truck/Dually) to find out the number of wheels for each")
    void make()
    {
            if (car_type == "car" || car_type == "Car")
            {
                System.out.println("A car has 4 wheels.");
            }
            else if (car_type == "Truck" || car_type == "truck")
            {
                System.out.println("A Truck has 4 wheels.");
            }
            else if (car_type == "Dually" || car_type = "dually")
            {
                System.out.println("A Dually has 6 wheels.");
            }
            else
            {
                System.out.println("Not a valid response...");
            }
    }
}