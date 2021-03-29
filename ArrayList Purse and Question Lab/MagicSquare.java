
/**
 * Pushkar Betsur
 * 3/16/21
 * APCS 8th Period
 */
public class MagicSquare
{
  int magicnum = 0;
  private int [][] array;
  public MagicSquare(int [] [] array)
  {
    this.array = array;
    magicnum = 0;
    for (int c = 0; c < array[1].length; c++){
       magicnum += array [1] [c];}
    
  }
  public boolean isMagic()
 {
    int cont = 0;
    boolean magicsquare = true;
    for (int r = 0; r < array.length && magicsquare == true; r++){
        for (int c = 0; c < array[r].length; c++){
            cont += array [r][c];}
        
        if (cont != magicnum)
         magicsquare = false;
         cont = 0;}
    
    //this for loop checks for the first diagonol
    for (int x = 0; x < array.length && magicsquare == true; x++) {
        cont += array [x] [x];}
    
    if (cont != magicnum)
      magicsquare = false;
      cont = 0;
    
    //This one checks for the next diagonol 
    for (int d = 0; d < array.length && magicsquare == true; d++) {
        cont += array [d] [array.length-1 - d];}

    if (cont != magicnum)
       magicsquare = false;
       cont = 0;

    //column check 
    for (int r = 0; r < array.length && magicsquare == true; r++){
        for (int c = 0; c < array[r].length; c++){
            cont += array [c][r];}

        if (cont != magicnum)
         magicsquare = false;
         cont = 0; }
     System.out.println();
     
    return magicsquare; 
    }
  public int getMagicNum()
   {
       return this.magicnum;
   }
  public void setMagicSquare(int [] [] array)
   {
       this.array = array;
   }
}
    
    
