import java.util.ArrayList;

/**
 * Write a description of class ArrayListPair here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayListRunner
{
   public static void main(String[] args)
   {   String name1,name2, name3; 
       int namelen; 
       
       //A
       ArrayList<String> names = new ArrayList<String>();
       names.add("Alice");
       names.add("Bob");
       names.add("Connie");
       names.add("David");
       names.add("Edward");
       names.add("Fran");
       names.add("Gomez");
       names.add("Harry");
       //B
       System.out.println(names);
       name1 = names.get(0); 
       System.out.println(name1);
       name2 = names.get(7);
       System.out.println(name2);
       
       //C
       namelen = names.size();
       System.out.println(namelen);
       //D
       for(int i = 0; i < names.size(); i++)
       {
           if (i == names.size()-1)
          {
            System.out.println(names.get(i));
          }
        
       }
       
       //E
       name3 = names.set(0,"Alice B Toklas");
       System.out.println(name3);
       //
       
       
       
   }
   
   
} 