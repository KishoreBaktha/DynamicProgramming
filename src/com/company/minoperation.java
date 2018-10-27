package com.company;

public class minoperation {
    public static void main(String[] args)
    {
        int minop=0;
        int n=5;
        while(n>1)
        {
            minop++;
            if(n%3==0)
                n=n/3;
            else if(n%2==0)
                n=n/2;
            else
                n=n-1;
        }
        System.out.println(minop);
    }
}

