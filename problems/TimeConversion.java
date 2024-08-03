package problems;

import java.io.*;

import static java.util.stream.Collectors.joining;

class TCResult {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String expTime) {

        if (expTime.contains("AM")){
            if (expTime.contains("12"))
                return expTime.replace("12", "00").replace("AM", "");

            return expTime.replace("AM", "");
        }

        if (expTime.contains("12"))
            return expTime.replace("PM", "");

        int unconverted = 1;
        int converted = 13;

        int inputtedHour = Integer.parseInt(expTime.substring(0, 2));

        while (unconverted < 12 && converted < 24) {

            if (inputtedHour == unconverted){
                expTime = expTime.replace(expTime.substring(0, 2), String.valueOf(converted));
                break;
            }

            unconverted++;
            converted++;
        }

        return expTime.replace("PM", "");
    }
}

public class TimeConversion {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        String s = bufferedReader.readLine();

        String result = TCResult.timeConversion("12:00:00AM");
        System.out.println(result);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
