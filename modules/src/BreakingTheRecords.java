import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BreakingTheRecords {

    public static List<Integer> breakingRecords(List<Integer> scores) {

        ArrayList<Integer> finalBrokenTimes = new ArrayList<>();

        int worstBrokenTimes = 0;
        int bestBrokenTimes = 0;
        HashMap<String, Integer> recordsMap = new HashMap<>();

        for (var score : scores){

            recordsMap.putIfAbsent("MAX", score);
            recordsMap.putIfAbsent("MIN", score);

            int currentMax = recordsMap.get("MAX");
            int currentMin = recordsMap.get("MIN");

            if (score == currentMax || score == currentMin)
                continue;

            if (score > currentMax){
                recordsMap.put("MAX", score);
                bestBrokenTimes++;
            }

            if (score < currentMin){
                recordsMap.put("MIN", score);
                worstBrokenTimes++;
            }
        }

        finalBrokenTimes.add(bestBrokenTimes);
        finalBrokenTimes.add(worstBrokenTimes);

        return finalBrokenTimes;
    }

}
