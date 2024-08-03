package problems;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'getMinSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY security_values
     *  2. STRING msg
     */

    public static int getMinSum(List<Integer> security_values, String msg) {

    // Write your code here
        
        String[] characters = new String[] {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", 
        "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        String[] charactersFromMsg = msg.split("");
        List<Integer> intList = new ArrayList<>();

        List<Integer> listOfNumToSum = new ArrayList<>();

        //Find the index of the each character of the msg
        for (int _idx = 0; _idx < charactersFromMsg.length; _idx++) {

            String cfm = charactersFromMsg[_idx];

            for (int idx = 0; idx < characters.length; idx++) {    
                if (cfm == characters[idx]) {
                    intList.add(idx);
                    break;
                }
            }
        }

        //Get list of the numbers to sum
        for (int idx = 0; idx < intList.size(); idx++) {
            int intTemp = intList.get(idx);
            listOfNumToSum.add(intTemp);
        }

        //Do the combination transition here
        List<List<Integer>> listOfTransittedValues = listOfTransittedValues();

        //Go through the listOfTransittedValue and find the minium sum


        List<Integer> listOfSums = new ArrayList<>();

        int sum = 0;
        for (int idx = 0; idx < listOfTransittedValues.size(); idx++) {
            //Each index through the for loop is a sum
            listOfNumToSum = listOfTransittedValues.get(idx);
            
            //Find the sum
            for (int _idx = 0; idx < listOfNumToSum.size(); _idx++) {

                sum += Math.abs(_idx - (_idx+1));

                if (_idx == listOfNumToSum.size() -1) {

                    //Add the sum to listOfsums
                    listOfSums.add(sum);
                }
            }
        }

        //Find the min number of in the listOfSums and print it out
        return Collections.min(listOfSums);
    }

    private static void doTransition() {

    }

    private static List<List<Integer>> listOfTransittedValues() {

        List<List<Integer>> listOfTransittedValues = new ArrayList<>();

        int numberOfCombinationsCanBeTransitted;

        // for (int idx = 0; idx < numberOfCombinationsCanBeTransitted; idx++) {
        //     doTransition();
        // }

        //Return the list of transitted values
        return listOfTransittedValues;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int security_valuesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> security_values = IntStream.range(0, security_valuesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        String msg = bufferedReader.readLine();

        int result = Result.getMinSum(security_values, msg);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
