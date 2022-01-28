/*Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.*/

JAVA Code:-

import java.util.*;
import java.io.*;
public class leetcode3
{
    public boolean digisum(int n)
    {
        int s=0;
        if(n<10)
        {
            if(n==1)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            while(n>0)
            {
                int d=n%10;
                s=s+(int)(Math.pow(d,2));
                n=n/10;
            }
            n=s;
            return digisum(n);
        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n,s=0;
        boolean k=false;
        System.out.println("Enter the number");
        n=in.nextInt();
        leetcode3 ob = new leetcode3();
        if((n/10)<=0)
        {
        k=ob.digisum(n*n);
        }
        else
        {
        k=ob.digisum(n);
        }   
        System.out.println(k);
    }
}
