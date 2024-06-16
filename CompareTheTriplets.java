import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CompareTheTriplets {

    public static List<Integer> compareTriplets(List<Integer> alicePoints, List<Integer> bobPoints) {

        int aliceFinalPoints = 0;
        int bobFinalPoints = 0;

        for (int idx = 0; idx < alicePoints.size(); idx++) {

            if (alicePoints.get(idx) > bobPoints.get(idx)) {
                aliceFinalPoints++;
                continue;
            }

            if (alicePoints.get(idx) < bobPoints.get(idx))
                bobFinalPoints++;
        }

        return List.of(aliceFinalPoints, bobFinalPoints);
    }
}
