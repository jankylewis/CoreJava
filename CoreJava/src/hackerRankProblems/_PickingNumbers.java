package hackerRankProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _PickingNumbers {

    static int getMaxFrequency(int firstElement, int secondElement){

        if (firstElement > secondElement)
            return firstElement;

        return secondElement;
    }

    static int pickingNumbers(List<Integer> expList) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int number : expList)
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);

        int maxSubListLength = 0;

        for (Map.Entry<Integer, Integer> frequencyEntry : frequencyMap.entrySet()){

            int currentElement = frequencyEntry.getKey();
            int currentFrequency = frequencyEntry.getValue();

            int nextFrequency = frequencyMap.getOrDefault(currentElement + 1, 0);

            int potentialMaxFrequency = currentFrequency + nextFrequency;

            maxSubListLength = getMaxFrequency(potentialMaxFrequency, maxSubListLength);
        }

        return maxSubListLength;
    }

    public static void main(String[] args) {
        List<Integer> expList = new ArrayList<>();
//        expList.add(20);
//        expList.add(19);
//        expList.add(20);
//        expList.add(20);
//        expList.add(16);
//        expList.add(16);
//        expList.add(17);
//        expList.add(17);
//        expList.add(17);
//        expList.add(16);
//        expList.add(20);

        expList.add(1);
        expList.add(2);
        expList.add(2);
        expList.add(3);
        expList.add(1);
        expList.add(1);

        int result = pickingNumbers(expList);

        System.out.println(result);
      }
}
