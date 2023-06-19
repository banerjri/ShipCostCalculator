import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in) ;
        double Price;
        System.out.print("Enter the price of your Item = ");
        if (in.hasNextDouble())
        {
            Price = in.nextDouble();
            in.nextLine();
            if (Price >= 100)
            {
                System.out.print("\nThe cost of the item is " + Price);
            }
            else
            {
                Price = Price + (Price * 0.02);
                System.out.print("\nThe Cost of the item is " +Price);
            }
        }
    }
}