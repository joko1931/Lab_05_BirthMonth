import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your birthday month [1-12]: ");

        if(in.hasNextInt())
        {
            int birthMonth = in.nextInt();
            in.nextLine();
            System.out.println("Your birthday month is " + birthMonth);
        }
        else
        {
            String trash = in.nextLine();
            System.out.println("You inputted incorrect month value " + trash);
            System.out.println("Please enter correct input");
        }
    }
}