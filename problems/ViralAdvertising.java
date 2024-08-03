package problems;

public class ViralAdvertising {

    public static int viralAdvertising(int n) {

        int shares = 5;
        int likes = 2;
        int cummulative = 2;

        for (int idx = 1; idx < n; idx++) {
            shares = likes * 3;
            likes = (int) Math.floor(shares / 2);
            cummulative += likes;
        }

        return cummulative;
    }

    public static void main(String[] args) {
        System.out.println(viralAdvertising(5));
    }
}
