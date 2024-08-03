package Problems;

import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

class _Result {

    /*
     * Complete the 'encryption' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    static List<Character> convertStringToListOfCharacters(String expStr) {
        
        List<Character> listOfChars = new ArrayList<>();

        for (char ch : expStr.toCharArray()) 
            listOfChars.add(ch);        
    
        return listOfChars;
    }

    static String convertCharsToString(List<Character> listOfChars) {

        String convertedStr = "";

        for (Character ch : listOfChars) {
            convertedStr += ch.toString();
        }

        return convertedStr;
    }

    public static String encryption(String str) {
        
        //many gave us place to live

        //Trim the string
        str = str.replace(" ", "");

        int strLength = str.length();
        int absLength = (int) Math.sqrt(strLength);

        int row = absLength;
        int col = absLength+1;

        List<Character> expListOfChars = convertStringToListOfCharacters(str);

        List<List<Character>> twoDListOfChars = new ArrayList<>();

        if (row*col < strLength)
            row = col;

        List<Character> tempList = null;
        int counter = 0;

        rowLoop:
        for (int rIdx = 0; rIdx < row; rIdx++) {
            
            tempList = new ArrayList<>();

            colLoop:
            for (int cIdx = 0; cIdx < col; cIdx++) {

                if (counter == strLength)
                    break colLoop;

                tempList.add(expListOfChars.get(counter));

                counter++;
            }

            twoDListOfChars.add(tempList);
        }

        List<Character> finalListOfChars = null;
        String finalEncodedString = "";

        counter = 0;

        finalLoop:
        for (int cIdx = 0; cIdx < col; cIdx++) {
        
            finalListOfChars = new ArrayList<>();

            childLoop:
            for (int rIdx = 0; rIdx < row; rIdx++) {
                
                if (counter == strLength)
                    break finalLoop;

                if (rIdx == row - 1)
                    if (twoDListOfChars.get(twoDListOfChars.size()-1).size() < cIdx + 1)
                        break childLoop;

                finalListOfChars.add(twoDListOfChars.get(rIdx).get(cIdx));
            }

            finalEncodedString += convertCharsToString(finalListOfChars) + " ";
        }

        return finalEncodedString;
    }
}

public class _Encryption {

    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // String s = bufferedReader.readLine();

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String result = _Result.encryption(input);

        System.err.println(result);

        // bufferedWriter.write(result);
        // bufferedWriter.newLine();

        // bufferedReader.close();
        // bufferedWriter.close();
    }
}
