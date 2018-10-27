package com.company;

import java.util.Scanner;

public class knapsack {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int W=s.nextInt();
        int n=s.nextInt();
        int [] we=new int[n+1];
        int[] v=new int[n+1];
        for(int i=1;i<=n;i++)
        {
            we[i]=s.nextInt();
            v[i]=s.nextInt();
        }
        int[][] value=new int[W+1][n+1];
        for(int i=0;i<=n;i++)
            value[0][i]=0;
        for(int i=0;i<=W;i++)
            value[i][0]=0;int val=0;
        for(int i=1;i<=n;i++)
        {
            for(int w=1;w<=W;w++)
            {
                value[w][i]=value[w][i-1];
                if(we[i]<=w)
                {
                    val=value[w-we[i]][i-1]+v[i];
                    if(value[w][i]<val)
                        value[w][i]=val;
                }
                val=0;
            }val=0;
        }
        System.out.println(value[W][n]);
    }
}
