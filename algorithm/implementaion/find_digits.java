import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
              int c,i=Integer.parseInt(in.nextLine());
              for(int n=0;n<i;n++)
              {
                  c=0;
                  long d=Long.parseLong(in.nextLine());
                  long s=d;
                  while(d>0)
                  {
                      if(d%10!=0 && s%(d%10)==0)
                          c=c+1;
                      d=d/10;
                  }
              System.out.println(c);
              }
    }
}
