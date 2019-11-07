//https://www.codechef.com/NOV19B/problems/PHCUL

import java.util.*;
import java.lang.*;

	public class CodeForces{

		//global variable
		public static long a,b,c,d,e,f,a2,c2,b2,d2,e2,f2;

	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	int T = sc.nextInt();

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

	    		double minN = Math.sqrt(Math.pow(Narray[0] - x, 2) + Math.pow(Narray[1] - y, 2));
	    		a = Narray[0];
				b = Narray[1];
	    		for(int i=2;i<N*2-1;i+=2) {
	    			double tempN = Math.sqrt(Math.pow(Narray[i] - x, 2) + Math.pow(Narray[i+1] - y, 2));
	    			if(tempN<minN) {
	    				minN = tempN;
	    				a = Narray[i];
	    				b = Narray[i+1];
	    				//System.out.println("("+a+","+b+")");
	    	    		//System.out.println("minimum N " + minN);

	    			}
	    		}



				double minM = Math.sqrt(Math.pow(Marray[0] - a, 2) + Math.pow(Marray[1] - b, 2));
				c = Marray[0];
				d = Marray[1];
	    		for(int i=2;i<M*2-1;i+=2) {
	    			double tempM = Math.sqrt(Math.pow(Marray[i] - a, 2) + Math.pow(Marray[i+1] - b, 2));
	    			if(tempM<minM) {
	    				minM = tempM;
	    				c = Marray[i];
	    				d = Marray[i+1];
	    				//System.out.println("("+c+","+d+")");
	    	    		//System.out.println("minimum M " + minM);
	    			}
	    		}
	    		//System.out.println("("+c+","+d+")");
	    		//System.out.println("minimum M " + minM);



	    		double minK = Math.sqrt(Math.pow(Karray[0] - c, 2) + Math.pow(Karray[1] - d, 2));
	    		e = Karray[0];
				f = Karray[1];
	    		for(int i=2;i<K*2-1;i+=2) {
	    			double tempK = Math.sqrt(Math.pow(Karray[i] - c, 2) + Math.pow(Karray[i+1] - d, 2));
	    			if(tempK<minK) {
	    				minK = tempK;
	    				e = Karray[i];
	    				f = Karray[i+1];
	    				//System.out.println("("+e+","+f+")");
	    	    		//System.out.println("minimum K " + minK);
	    			}
	    		}


	    		double minimumN = minN + minM + minK;
	    		//System.out.println("sum minimum with N "+minimumN);




	    		double minM2 = Math.sqrt(Math.pow(Marray[0] - x, 2) + Math.pow(Marray[1] - y, 2));
	    		c2 = Marray[0];
				d2 = Marray[1];
	    		for(int i=2;i<M*2-1;i+=2) {
	    			double tempM2 = Math.sqrt(Math.pow(Marray[i] - x, 2) + Math.pow(Marray[i+1] - y, 2));
	    			if(tempM2<minM2) {
	    				minM2 = tempM2;
	    				c2 = Marray[i];
	    				d2 = Marray[i+1];
	    			  //System.out.println("("+c2+","+d2+")");
	    	    	  //System.out.println("minimum M2 " + minM2);
	    			}
	    		}


	    		double minN2 = Math.sqrt(Math.pow(Narray[0] - c2, 2) + Math.pow(Narray[1] - d2, 2));
	    		a2 = Narray[0];
				b2 = Narray[1];
	    		for(int i=2;i<N*2-1;i+=2) {
	    			double tempN2 = Math.sqrt(Math.pow(Narray[i] - c2, 2) + Math.pow(Narray[i+1] - d2, 2));
	    			if(tempN2<minN2) {
	    				minN2 = tempN2;
	    				a2 = Narray[i];
	    				b2 = Narray[i+1];
	    				//System.out.println("("+a2+","+b2+")");
	    	    		//System.out.println("minimum N2 " + minN2);
	    			}
	    		}


	    		double minK2 = Math.sqrt(Math.pow(Karray[0] - a2, 2) + Math.pow(Karray[1] - b2, 2));
	    		e2 = Karray[0];
				f2 = Karray[1];
	    		for(int i=2;i<K*2-1;i+=2) {
	    			double tempK2 = Math.sqrt(Math.pow(Karray[i] - a2, 2) + Math.pow(Karray[i+1] - b2, 2));
	    			if(tempK2<minK2) {
	    				minK2 = tempK2;
	    				e2 = Karray[i];
	    				f2 = Karray[i+1];
	    				//System.out.println("("+e2+","+f2+")");
	    	    		//System.out.println("minimum K2" + minK2);
	    			}
	    		}


	    		double minimumM = minN2 + minM2 + minK2;
	    		//System.out.println("minimum with M "+minimumM);

	    		if(minimumM<minimumN)
	    			System.out.println(minimumM);
	    		else
	    			System.out.println(minimumN);



	    	}//end of test case
	    }
	}
