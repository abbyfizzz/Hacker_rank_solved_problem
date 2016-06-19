import java.io.*;
import java.util.*;

public class pro2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t,p=0,n=0,z=0,i=Integer.parseInt(in.nextLine());

        for(int m=0;m<i;m++)
        {
          t=in.nextInt();
          if(t==0)
            z=z+1;
          if(t<0)
            n=n+1;
          if(t>0)
            p=p+1;
        }
        System.out.println((float)p/i);
        System.out.println((float)n/i);
        System.out.println((float)z/i);
    }
}

