package problems;

import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

class DDResult {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> elements) {

        int totalOfElementsCounted = elements.stream().findFirst().get().size();

        int leftDiff = 0;
        int rightDiff = 0;

        //Calculate the left
        for (int idx = 0; idx < totalOfElementsCounted; idx++)
            leftDiff += elements.get(idx).get(idx);

        //Calculate the right

        int up = 0;
        int down = totalOfElementsCounted - 1;

        while (up <= totalOfElementsCounted && down >= 0){
            rightDiff += elements.get(up).get(down);
            up++;
            down--;
        }

        return Math.abs(leftDiff - rightDiff);
    }
}

public class DiagonalDifference {

    public static void main(String[] args) throws IOException {

        List<List<Integer>> arr = new ArrayList<>(){{
            add(new ArrayList<>(){{
                add(11);
                add(2);
                add(4);
            }});
            add(new ArrayList<>(){{
                add(4);
                add(5);
                add(6);
            }});
            add(new ArrayList<>(){{
                add(10);
                add(8);
                add(-12);
            }});
        }};

        int result = DDResult.diagonalDifference(arr);

        System.out.println(result);
    }
}
