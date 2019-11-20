//https://www.hackerrank.com/challenges/acm-icpc-team/problem

import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {

        //INPUT
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input[] = br.readLine().split(" ");
        short N = Short.parseShort(input[0]);
        short M = Short.parseShort(input[1]);
        byte[][] topics = new byte[N][M];
        for(short i = 0; i < N; ++i){
            char[] arr = br.readLine().toCharArray();
            for(int j = 0; j < M; ++j){
                topics[i][j] = (byte)(arr[j] - '0');
            }
        }

        //SOLVE
        short num = 0;
        short max = 0;
        for(short i = 0; i < N; ++i){
            for(short j = (short)(i+1); j < N; ++j){
                short numTopics = 0;
                for(short k = 0; k < M; ++k){
                    numTopics += topics[i][k] | topics[j][k];
                }
                if (max < numTopics){
                    num = 1;
                    max = numTopics;
                } else if(max == numTopics){
                    ++num;
                }
            }
        }

        //OUTPUT
        System.out.println(max);
        System.out.print(num);
    }
}
