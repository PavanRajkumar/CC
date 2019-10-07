
import java.util.*;
class Codechef {

	public static void main(String args[]) {

		try{
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for(int i=0;i<T;i++) {

			int N = sc.nextInt();
			int M = sc.nextInt();

			if(N<=300 & M<=300){
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
			else{
			int row[] = new int[N+1];
			int col[] = new int[M+1];
			int arr[][] = new int[N+1][M+1];

			int Q = sc.nextInt();
			for(int j=0;j<Q;j++) {
				int x = sc.nextInt();
				int y = sc.nextInt();

				row[x]+=1;
				col[y]+=1;

			}

			int count = 0;
			for(int x=1;x<N+1;x++) {
				for(int y=1;y<M+1;y++) {
					if((row[x]+col[y])%2!=0)
						count++;
				}
			}
			System.out.println(count);
		}
		}

		}
		catch(Exception e){
		    //ignore
		}

	}//end of main

}//end of class
