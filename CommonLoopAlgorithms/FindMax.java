import java.util.Scanner;

public class FindMax
{
    /**
     * Find the maximuim number in the specified series of numbers 
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print( "Enter a series fo numbers (type 'q' to quit): ");
 

        double maxValue = in.nextDouble();
        
        while(in.hasNextDouble())
        {
            double value = in.nextDouble();
            if(value >maxValue)
            {
                maxValue = value;
            }
        }
        
        System.out.println( "Maximum value: "+ maxValue);
    }
}