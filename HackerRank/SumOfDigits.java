
//https://www.codechef.com/problems/FLOW006

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class SumOfDigits
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
            scanner.close();
        }
     } catch(Exception e) {
         return;
     }
     
    }
}
