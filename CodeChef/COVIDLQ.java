import java.util.Scanner;

public class COVIDLQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int t=0;t<T;t++){
            int N = sc.nextInt();
            int arr[] = new int[N];
            for(int j=0;j<N;j++){
                arr[j] = sc.nextInt();
            }
            int count = 0;
            int flag = 0;
            int var = 0;
            for(int i=0;i<N;i++){               
                if(arr[i] == 1 && flag == 0){
                    flag = 1;
                    count++;
                }
                else if(arr[i] == 0 && flag == 1){
                    count++;                   
                }
                else if(arr[i] == 1 && flag == 1){
                    if(count < 6){
                        var = 1;
                        break;
                    }
                    count = 1;
                }
                /*
                System.out.println(i);
                System.out.println("arr[i] = " + arr[i]);
                System.out.println("Flag = " + flag);
                System.out.println("Count = " + count);
                System.out.println("Var = " + var); 
                */
            }
            if(var == 0)
                System.out.println("YES"); 
            else
                System.out.println("NO");          
        }
        sc.close();
    }
}