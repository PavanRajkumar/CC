//https://www.hackerrank.com/challenges/diagonal-difference/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Solution {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int [n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            a[i][j] = sc.nextInt();
            }
        }

        int d1 = 0, d2 = 0;

    for (int i = 0; i < n; i++)
    {
        d1 += a[i][i];
        d2 += a[i][n-i-1];
    }

    // Absolute difference of the sums
    // across the diagonals


        System.out.println(Math.abs(d1-d2));
    }

}
