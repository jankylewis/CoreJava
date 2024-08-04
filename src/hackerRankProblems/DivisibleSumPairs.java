package hackerRankProblems;

import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

class DivisibleSumPairsResult {

    /*
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */

    public static int divisibleSumPairs(int n, int k, List<Integer> expList) {

        int counter = 0;

        for (int idx = 0; idx < n; idx++) {

            int tempIdx = 0;

            for (int _idx = 0; _idx < expList.size(); _idx++) {

                if (tempIdx == _idx)
                    continue;

                int bf = expList.get(tempIdx);
                int af = expList.get(_idx);

                if ((bf + af) % k == 0)
                    counter++;
            }

            expList.remove(expList.get(tempIdx));
        }

        return counter;
    }
}

public class DivisibleSumPairs {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int n = Integer.parseInt(firstMultipleInput[0]);
//
//        int k = Integer.parseInt(firstMultipleInput[1]);
//
//        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());

        List<Integer> expList = new ArrayList<>();
        expList.add(1);
        expList.add(3);
        expList.add(2);
        expList.add(6);
        expList.add(1);
        expList.add(2);

        int result = DivisibleSumPairsResult.divisibleSumPairs(6, 3, expList);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
