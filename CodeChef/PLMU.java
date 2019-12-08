import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int i=0;i<T;i++) {
			int N = sc.nextInt();
			int count0=0;
			int count2=0;
			for(int j=0;j<N;j++) {
				int num = sc.nextInt();
				if(num==0)
					count0++;
				else if(num==2)
					count2++;
			}
			int final0 = (count0*(count0-1))/2;
			int final2 = (count2*(count2-1))/2;
			System.out.println(final0+final2);
		}
		}
		catch(Exception e) {
			//ignore
		}
	}
}
