package hackerRankProblems;

import java.util.Arrays;
import java.util.List;

public class SubarrayDivision {

    public static int birthday(List<Integer> s, int d, int m) {

        int metTimes = 0;

        if (m == 1){
            for (Integer integer : s)
                if (integer == d)
                    metTimes++;

            return metTimes;
        }

        int head = 0;
        int tail = m;

        int expTimes = s.size() - m;
        int actTimes = 0;

        while(actTimes <= expTimes){

            int sum = 0;
            for (int idx = head; idx < tail; idx++) {
                sum += s.get(idx);
            }

            if (sum == d) metTimes+=1;

            head++;
            tail++;

            actTimes++;
        }

        return metTimes;
    }

    public static void main(String[] args) {

        int result = birthday(Arrays.asList(
                        2, 5, 1, 3, 4, 4, 3, 5, 1, 1, 2, 1, 4, 1, 3, 3, 4, 2, 1
                ),
                18,
                7);

        System.out.print(result);
    }
}
