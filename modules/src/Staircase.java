public class Staircase {

    static String getLine(int layer, int n){

        String whitespaces = "";
        String stars = "";

        int numberOfWhitespaces = 0;

        for (int idx = 0; idx < n - layer; idx++){
            whitespaces += " ";
            numberOfWhitespaces++;
        }

        for (int idx = 0; idx < n - numberOfWhitespaces; idx++){
            stars += "#";
        }

        return whitespaces + stars;
    }

    static void printStaircase(int n) {
        for (int idx = 1; idx <= n; idx++){
            System.out.println(getLine(idx, n));
        }
    }

    public static void main(String[] args) {
        printStaircase(20);
    }
}
