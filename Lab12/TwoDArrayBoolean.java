//********************************************************************
//  TwoDArrayBoolean.java       Author: Lewis/Loftus
//
//  Demonstrates the use of a two-dimensional array.
//********************************************************************
import java.lang.Math; 

public class TwoDArrayBoolean
{
   //-----------------------------------------------------------------
   //  Creates a 2D array of integers, fills it with increasing
   //  integer values, then prints them out.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      boolean[][]table =  {{false, true,false, true},
                           {true, false, true, false},
                           {false, true, false, false},
                           {false, true, true, false}};

      System.out.print("# | \t");
      for (int i = 0; i<table[0].length; i++) {
         System.out.print(i + "\t\t");
         }
      System.out.println("\n--+----------------------");
      
      // Print the table
      for (int row=0; row < table.length; row++) {
         System.out.print(row +" |\t");
         for (int col=0; col < table[row].length; col++)
            if (table[row][col] == true) {
               System.out.print ("*" + "\t\t");
            }
            else {
               System.out.print ("\t\t");            
            }
         System.out.println();
       }
       System.out.println();
       System.out.println ("Matching pairs of numbers:"); 
     for (int row=0; row < table.length; row++) {
         for (int col=0; col < table[row].length; col++)
            if (table[row][col] == true) {
               if (table[col][row] == table[row][col]) {
                System.out.print ("(" + col + "," + row + ")"); 
               }
       }
     }
   }}