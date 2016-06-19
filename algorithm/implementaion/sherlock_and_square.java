import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int c,i=Integer.parseInt(in.nextLine());
       for(int n=0;n<i;n++)
       {
           c=0;
           long s=in.nextLong();
           long e=in.nextLong();
           if(Math.sqrt(s)==Math.round(Math.sqrt(s)))s=s-1;
           c=(int)Math.sqrt(e)-(int)Math.sqrt(s);
           System.out.println(c);
       }
    }
}
