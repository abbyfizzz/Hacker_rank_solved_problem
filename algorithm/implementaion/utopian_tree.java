import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h,s=0,i=Integer.parseInt(in.nextLine());
        for(int n=0;n<i;n++)
        {
            h=1;
            s=Integer.parseInt(in.nextLine());
            for(int l=1;l<=s;l++)
            {
                if(l%2!=0)
                    h=h*2;
                else
                    h=h+1;
            }
        System.out.println(h);
        }

    }
}
