//https://www.codechef.com/DEC19B/submit/SUBSPLAY

import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.Integer;

class Lol
{
 static int minDistance(char[] StrArray, int N)
 {
     HashMap<Character,Integer> map = new HashMap<Character,Integer>();
     int min_dist = 999999999;
     for (int i = 0; i < N; i++)
     {
         if (map.containsKey(StrArray[i])) {
             min_dist = Math.min(min_dist, i - map.get(StrArray[i]));
             map.put(StrArray[i],i);
         }
         else
        	 map.put(StrArray[i],i);
     }
     return min_dist;
}

public static void main(String args[])
{
	try {
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	for(int t=0;t<T;t++) {
		int x = sc.nextInt();
		String S = sc.next();
		char[] StrArray = S.toCharArray();
		int N = StrArray.length;
		int min = minDistance(StrArray,N);
		System.out.println(min);
		if(min==999999999)
			System.out.println(0);
		else
			System.out.println(N-min);
	}
	}
	catch(Exception e) {
		//ignore
	}
} //end of main
} //end of class
