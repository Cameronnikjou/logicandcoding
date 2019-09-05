/**
 * Skeleton of a program that takes in the user's birth month and determines the number of days in the month
 *
 * @author Roy Chancellor
 * @version 2/6/2019
 */

import java.util.Scanner;  //enables user input

public class Birthday
{
    public static void main( String[] args) {
        //variable declarations
        int m;
        
        //get user input
        Scanner keys = new Scanner(System.in);
        System.out.println("Enter the number of your birth month"); 
        m= keys.nextInt();
        keys.close();
        
        //determine the number of days in the user's birth month
        if (m==1 || m==3 || m==5|| m==7 || m==8 || m==10 || m==12) {
            System.out.println ("Your birth month has 31 days");
        }
        else if (m==4|| m==6|| m==11|| m==11) {
            System.out.println ("Your bithday month has 30 days");
        }
        else if (m==2) {
            System.out.println ("Your birthday month has 28 days");
        }
            
        
        //output the result to the user
       
    }
}