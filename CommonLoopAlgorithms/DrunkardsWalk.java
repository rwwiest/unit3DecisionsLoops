import java.util.Scanner;
import java.util.Random;
public class DrunkardsWalk
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        int xCoordinate = 0;
        int yCoordinate = 0;
        for (int i=1;i<=100;i++)
        {
            int direction = rand.nextInt(4);
            if (direction == 0)
            {
                xCoordinate++;
            }
            else if (direction == 1)
            {
                xCoordinate = xCoordinate - 1;
            }
            else if (direction == 2)
            {
                yCoordinate++;
            }
            else 
            {
                yCoordinate = yCoordinate - 1;
            }
        }
        System.out.println("The ending location of the Drunkard's Walk is: (" + xCoordinate + "," + yCoordinate + ")");
    }

}