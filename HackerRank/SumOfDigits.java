
//https://www.codechef.com/problems/FLOW006

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
 public static void main(String[] args) {
     try {


        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-->0){
            char[] n = scanner.next().toCharArray();
            int total = 0;
            for (char i : n) total += Integer.valueOf(String.valueOf(i));
            System.out.println(total);
        }
     } catch(Exception e) {
         return;
     }
    }
}
