//https://www.hackerrank.com/challenges/migratory-birds/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr,int arrCount) {
        int count_array[] = new int[6];
        for(int i=0;i<arrCount;i++){
            if(arr.get(i) == 1){
                count_array[1]++;
                continue;
            }
            if(arr.get(i) == 2){
                count_array[2]++;
                continue;
            }
            if(arr.get(i) == 3){
                count_array[3]++;
                continue;
            }
            if(arr.get(i) == 4){
                count_array[4]++;
                continue;
            }
            if(arr.get(i) == 5){
                count_array[5]++;
            }
        }

        int max = 0;
        for(int j=1;j<6;j++){
            if(count_array[j]>max)
                max = count_array[j];
        }
        int ret = 0;
        for(int k=0;k<6;k++){
            if(count_array[k] == max){
                ret = k;
                break;
            }
        }

        return ret;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = migratoryBirds(arr,arrCount);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
