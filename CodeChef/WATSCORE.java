import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try{
	    Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int i=0;i<T;i++) {

			int a[] = new int[12];
			int N = sc.nextInt();

			for(int j=0;j<N;j++) {
				int place = sc.nextInt();
				int score = sc.nextInt();
				if(score>=a[place])
					a[place] = score;
			}
			int sum = 0;
			for(int k=1;k<9;k++) {
				//System.out.print(a[k]+ " ");
				sum = sum + a[k];
			}
			System.out.println(sum);
		}
	    }
	    catch(Exception e){
	        //ignore
	    }
	}
}
