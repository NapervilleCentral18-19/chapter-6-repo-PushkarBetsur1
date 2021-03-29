import java.util.*;
/**
 * Pushkar Betsur
 * 3/23/2021
 * APCS 8th Period
 */
public class Store
{ 
   ArrayList<Customer> c = new ArrayList<Customer>();
  
   
   /**
    * records the sales
    * @param customerName & amount
    */
    public void addSale(String customerName, double amount)
   {
       Customer c1 = new Customer(customerName, amount);
       c.add(c1);
    }
    
   /**
    *  
    */
   public String nameOfBestCustomer()
   {
       
        String name = "Mr.Hayes"; // needed to put something in there for the variable to initalize
        double max = c.get(0).getAmount();
      
       // this for loop checks for the customer with the highest price and replaces them if needed 
       for(Customer p: c){
           if(p.getAmount() > max)
           {
               max = p.getAmount();
           }}
       
           
        // this for loop find the name of the best customer and makes sure that they had the highest price 
       for(Customer p: c){
           if(p.getAmount() == max)
           {
               name = p.getName();
           }}
       
       return name;
       
   }
}
