//********************************************************************
//  Transactions.java       Author: MA Papalaskari 
// 							(based on Lewis/Loftus example)
//
//  Demonstrates the creation and use of multiple Account objects.
//********************************************************************

public class Transactions
{
   //-----------------------------------------------------------------
   //  Creates some bank accounts and requests various services.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Account acct1 = new Account ("Ted Murphy", 72354, 102.56);
      Account acct2 = new Account ("Jane Smith", 69713, 40.00);
      Account acct3 = new Account ("Edward Demsey", 93757, 759.32);
		Account acct4 = new Account ("Carson Wentz", 14141, 11.11);
      
      System.out.println (acct1);
      System.out.println (acct2);
      System.out.println (acct3);
		System.out.println (acct4);
      
      acct1.deposit (25.85);
      acct1.withdraw (60, 2.50);

      System.out.println ();
      System.out.println (acct1.toString());
      System.out.println (acct2.toString());
      System.out.println (acct3.toString());
      System.out.println (acct4.toString());
      
      double sum = acct1.getBalance() + acct2.getBalance() + acct3.getBalance();
      System.out.println("\nTotal funds in bank: " + sum);
   }
}
