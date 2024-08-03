package problems;

public class DrawingBook {

    static int pageCount(int n, int p) {

        if (n - p < 2 && n % 2 != 0) return 0;

        int minTimesFromFront = 0;
        int minTimesFromBack = 0;

        int tempLength = p % 2 == 0 ? p+1 : p;

        for (int idx = 1; idx <= tempLength; idx+=2){
            if (idx < p){
                minTimesFromFront++;
                continue;
            }

            break;
        }

        for (int idx = n; idx >= tempLength; idx-=2) {
            if (idx > tempLength) {
                minTimesFromBack++;
                continue;
            }

            break;
        }

        return Math.min(minTimesFromFront, minTimesFromBack);
    }

    public static void main(String[] args) {
        System.out.println(pageCount(6,5));
    }
}
