import java.util.*;
public class longestsubsequence {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        String b=s.next();
        char[] astr=a.toCharArray();
        char [] bstr=b.toCharArray();
        int m=a.length();int n=b.length();
        int [][] lcs=new int[m+1][n+1];
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(i==0||j==0)
                    lcs[i][j]=0;
                else if(astr[i-1]==bstr[j-1])
                    lcs[i][j]=lcs[i-1][j-1]+1;
                else
                    lcs[i][j]=Math.max(lcs[i-1][j],lcs[i][j-1]);
            }
        }
        System.out.println(lcs[m][n]);
    }

}
