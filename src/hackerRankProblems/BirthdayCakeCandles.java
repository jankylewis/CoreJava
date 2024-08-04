package hackerRankProblems;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class BDCCResult {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    static int getMaxCandle(List<Integer> candles) {

        int maxCandle = 0;

        for (Integer candle : candles) {
            if (candle > maxCandle)
                maxCandle = candle;
        }

        return maxCandle;
    }

    public static int birthdayCakeCandles(List<Integer> candles) {

        int maxCandle = getMaxCandle(candles);
        int totalTallestCandles = 0;

        for (Integer candle : candles) {
            if (candle == maxCandle)
                totalTallestCandles++;
        }

        return totalTallestCandles;
    }
}

public class BirthdayCakeCandles {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = BDCCResult.birthdayCakeCandles(candles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
