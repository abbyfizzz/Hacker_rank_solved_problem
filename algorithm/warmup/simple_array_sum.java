import java.io.*;
import java.util.*;

public class first {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans=0,i=Integer.parseInt(in.nextLine());
        for(int m=0;m<i;m++)
            ans=ans+in.nextInt();
        System.out.print(ans);
    }
}

