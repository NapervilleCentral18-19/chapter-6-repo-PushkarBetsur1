import java.util.*;
import java.io.*;

/**
 * Pushkar Betsur 
 * APCS 8th Period
 */
public class AccountClient
{
    public static void main(String args[]) throws IOException
    {
        String name1, name2, name3, num, bal, x;
        int acctnum, type, cont = 0; 
        double bal2; 
        Account[] accts = new Account[10];
        Scanner keyboard = new Scanner(new File("AccountsData.txt"));
        while(keyboard.hasNext()) {
            name1 = keyboard.next();
            name2 = keyboard.next();
            name3 = name1 + " " + name2;
            num = keyboard.next();
            bal = keyboard.next(); 
            x = keyboard.next();
            acctnum = Integer.parseInt(num);
            type = Integer.parseInt(x);
            bal2 = Double.parseDouble(bal);
            accts[cont] = new Account(name3, acctnum, bal2, type);
            cont++;}
            
        // wasnt too sure how to implement this so i discussed it with some classmates
        Sorts.insertionSort(accts);
        System.out.println();
        Account[] y = new Account[20];
        for (Account act1: accts){
            act1.acctNumber = act1.hashCode();
            y[act1.acctNumber%20] = act1; }
        for(Account s: y){
            System.out.println(s);}
    }
}
