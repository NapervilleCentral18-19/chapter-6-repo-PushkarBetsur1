public class ContainsDuplicates
{
   public boolean containsDuplicates(int[] arr)
   {
      // Assume no dupes.
      boolean dupes = false;
      int previousnum = 0; 
      
      for (int i = 0; i < arr.length - 1; i++)
      {
        for (int a = 0; a <arr.length -1; a++)
        {
            if (arr[i] == arr[a] && i != a)
            {
                return dupes = true; 
        
            }
         else 
            dupes = false; 
        }
        
            
        }
      
        return dupes; 
   }

   public static void main(String[] args)
   {
      int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 42 };
      int[] arr2 = { 2, 1, 3, 4, 5, 4, 7, 4, 9, 4 };
      ContainsDuplicates util = new ContainsDuplicates();

      // Check if array 1 has dupes.
      if (util.containsDuplicates(arr1))
      {
         System.out.println("Array contains duplicates.");
      }
      else
      {
         System.out.println("Array does NOT contain duplicates.");
      }
      System.out.println("Expected: Array does NOT contain duplicates.");

      // Check if array 2 has dupes.
      if (util.containsDuplicates(arr2))
      {
         System.out.println("Array contains duplicates.");
      }
      else
      {
         System.out.println("Array does NOT contain duplicates.");
      }
      System.out.println("Expected: Array contains duplicates.");
   }
}
