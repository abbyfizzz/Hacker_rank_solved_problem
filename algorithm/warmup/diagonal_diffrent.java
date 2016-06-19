import java.io.*;
import java.util.*;

public class pro1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sm=0,s1=0,i=Integer.parseInt(in.nextLine());
        int[][] s=new int[400][400];
        for(int m=0;m<i;m++)
          for(int n=0;n<i;n++)
          {
              s[m][n]=in.nextInt();
              if(n==m)
                sm=sm+s[m][m];
          }
        for(int t=0;t<i;t++)
          s1=s1+s[t][i-t-1];
        if(s1<sm)
        System.out.println(sm-s1);
        else
        System.out.println(s1-sm);
    }
}

