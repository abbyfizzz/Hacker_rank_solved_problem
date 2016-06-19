import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
       int i=Integer.parseInt(in.nextLine());
       for(int n=0;n<i;n++)
       {
          int r=in.nextInt();
          int wap=0,nu;
          int c=in.nextInt();
          int m=in.nextInt();
          nu=(int)r/c;
          wap=nu;
          while(wap>=m)
          {
            int temp=wap/m;
            wap=wap%m;
            wap=wap+temp;
            nu=nu+temp;
          }
          System.out.println(nu);
       }
    }
}
