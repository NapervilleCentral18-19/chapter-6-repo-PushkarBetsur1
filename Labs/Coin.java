/**
 *  
 */


public class Coin
{
    private final int HEADS = 0;
    private final int TAILS = 1;

    private int face;
    private double amount;
    private char type;
    private String name;

    /**-----------------------------------------------------------------
     *  Sets up the coin by flipping it initially.
     */
    public Coin (char coinType)
    {
        type = coinType;
        if ((type == 'p') || (type == 'P')){
            name = "Penny"; amount = 0.01;}
        else if ((type == 'n') || (type == 'N')){
            name = "Nickel"; amount = 0.05;}
        else if ((type == 'd') || (type == 'D')){
            name = "Dime"; amount = 0.10;}
        else if ((type == 'q') || (type == 'Q')){
            name = "Quarter"; amount = 0.25;}}

    /**
     * returns the values of all the coins
     * 
     */
    public Double getValue(){
        return amount;}
   
    /**
     * returns the type of coin
     */
    public char getType(){
        return type;}

     /**  Displays the value and type 
      * 
     */
    public String toString()
    {
        return name + " " + amount;}
}
