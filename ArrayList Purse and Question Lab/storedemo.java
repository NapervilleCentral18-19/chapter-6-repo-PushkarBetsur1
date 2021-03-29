import java.util.*;

public class storedemo
{
   ArrayList<Customer> customers = new ArrayList<>();
   public static void main(String[] args)
   {
      Store myStore = new Store();

      Scanner in = new Scanner(System.in);
      boolean done = false;
      int i = 0;
      // while loop is all starter code
      while (!done)
      {
         System.out.println("Enter the price: (enter 0 to end the program)"); // uses 0 as a sentinel value per the instructions 
         double d = in.nextDouble();
         
         if (d == 0)
         {
            done = true;
         }
         else
         {
            System.out.print("Name: ");
            String name = in.next();
            myStore.addSale(name,d); 
         }
       }

      
      System.out.println("Best customer's name: "
            + myStore.nameOfBestCustomer());
   }        
   
}
