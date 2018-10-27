package com.company;
import java.util.*;
public class maxmisingvalueparanthesis {
    static int min,max;
    static int[][] m,M;
    static List<Integer> d=new ArrayList<Integer>();
   static List<Character> op=new ArrayList<Character>();
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        //int n=s.nextInt();
        //s.next();
        String str=s.next();
        for(int i=0;i<str.length();i++)
        {
            if(i%2==0)
            d.add(str.charAt(i)-48);
            else
             op.add(str.charAt(i));
        }
         m=new int[d.size()+1][d.size()+1];
        M=new int[d.size()+1][d.size()+1];
        System.out.println(paranthesis(d,op));
    }

    private static int paranthesis(List<Integer> d, List<Character> op) {
        for(int i=1;i<=d.size();i++)
        {
            m[i][i]=d.get(i-1);
            M[i][i]=d.get(i-1);
        }
        for(int s=1;s<=d.size()-1;s++)
        {
            for(int i=1;i<=d.size()-s;i++)
            {
                int j=i+s;
                minandmax(i,j);
                m[i][j]=min;
                M[i][j]=max;
            }
        }
        return M[1][d.size()];
    }

    private static void minandmax(int i, int j) {
       min=999999;
       max=-1;
       for(int k=1;k<=j-1;k++)
       {
           int a=0,b=0,c=0,d=0;
           if(op.get(k-1)=='+')
           {
                a=M[i][k]+M[k+1][j];
                b=M[i][k]+m[k+1][j];
                c=m[i][k]+M[k+1][j];
                d=m[i][k]+m[k+1][j];
           }
           else if(op.get(k-1)=='-')
           {
                a=M[i][k]-M[k+1][j];
                b=M[i][k]-m[k+1][j];
                c=m[i][k]-M[k+1][j];
                d=m[i][k]-m[k+1][j];
           }
           else if(op.get(k-1)=='*')
           {
                a=M[i][k]*M[k+1][j];
                b=M[i][k]*m[k+1][j];
                c=m[i][k]*M[k+1][j];
                d=m[i][k]*m[k+1][j];
           }
           min=Math.min(min,a);
           min=Math.min(min,b);
           min=Math.min(min,c);
           min=Math.min(min,d);
           max=Math.max(max,a);
           max=Math.max(max,b);
           max=Math.max(max,c);
           max=Math.max(max,d);
       }
    }
}
