//https://www.hackerrank.com/challenges/picking-numbers/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        int a[] = new int[n];

        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();


        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++)
        {
            if (mp.containsKey(a[i]))
            {
                mp.put(a[i], mp.get(a[i]) + 1);
            }
            else
            {
                mp.put(a[i], 1);
            }
        }

        int count[] = new int[n];
        int x = 0;
        for (Map.Entry<Integer, Integer> entry : mp.entrySet())
        {
            count[x] = entry.getValue();
            x++;
        }



        int max = 0;
        for(int j=0;j<n-1;j++) {
            if(count[j]+count[j+1]>max)
                max = count[j]+count[j+1];
        }

        System.out.println(max);


        }




}
