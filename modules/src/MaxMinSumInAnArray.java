import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class MaxMinResult {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    static int getIndexOfMaxNumber(List<Integer> subtractedArr) {

         int max = 0;

         for (int i = 0; i < subtractedArr.size(); i++) {
             if (subtractedArr.get(i) > max)
                 max = subtractedArr.get(i);
         }

         return subtractedArr.indexOf(max);
    }

    static int getIndexOfMinNumber(List<Integer> subtractedArr) {

        int min = subtractedArr.get(0);

        for (int i = 1; i < subtractedArr.size(); i++) {
            if (subtractedArr.get(i) < min)
                min = subtractedArr.get(i);
        }

        return subtractedArr.indexOf(min);
    }

    public static void miniMaxSum(List<Integer> givenArr) {

        int sum = 0;
        int minSum = 0;
        int maxSum = 0;

        //Get the sum of the given arr
        for (int i = 0; i < givenArr.size(); i++)
            sum += givenArr.get(i);

        List<Integer> subtractedNumbers = new ArrayList<>();

        for(int idx = 0; idx < givenArr.size(); idx++)
            subtractedNumbers.add(sum - givenArr.get(idx));

        int minIndex = getIndexOfMinNumber(subtractedNumbers);
        int maxIndex = getIndexOfMaxNumber(subtractedNumbers);

        for(int idx = 0; idx < givenArr.size(); idx++){

            if (idx == minIndex) {
                continue;
            }

            minSum += givenArr.get(idx);
        }

        for(int idx = 0; idx < givenArr.size(); idx++){

            if (idx == maxIndex) {
                continue;
            }

            maxSum += givenArr.get(idx);
        }

        System.out.println(minSum + " " + maxSum);
    }
}

public class MaxMinSumInAnArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        MaxMinResult.miniMaxSum(arr);

        bufferedReader.close();
    }
}
