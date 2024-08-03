package Problems;

import java.io.*;
import java.text.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class PMResult {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    static String getValuesWith5Digits(double result) {

        DecimalFormat df = new DecimalFormat("#.00000");
        return df.format(result);
    }

    public static void plusMinus(List<Integer> inputtedList) {

        int denominator = inputtedList.size();
        int totalOfNegatives = 0;
        int totalOfPositives = 0;
        int totalOfZeros = 0;

        for (Integer number : inputtedList) {

            if (number == 0) {
                totalOfZeros++;
                continue;
            }

            if (number < 0) {
                totalOfNegatives++;
                continue;
            }

            if (number > 0)
                totalOfPositives++;
        }

        System.out.println(getValuesWith5Digits((double) totalOfPositives /denominator));
        System.out.println(getValuesWith5Digits((double) totalOfNegatives /denominator));
        System.out.println(getValuesWith5Digits((double) totalOfZeros /denominator));
    }
}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        PMResult.plusMinus(arr);

        bufferedReader.close();
    }
}
