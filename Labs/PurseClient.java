import java.util.Scanner;
/**
 * Pushkar Betsur
 * Main/Client for the Purse Lab
 */
public class PurseClient
{
    
     /**
     *
     */
    public static void main(String args[])
    {
        Purse robbery = new Purse();
        Scanner keyboard = new Scanner(System.in); 
        System.out.println("Possible Coins:\nP - Penny\nN - Nickel\nD - Dime\nQ - Quarter");
        System.out.println("\nWhat would you like to do? : \nA - Add Coin\nR - Remove Coin\n? - Display Purse\n0 - End the Program");
        char choice = keyboard.next().toUpperCase().charAt(0);
        // ensures that the user has not inputed the sentinel value 
        while(choice != '0'){
        if ( choice == 'a' || choice == 'A'){ //calls the add method 
            robbery.add();}    
        if( choice == 'r' || choice == 'R'){ // calls the remove method 
            System.out.println("Which coin do you want to remove? ");
            char cchoice = keyboard.next().charAt(0);
            robbery.remove(cchoice);}
        if ( choice == '?'){ // prints out the menu and takes in whether the user would like to input anything else. 
            System.out.println(robbery);}
            
        System.out.println("\nA - Add Coin\nR - Remove Coin\n? - Display Purse\n0 - End");
        choice = keyboard.next().toUpperCase().charAt(0);
        
    }
    }
    
    /**
     * This displays 5 Coin objects: 
     * Penny 0.01
     * Nickel 0.05
     * Dime 0.1
     * Quarter 0.25
     * Total 0.41000000000000003
     * Two extra coins are added (penny & quarter):
     * Penny 0.01
     * Nickel 0.05
     * Dime 0.1 
     * Quarter 0.25
     * Penny 0.01
     * Quarter 0.25
     * Total 0.67
     * Two Coints Removed (Dime and extra penny):
     * Nickel 0.05
     * Quarter 0.25
     * Penny 0.01 
     * Quarter 0.25
     * Total 0.56
     */
    
}
