import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesWithMatches {

    public static int sockMerchant(int n, List<Integer> ar) {

        HashMap<Integer, Integer> sockMap = new HashMap<>();

        for (int idx = 0; idx < ar.size(); idx++){

            if (!sockMap.containsKey(ar.get(idx)))
                sockMap.put(ar.get(idx), 1);

            sockMap.put(ar.get(idx), ar.get(ar.get(idx)));

        }

        int pairsGreaterThan2 = 0;
        int pairsEqual2 = 0;

        for (Map.Entry<Integer, Integer> sockEntries : sockMap.entrySet()) {

            if (sockEntries.getValue() == 2) {
                pairsEqual2++;
                continue;
            }

            if (sockEntries.getValue() > 2) {
                pairsGreaterThan2++;
            }
        }

        if (pairsGreaterThan2 > 0) {

            if (pairsGreaterThan2 % 2 == 0) {
                pairsEqual2+=pairsGreaterThan2;
                return pairsEqual2;
            }

            pairsGreaterThan2-=1;

            pairsEqual2 += pairsGreaterThan2/2;
            return pairsEqual2;
        }

        return pairsEqual2;
    }
}
