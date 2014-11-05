import java.util.Scanner;

public class FibonacciNumbers
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class FibonacciNumbers
     */
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please type in your integer of choice: ");
        int num = scan.nextInt();
        int fold1 = 1;
        int fold2= 1;
        int foldNew = 0;
        for (int i=0;i<=num;i++)
        {
            if (i ==0)
            { 
                foldNew = 0;
            }
            else if (i ==1)
            { 
                foldNew = 1;
            }
            else if (i ==2)
            { 
                foldNew = 1;
            }
            else
            {
                foldNew = fold1 + fold2;
                fold2 = fold1;
                fold1 = foldNew;
            }
        }
        System.out.println(foldNew +" is the fibonacci number at the " + num + "th term");
    }

}
