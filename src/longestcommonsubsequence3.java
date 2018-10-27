import java.util.*;
public class longestcommonsubsequence3 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        String b=s.next();
        String c=s.next();
        char [] astr=a.toCharArray();
        char[] bstr=b.toCharArray();
        char[] cstr=c.toCharArray();
        int m=a.length();
        int n=b.length();
        int o=c.length();
        int[][][] lcs=new int[m+1][n+1][o+1];
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                for(int k=0;k<=o;k++)
                {
                    if(i==0||j==0||k==0)
                        lcs[i][j][k]=0;
                    else if(astr[i-1]==bstr[j-1]&&astr[i-1]==cstr[k-1])
                        lcs[i][j][k]=lcs[i-1][j-1][k-1]+1;
                    else
                        lcs[i][j][k]=Math.max(Math.max(lcs[i-1][j][k],lcs[i][j-1][k]),lcs[i][j][k-1]);
                }
            }
        }
        System.out.println(lcs[m][n][o]);
    }
}
