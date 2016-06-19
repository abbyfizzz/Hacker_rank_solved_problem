import java.io.*;
import java.util.*;

public class pro6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c3,c5,val,s,i=Integer.parseInt(in.nextLine());
        for(int j=0;j<i;j++)
        {
          s=Integer.parseInt(in.nextLine());
          val=0;
          c5=0;
          c3=0;

            while(val<s && c3==0)
            {
              if((s-val)%3!=0)
              {

                val=val+5;
                c5=c5+1;
              }
              else
              {
                c3=(s-val)/3;
              }
            }
            if((c3*3)+(c5*5)==s)
            {
              for(int l=0;l<c3*3;l++)
                System.out.print("5");
              for(int g=0;g<c5*5;g++)
                System.out.print("3");
              System.out.println();
            }
            else
            {
              System.out.println("-1");
            }

        }
    }
}
