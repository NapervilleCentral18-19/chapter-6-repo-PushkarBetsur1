import java.util.Random;

public class GetSecondLargest
{
   public int getSecondLargest(int[] arr)
   {
      // One way to do it: Find maximum once.
      int largestnum = 0; 
      int max = arr[0];
       for (int s: arr)
       {
           if (s <= largestnum)
           {
               largestnum = largestnum; 
            }
           else if (s > largestnum)
           {
               largestnum = s; 
               
            }
            
           
       }
      

      // 2. Find the max again, ignoring the real max.
      int oldMax = max;
      max = arr[0];

      return largestnum; 
   }

   public static void main(String[] args)
   {
      int[] randoms = new int[10];
      Random generator = new Random();

      // Create a test array containing random numbers.
      for (int i = 0; i < randoms.length; i++)
      {
         randoms[i] = generator.nextInt(100) + 1;
         // Print the values as they are assigned.
         System.out.print(randoms[i] + " ");
      }
      System.out.println();

      // Find the second largest.
      GetSecondLargest util = new GetSecondLargest();
      System.out.println("The second largest number is "
            + util.getSecondLargest(randoms));
   }
}
