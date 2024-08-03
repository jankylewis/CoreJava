package problems;

import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

class CTLResult {

    /*
     * Complete the 'climbingLeaderboard' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ranked
     *  2. INTEGER_ARRAY player
     */

    static Map<Integer, Integer> getDescendingHashMap(Map<Integer, Integer> hm) {

        List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(hm.entrySet());

        Comparator<Map.Entry<Integer, Integer>> unsortedEntryComparator =
                Map.Entry.comparingByValue(Comparator.reverseOrder());

        sortedEntries.sort(unsortedEntryComparator);

        TreeMap<Integer, Integer> sorterHashMap = new TreeMap<>();
        for (var sortedEntry : sortedEntries)
            sorterHashMap.put(sortedEntry.getKey(), sortedEntry.getValue());

        return sorterHashMap;
    }

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {

        List<Integer> ranks = new ArrayList<>();
        TreeMap<Integer, Integer> leaderboardMap = new TreeMap<>();

        //Generate a Map storing scores + ranks as K and V
        int initialRank = 1;
        for (Integer rank : ranked){

            if (leaderboardMap.containsKey(rank))
                initialRank--;

            leaderboardMap.put(rank, initialRank);
            initialRank++;
        }

        //Sort the Map with descending order
        SortedMap<Integer, Integer> descendingLeaderBoardMap = leaderboardMap.descendingMap();

        boolean flag = false;
        for (int idx = 0; idx < player.size(); idx++) {

            int currentPlayerScore = player.get(idx);

            int currentPlayerRank = 0;

            for (Map.Entry<Integer, Integer> leaderboardEntry : descendingLeaderBoardMap.entrySet()) {

                int currentScore = leaderboardEntry.getKey();
                int currentRank = leaderboardEntry.getValue();

                if (currentPlayerScore >= currentScore) {
                    currentPlayerRank = currentRank;
                    currentRank += 1;

                    descendingLeaderBoardMap.put(currentScore, currentRank);
                    flag = true;

                    break;
                }
            }

            if (!flag)
                currentPlayerRank = descendingLeaderBoardMap.size() + 1;

            ranks.add(currentPlayerRank);
        }

        return ranks;
    }
}

public class ClimbingTheLeaderboard {

    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> ranked = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        int playerCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> player = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());

        List<Integer> ranked = new ArrayList<>(){{
            add(1);
        }};

        List<Integer> player = new ArrayList<>(){{
            add(1);
            add(1);
        }};

        List<Integer> result = CTLResult.climbingLeaderboard(ranked, player);
        System.out.println(result);

//        bufferedWriter.write(
//                result.stream()
//                        .map(Object::toString)
//                        .collect(joining("\n"))
//                        + "\n"
//        );
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
