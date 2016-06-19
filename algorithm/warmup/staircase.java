import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i=Integer.parseInt(in.nextLine());

          for(int m=1;m<=i;m++)
          {
            for(int l=0;l<i-m;l++)
            System.out.print(" ");
            for(int k=0;k<m;k++)
            System.out.print("#");
            System.out.print("\n");
          }
    }
}
