//https://www.hackerrank.com/challenges/compare-the-triplets/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String args[]){
        int a[] = new int[3];
        int b[] = new int[3];
        int c[] = new int[2];

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++)
            a[i]=sc.nextInt();

        for(int i=0;i<3;i++)
            b[i]=sc.nextInt();

        for(int i=0;i<3;i++){
            if(a[i]>b[i])
                c[0]++;
            else if(b[i]>a[i])
                c[1]++;
            else
                continue;
        }

        for(int i=0;i<2;i++)
            System.out.print(c[i]+ " ");
    }


}
