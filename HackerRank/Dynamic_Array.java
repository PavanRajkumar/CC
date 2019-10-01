//https://www.hackerrank.com/challenges/dynamic-array/problem

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

class Result {

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
    // Write your code here
        List<List<Integer>>  Array = new ArrayList<>();
        List<Integer>  Res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Array.add(new ArrayList<>());
        }

        int lastAnswer = 0;

        for (int i = 0; i < queries.size(); i++) {
            List<Integer> q = queries.get(i);

            if (q.get(0) == 1) {
                Array.get((q.get(1) ^ lastAnswer) % n).add(q.get(2));
            }
            else{
                List<Integer> sequence = Array.get((q.get(1) ^ lastAnswer) % n);
                lastAnswer = sequence.get(q.get(2) % sequence.size());
                Res.add(lastAnswer);
             }
         }
        return Res;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> Res = Result.dynamicArray(n, queries);

        bufferedWriter.write(
            Res.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
