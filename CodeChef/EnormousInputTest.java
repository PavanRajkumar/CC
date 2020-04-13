//https://www.codechef.com/problems/INTEST

import java.util.Scanner;
// Remember that the class name should be "Main" and should be "public".
public class EnormousInputTest{
	    public static void main(final String[] args) {}
        try{
        final Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        final long k = sc.nextLong();
        long count = 0;
        while (n>0){
            if (sc.nextLong()%k==0){
            count++;
            }
            n--;
        }
        System.out.println(count);
        sc.close();
        }
        catch(Exception e){
            return;
        }
    }

}
