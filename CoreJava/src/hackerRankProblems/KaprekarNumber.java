package hackerRankProblems;

import java.util.ArrayList;

public class KaprekarNumber {

    public static void kaprekarNumbers(int low, int up) {

        ArrayList<Integer> kaprekarNumbers = new ArrayList<>();

        for (; low < up; low++) {

            int number = low * low;
            int length = String.valueOf(number).length();

            int lengthToSplit = length / 2;

            var x = String.valueOf(number).substring(0, lengthToSplit);

            if (low < 10);

            int firstPart = Integer.parseInt(String.valueOf(number).substring(0, lengthToSplit));
            int secondPart = Integer.parseInt(String.valueOf(number).substring(lengthToSplit, lengthToSplit * 2));

            if (firstPart + secondPart == number)
                kaprekarNumbers.add(low);
        }

        System.out.print(kaprekarNumbers);
    }

    public static void main(String[] args) {
        kaprekarNumbers(1, 50);
    }
}
