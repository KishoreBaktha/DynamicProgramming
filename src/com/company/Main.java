package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
     Scanner s =new Scanner(System.in);
     int money=s.nextInt();
     int n=s.nextInt();
     int[] coins=new int[n];
     for(int i=0;i<n;i++)
      coins[i]=s.nextInt();
     int numcoins=0;
     int[] minnumcoins=new int[money+1];
     for(int i=1;i<=money;i++)
     {
         minnumcoins[i]=Integer.MAX_VALUE;
         for(int j=0;j<n;j++)
         {
             if(i>=coins[j])
                 numcoins=minnumcoins[i-coins[j]]+1;
             if(numcoins<minnumcoins[i])
                 minnumcoins[i]=numcoins;
         }
     }

     System.out.println(minnumcoins[money]);
    }
}
