import java.io.*;
import java.util.*;

public class pro6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i=Integer.parseInt(in.nextLine());
        for(int j=0;j<i;j++)
        {
          int n=in.nextInt(),t=in.nextInt(),p=0;
          for (int l=0;l<n;l++)
          if(in.nextInt()<=0)
          p=p+1;
          if(p<t)
            System.out.println("YES");
          else
            System.out.println("NO");
        }
    }
}
