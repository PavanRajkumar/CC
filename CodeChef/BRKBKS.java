//https://www.codechef.com/JAN20B/problems/BRKBKS


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class BRKBKS
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=0;t<T;t++) {
			int S = sc.nextInt();
			int w1 = sc.nextInt();
			int w2 = sc.nextInt();
			int w3 = sc.nextInt();

			if(w1+w2+w3<=S)
				System.out.println(1);

			else if(w1+w2>S) {
				if(w2+w3<=S)
					System.out.println(2);
				else
					System.out.println(3);
			}

			else
				System.out.println(2);
		}
	}
}
