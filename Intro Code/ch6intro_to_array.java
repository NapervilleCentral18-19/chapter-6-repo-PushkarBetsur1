/********************************************************************
// These are the notes for ch 6 used in hayes class


import
//******************************************************************* */


import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;
import java.util.StringTokenizer;
import java.util.*;


public class ch6intro_to_array

{
    final static int MAX = 20;

public static void main (String[] args)
{

/**/
        mathy useful = new mathy();
        int x = 50;
        int [] values; 
        //int values1[];
        // values and numbers are _alias_
        values = useful.poprandomArray(MAX, 10); 
        
/*
 * use an enhanced for loop to pring ALL items in the array
 * do not use i, this denotes an index
 * s is a copy of the value in the array
 * s = values [0], s = values [1] .... [n] - s = x
 * advantage: will not give you an out of bounds error
 * limitations: can not change the int value in the array values
 /**/
  /*for (int s: values)
  {
    System.out.println(s); // NOT number[s]
    s=0; 
  }
  System.out.println(values[0]+"---"); 
  foo (values [0]); 
  System.out.println(values[0]+"VVV"); 
  foo (values); 
  /*

        System.out.println(Searches.linearSearch(num,look)  );
        Sorts.selectionSort(num);
        System.out.println(Searches.binarySearch(num,look)  );



        //for each loop
/*

        useful.getOdd(num,oddnum);




        //System.out.println("----------SORTING-----------"  );






/*
        System.out.println("Enter a number");
        int find = Keyboard.readInt();

        System.out.println(Searches. binarySearch(num,find));

   /*







 /**
 
       //make a two dementional array
       //  r   c 
       int [] [] table = new int [5][10];
       
       // Load the table with values
       // row major & .length - how many rows  
       for (int row=0; row < table.length; row++)
       // [r].length is how many columns 
          for (int col=0; col < table[row].length; col++)
             table[row][col] = row * 10 + col;

       //print the table
        for (int row=0; row < table.length; row++)
        {
            for (int col=0; col < table[row].length; col++)
                System.out.print (table[row][col] + "\t");

            System.out.println();
        }


    // make a 2d array with an iniitalizer list.
    //print the length of row and col
/**/

    int [][] scores = { {1,2,3},//6
                        {2,2,3},//7
                        {3,2,3},//8
                        {4,2,3}    };//9

    //how many columns
    System.out.println(scores[0].length+"col");
    //how many rows
    System.out.println(scores.length+"row");
    
    
   
    //sum entire 2D array
    int sum = useful.sum2DArray(scores); 
    System.out.print("The sum of this array is"+ sum);

    //sum a row of 2D array
    System.out.print("The sum of row ");
    int rsum = useful.sumOneRow2DArray();  






/**/
}// end of main

   public static int[] doubleSize(int[] array)
   {


        return array;


   }

//passing int by value
   public static void foo(int x)
   {

       x = 100;
   }


//arrays are passed by reference
    public static void foo(int [] num)
      {

          num[0] = 100;

      }

    /*


   public static void odd()
   {

       int count =0;


   }// end of odd

    /*  */
}// end of class











