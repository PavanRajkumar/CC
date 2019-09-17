//https://www.codechef.com/problems/HS08TEST

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) 
	{
	    try{
	        // your code goes here
		Scanner sc = new Scanner(System.in);
		int withdraw = sc.nextInt();
		float initial_balance = sc.nextFloat();
		
		if(withdraw%5!=0 || withdraw+0.5>initial_balance){
		    System.out.println(initial_balance);
		}
		else{
		    System.out.println(initial_balance-(withdraw+0.5));
		}
		
			//Your Solve
		}catch(Exception e){
			return;
		}
		
		
	}
}

