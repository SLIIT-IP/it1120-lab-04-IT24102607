import java.util.Scanner;

public class IT24102607Lab4Q1 
{
    public static void main(String[] args) 
    {
    
    //Create an object called input to Scanner class    
    Scanner input = new Scanner(System.in);
        
        //Take user inputs
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number > 0) {
            System.out.println("The number is: Positive");
        } else if (number < 0) {
            System.out.println("The number is: Negative");
        } else {
            System.out.println("The number is: Zero");
        }
    

    }
}