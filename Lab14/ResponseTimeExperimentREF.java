//*************************************************************
//  ResponseTimeExperiment.java       Author: Kyle Carney
//  Lab 14
//*************************************************************
import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class ResponseTimeExperimentREF
{
   public static void main(String[] args) throws IOException
   {
   //initialize scanner and random
      Scanner in = new Scanner(System.in);
      Random rand = new Random();
      int numCorrect, i;
      long totalTime;
      long averageTime;
   // A. NumCorrect = 0
      numCorrect = 0;
   // B. totalTime = 0
      totalTime = 0;
      System.out.print("\nPlease enter your name: ");
      String name = in.nextLine();
      PrintWriter outFile = new PrintWriter(name + ".txt");
       
      // C. Repeat 4 times
      for (i = 0; i < 4; i++)
      {
      
         //	2.		print	personalized	welcome	message	&	instructions
         System.out.println("Hello " + name 
            + ". Please answer as fast as you can.");	
         System.out.println("\n\nHit <ENTER> when ready.");
         in.nextLine();  // wait for user to hit <ENTER>
         //	3.		a	=	random	int
         int a = rand.nextInt(100);
         //	4.		b	=	random	int
         int b = rand.nextInt(100);
         //	5.		startTime	=	current	time
         long startTime = System.currentTimeMillis();
         
      // Try / Catch      
         try 
         {
         //	6.		print	question	using	a,	b
            System.out.print(a + " + " + b + " = ");
         //	7.		input	answer
            String response = in.nextLine();
            int number = Integer.parseInt(response);
         //	8.		endTime	=	current	time
            long endTime = System.currentTimeMillis();
         
         //	9.		outcome	=	1	or	0	(answer	is	correct	or	incorrect)
            int outcome = (number == a + b) ? 1:0;
         //	10.		reactionTime	=	endTime	� startTime
            long reactionTime = endTime - startTime;    
         //D. totalTime = totalTime + reactionTime
            totalTime = totalTime + reactionTime;

         //	11. Print	outcome	as	�Correct�	or	�Incorrect�
            System.out.println(outcome == 1 ? "Correct!" : "Incorrect.");     
         
         // E. numCorrect = numCorrect + outcome
            numCorrect = numCorrect + outcome;
            }
         catch  (NumberFormatException problem) 
         {
            outFile.println("*");
            System.out.println("FAIL: You were supposed to input a number.");
         }
      
      // F.  averageTime = totalTime / 4
         averageTime = totalTime/4;
         System.out.println("That took " + reactionTime + " milliseconds");
      //G. Print average response time
         System.out.println("\nYour average response time is " + averageTime + " milliseconds.");
         outFile.println( outcome + "\t" + reactionTime);
      }
      outFile.close();
      // 12. Print Goodbye
      System.out.println("\nThank you, goodbye.");  
      
   }
}
