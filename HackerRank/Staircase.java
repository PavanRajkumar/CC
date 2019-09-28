https://www.hackerrank.com/challenges/staircase/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the staircase function below.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for(int i=1;i<=n;i++)
        {
             for(int k=n;k>i;k--)
             {
                 System.out.print(" ");
             }
             for(int j=1;j<=i;j++)
             {
                 System.out.print("#");
             }
            System.out.println();
        }

        scanner.close();
    }
}
