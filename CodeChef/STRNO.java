import java.util.*;

public class STRNO {

    static int[] pLCM(int N){  
        int ct=0,n=0,i=1,j=1,f=0;
        int arr[] = new int[N];  
        while(n<N){  
            j=1;  
            ct=0;  
            while(j<=i){  
                if(i%j==0)  
                ct++;  
                j++;   
            }  
            if(ct==2){  
                arr[f] = i;
                f++;
                //System.out.printf("%d ",i);  
                n++;  
            }  
            i++;  
        } 
        System.out.println("Primes are: ");
        for(int y=0;y<arr.length;y++){
            System.out.println(arr[y]);
        }      
        return arr;
    }  

    public static long lcm_of_array_elements(int[] element_array) { 
        long lcm_of_array_elements = 1; 
        int divisor = 2;         
        while (true) { 
            int counter = 0; 
            boolean divisible = false;           
            for (int i = 0; i < element_array.length; i++) { 
                if (element_array[i] == 0) { 
                    return 0; 
                } 
                else if (element_array[i] < 0) { 
                    element_array[i] = element_array[i] * (-1); 
                } 
                if (element_array[i] == 1) { 
                    counter++; 
                } 
                if (element_array[i] % divisor == 0) { 
                    divisible = true; 
                    element_array[i] = element_array[i] / divisor; 
                } 
            } 
            if (divisible) { 
                lcm_of_array_elements = lcm_of_array_elements * divisor; 
            } 
            else { 
                divisor++; 
            }
            if (counter == element_array.length) { 
                return lcm_of_array_elements; 
            } 
        } 
    } 

    static long countDivisors(long n) 
    { 
        long cnt = 0; 
        for (long i = 1; i <= Math.sqrt(n); i++) 
        { 
            if (n % i == 0) { 
                // If divisors are equal, 
                // count only one 
                if (n / i == i) 
                    cnt++; 
  
                else // Otherwise count both 
                    cnt = cnt + 2; 
            } 
        } 
        return cnt; 
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0;t<T;t++){
            int X = sc.nextInt();
            int K = sc.nextInt();
            int array[] = new int [K];
            array = pLCM(K);
            long LCM = lcm_of_array_elements(array);
            System.out.println("LCM :" + LCM);
            long NoDivs = countDivisors(LCM); 
            System.out.println("No of divisors :"+ NoDivs);
            if(X == NoDivs)
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}