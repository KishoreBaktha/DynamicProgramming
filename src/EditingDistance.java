import java.util.*;
public class EditingDistance {
    public static void main(String[] args)
    {
        char A[]={'s','e','d','i','t','i','n','g'};
        char B[]={'s','d','i','s','t','a','n','c','e'};
        int n=A.length-1;
        int m=B.length-1;
        int[][] D=new int[n+1][m+1];
        for(int j=1;j<=m;j++)
        {
            D[0][j]=j;
        }
            for(int i=1;i<=n;i++)
            {
                D[i][0]=i;
            }
         for(int j=1;j<=m;j++)
         {
             for(int i=1;i<=n;i++)
             {
                 int insertion=D[i][j-1]+1;
                 int deletion=D[i-1][j]+1;
                 int match=D[i-1][j-1];
                 int mismatch=D[i-1][j-1]+1;
                 if(A[i]==B[j])
                 {
                     int temp=Math.min(insertion,deletion);
                     D[i][j]=Math.min(temp,match);
                 }
                 else
                 {
                     int temp=Math.min(insertion,deletion);
                     D[i][j]=Math.min(temp,mismatch);
                 }
             }
         }
         System.out.println(D[n][m]);
    }
}
