import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      int[] d=new int[100];
       int pg,l,c,cp=0,i=in.nextInt();
       int m=in.nextInt();
       for(int n=0;n<i;n++)
       {
          d[n]=in.nextInt();
       }
       c=0;pg=0;l=0;
       while(c<i)
       {
         l=d[c];
         for(int g=1;g<=l;g=g+m)
         {
           pg=pg+1;
           if(pg>=g && pg<g+m && pg<=l)
           cp=cp+1;
         }
         c=c+1;
       }
       System.out.println(cp);
    }
}
