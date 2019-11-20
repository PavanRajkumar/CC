//https://www.hackerrank.com/challenges/circular-array-rotation/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        int[] a = new int[n];

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        for(int j=0;j<q;j++){
            int m = sc.nextInt();
            int index = (n-(k%n)+m)%n;
            System.out.println(a[index]);
        }
    }
}
