import java.util.Scanner;
/**
 * Write a description of class GameOfNim here.
 *
 * @authors (Adam Q and Pushkar B)
 * @version (3/10/2021)
 */
public class GameOfNim
{
    private static void displayNim(int [] stones)
    {
        System.out.print("\n");
        for(int i = 0; i < stones[0]; i++)
            System.out.print("O");
        System.out.print("\n");
        for(int i = 0; i < stones[1]; i++)
            System.out.print("O");
        System.out.print("\n");
        for(int i = 0; i < stones[2]; i++)
            System.out.print("O");
        System.out.print("\n");
    }
    
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int [] stones = {3, 5, 8};
        int player1 = 0;
        int row = 0;
        int removeStones = 0;
        while(stones[0] > 0 || stones[1] > 0 || stones[2] > 0)
        {
            if (player1 == 0)
            {
                displayNim(stones);
                System.out.println("Player 1, which pile would you like to remove from?");
                row = in.nextInt();
                //precautionary measure in case the user inputs a number that is out of bounds
                if(row > 3 || row < 1){
                    System.out.println("That's not a row, please select row 1, 2, or 3");
                    row = in.nextInt();
                    }
                System.out.println("How many stones would you like to remove?");
                removeStones = in.nextInt();
                //precautionary measure in case the user inputs a number that is out of bounds
                if(removeStones > stones[row-1] || removeStones < 1){
                    System.out.println("There aren't that many stones in row " + row + ". Please reselect the amount of stones.");
                    removeStones = in.nextInt();
                    }
                stones[row-1] = stones[row-1] - removeStones; 
                player1 = 1;
            }   
            else
            {
                displayNim(stones);
                System.out.println("Player 2, which pile would you like to remove from?");
                row = in.nextInt();
                if(row > 3 || row < 1){
                    System.out.println("That's not a row, please select row 1, 2, or 3");
                    row = in.nextInt();
                    }
                System.out.println("How many stones would you like to remove?");
                removeStones = in.nextInt();
                if(removeStones > stones[row-1] || removeStones < 1){
                    System.out.println("There aren't that many stones in row " + row + ". Please reselect the amount of stones.");
                    removeStones = in.nextInt();
                    }
                stones[row-1] = stones[row-1] - removeStones; 
                player1 = 0;
            }
            
        }
        if(player1 == 0)
            System.out.println("Player 1 wins!");
        else
            System.out.println("Player 2 wins!");
    }   
}
