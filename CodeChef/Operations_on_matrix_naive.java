//https://www.codechef.com/OCT19B/problems/SAKTAN

import java.util.*;

public class Codechef {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for(int i=0;i<T;i++) {

			int N = sc.nextInt();
			int M = sc.nextInt();
			int arr[][] = new int[N][M];

			int Q = sc.nextInt();
			for(int j=0;j<Q;j++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				for(int k=0;k<N;k++)
					arr[k][y-1]+=1;
				for(int l=0;l<M;l++)
					arr[x-1][l]+=1;
			}
			int count = 0;
			for(int x=0;x<N;x++) {
				for(int y=0;y<M;y++) {
					if(arr[x][y]%2!=0)
						count++;
				}
			}
			System.out.println(count);
		}

	}

}
