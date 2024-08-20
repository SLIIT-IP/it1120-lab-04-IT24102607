import java.util.Scanner;

public class IT24102607Lab4Q2 
{
  public static void main(String[] args) 
  {
  
  //Declare variables
  double examMarks, labMarks, examPercentage, labPercentage, finalMarks;
 
  //Create an object called input to Scanner class    
  Scanner input = new Scanner(System.in);
    
  //Input marks and lab submission marks
  System.out.print("Please enter exam marks (out of 100): ");
  examMarks = input.nextDouble();
if (examMarks < 0 || examMarks > 100)
  {
   System.out.println("Invalid input for exam marks. Terminating program.");
   return;
  }

  System.out.println("Please enter lab submission marks (out of 100) ");
  labMarks = input.nextDouble();
  
if(labMarks<0||lamMarks>100)
  {
  System.out.println("Invalid input for lab marks. Terminating program.");
  return;
  }

 //Input percentages
  System.outprint("Please enter the percentage given for the exam: ");
  examPercentage = scanner.nextDouble();

  System.out.print("Please enter the percentage give for the lab submission: ");
  labPercentage = scanner.nextDouble();

  
//Validate percentage
 if(examPercentage + labPercentage != 100)
  {
  System.out.println("The percentages must add up to 100. Terminating program.");
  return;
  }
  //Calculate final mark 
  finalMark = (examMarks*examPercentage / 100) + (labMarks*labPercentage/100);

  System.out.println("Final Exam Mark is: " + finalMark);
 
  }
}



   