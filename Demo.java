import java.util.Scanner; 
Class Demo extends Vehicle
{
    public static void main(String[] args)
    {
        Scanner car_type = new Scanner(System.in);
        System.out.print("Enter (Car/Truck/Dually) to find out the number of wheels for each")
                if (car_type == "car" || car_type == "Car")
                {
                    Vehicle a = new Vehicle();
                    a.make();
                }
                else if (car_type == "Truck" || car_type == "truck")
                {
                    Truck b = new Truck();
                    b.make();
                }
                else if (car_type == "Dually" || car_type = "dually")
                {
                    Dually c = new Dually();
                    c.make();
                }
                else
                {
                    System.out.println("Not a valid response...");
                }
    }
   
}