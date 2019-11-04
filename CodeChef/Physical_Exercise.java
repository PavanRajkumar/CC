//https://www.codechef.com/NOV19B/problems/PHCUL
import java.util.*;
import java.lang.*;

import java.lang.*;
	public class CodeForces{

		//global variable
		public static long a,b,c,d,e,f,a2,c2,b2,d2,e2,f2;

	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	int T = sc.nextInt();                   //for test cases

	    	for(int t=0;t<T;t++) {

	    		long x = sc.nextLong();
	    		long y = sc.nextLong();
	    		int N = sc.nextInt();
	    		int M = sc.nextInt();
	    		int K = sc.nextInt();

	    		long Narray[] = new long[N*2];
	    		long Marray[] = new long[M*2];
	    		long Karray[] = new long[K*2];

	    		for(int n=0;n<N*2;n++)
	    			Narray[n] = sc.nextLong();
	    		for(int m=0;m<M*2;m++)
	    			Marray[m] = sc.nextLong();
	    		for(int k=0;k<K*2;k++)
	    			Karray[k] = sc.nextLong();

	    		//checking for (x,y) to (a,b)=N
          //(x,y) to N to M to K

	    		double minN = Math.sqrt(Math.pow(Narray[0] - x, 2) + Math.pow(Narray[1] - y, 2));
	    		for(int i=2;i<N*2-1;i+=2) {
	    			double tempN = Math.sqrt(Math.pow(Narray[i] - x, 2) + Math.pow(Narray[i+1] - y, 2));
	    			if(tempN<minN) {
	    				minN = tempN;
	    				a = Narray[i];             //for storing coordinates which satisfy minimum value
	    				b = Narray[i+1];
	    			}
	    		}

				double minM = Math.sqrt(Math.pow(Marray[0] - a, 2) + Math.pow(Marray[1] - b, 2));
	    		for(int i=2;i<M*2-1;i+=2) {
	    			double tempM = Math.sqrt(Math.pow(Marray[i] - a, 2) + Math.pow(Marray[i+1] - b, 2));
	    			if(tempM<minM) {
	    				minM = tempM;
	    				long c = Marray[i];        //for storing coordinates which satisfy minimum value
	    				long d = Marray[i+1];
	    			}
	    		}

	    		double minK = Math.sqrt(Math.pow(Karray[0] - c, 2) + Math.pow(Karray[1] - d, 2));
	    		for(int i=2;i<K*2-1;i+=2) {
	    			double tempK = Math.sqrt(Math.pow(Karray[i] - c, 2) + Math.pow(Karray[i+1] - d, 2));
	    			if(tempK<minK) {
	    				minK = tempK;
	    				long e = Karray[i];
	    				long f = Karray[i+1];
	    			}
	    		}

	    		double minimum_with_N_first = minN + minM + minK;



          //checking for (x,y) to (c,d)=M
          //(x,y) to M to N to K

	    		double minM2 = Math.sqrt(Math.pow(Marray[0] - x, 2) + Math.pow(Marray[1] - y, 2));
	    		for(int i=2;i<M*2-1;i+=2) {
	    			double tempM2 = Math.sqrt(Math.pow(Marray[i] - x, 2) + Math.pow(Marray[i+1] - y, 2));
	    			if(tempM2<minM2) {
	    				minM2 = tempM2;
	    				long c2 = Marray[i];         //for storing coordinates which satisfy minimum value
	    				long d2 = Marray[i+1];
	    			}
	    		}

	    		double minN2 = Math.sqrt(Math.pow(Narray[0] - c2, 2) + Math.pow(Narray[1] - d2, 2));
	    		for(int i=2;i<N*2-1;i+=2) {
	    			double tempN2 = Math.sqrt(Math.pow(Narray[i] - c2, 2) + Math.pow(Narray[i+1] - d2, 2));
	    			if(tempN2<minN2) {
	    				minN2 = tempN2;
	    				a2 = Narray[i];              //for storing coordinates which satisfy minimum value
	    				b2 = Narray[i+1];
	    			}
	    		}

	    		double minK2 = Math.sqrt(Math.pow(Karray[0] - a2, 2) + Math.pow(Karray[1] - b2, 2));
	    		for(int i=2;i<K*2-1;i+=2) {
	    			double tempK2 = Math.sqrt(Math.pow(Karray[i] - a2, 2) + Math.pow(Karray[i+1] - b2, 2));
	    			if(tempK2<minK2) {
	    				minK2 = tempK2;
	    				long e2 = Karray[i];
	    				long f2 = Karray[i+1];
	    			}
	    		}

	    		double minimum_with_M_first = minN2 + minM2 + minK2;

	    		if(minimum_with_M_first < minimum_with_N_first)
	    			System.out.println(minimum_with_M_first);
	    		else
	    			System.out.println(minimum_with_N_first);



	    	}//end of test case
	    }
	}
