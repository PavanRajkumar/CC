//https://www.codechef.com/OCT19B/problems/MARM

import java.util.*;

class Array_Modification_naive{
	public static void main(String args[]) {

		try {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int t=0;t<T;t++) {
			int N = sc.nextInt();
			long K = sc.nextLong();
			long A[] = new long[N];

			for(int j=0;j<=N-1;j++)
				A[j] = sc.nextInt();

			for(long i=0;i<=K-1;i++) {
				long r = i%N;
				A[(int) (r)] = A[(int) (r)] ^ A[(int) (N-(r)-1)];
			}

			for(int k=0;k<=N-1;k++)
				System.out.print(A[k] + " ");

			}
			sc.close();
		}
		catch(Exception e) {
			//ignore
		}	
	}
}
