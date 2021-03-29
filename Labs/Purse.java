
import java.util.ArrayList;
import java.util.Scanner;
public class Purse
{
    //private ArrayList
    private ArrayList <Coin> pocket = new ArrayList <Coin>();
    public Purse (){ 
    
    
    }
  
    public Purse (Coin coin2)
    {
        pocket.add(coin2);
    }

    /**This initializes the coin if need be and sorts it in the arraylist. 
     */
    public void add ()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Which type of coin? ");
        char type = keyboard.next().charAt(0);
        pocket.add(new Coin(type));

    }

    /**accumalates  a total of coins to be sent to the to string method
     * @param n
     */
    public double getTotal()
    {
       double total = 0;
        for(Coin t: pocket){
            total += t.getValue();
       }
       return total;
    }
    /**
     * returns the number of dimes
     */
    int getNumberofDimes()
    {
        int num = 0;
        for(Coin n: pocket){
           if (n.getType() == 'd' || n.getType() == 'D'){
               num++;}
        }
        return num;
    }
    /**
     * returns the number of pennies
     */
    int getNumberofPenny()
    {
        int num = 0;
        for(Coin p: pocket){
           if (p.getType() == 'p' || p.getType() == 'P'){
               num++;}
        }
        return num;
    }
    /**
     * returns number of nickels 
     */
    int getNumberofNickels()
    {
        int num = 0;
        for(Coin n: pocket){
           if (n.getType() == 'n' || n.getType() == 'N'){
               num++;}
        }
        return num;
    }
  
   /**
    * returns numbers of quarters
    */
    int getNumberofQuarters()
    {
        int num = 0;
        for(Coin in: pocket){
           if (in.getType() == 'q' || in.getType() == 'Q'){
               num++;}
        }
        return num;
    }
    
    
     /**
       Removes coin from the arraylist per user invocation 
      @ param char type
     */
    public void remove(char type)
    {
        boolean gone = false;
        for(int i = 0; i < pocket.size() && gone == false; i++){
           if (pocket.get(i).getType() == type){
               pocket.remove(i);
               gone = true;}
        }
        
        if (gone == false)
            System.out.println("No coin to remove");

    }
    /**
     *  Returns everything as a a string 
     */

    public String toString()
    {
        String str = "";
        for (Coin c: pocket){
            str += c + "\n";}
        str += "Total " + getTotal();
        return str;
    }
}
//end of purse
