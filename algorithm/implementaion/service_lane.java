import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int l[]=new int[100000];
       int i=in.nextInt(),t=in.nextInt();
       for(int n=0;n<i;n++)
          l[n]=in.nextInt();
       for(int m=0;m<t;m++)
       {
         int c,s=in.nextInt(),e=in.nextInt();
         c=l[e];
         for(int o=s;o<e;o++)
         if(c>l[o])
         c=l[o];
         System.out.println(c);
       }
    }
}
