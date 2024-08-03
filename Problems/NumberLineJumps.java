package Problems;

public class NumberLineJumps {

    static String kangarooMatched(int x1, int v1, int x2, int v2) {

        if ((x2 > x1 && v2 > v1) || (x1 > x2 && v1 > v2))
            return "NO";

        if ((x2 == x1 && v2 > v1) || (x1 == x2 && v1 > v2))
            return "NO";

        if (x1 > x2 && v2 > v1 && v2 % v1 == 0)
            return "YES";

        if (x2 > x1 && v1 > v2 && v1 % v2 == 0)
           return "YES";

        return "NO";
    }

    public static void main(String[] args) {

    }
}
