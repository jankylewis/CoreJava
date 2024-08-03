package problems;

public class _T {

    public static void main(String[] args) {
        String name1 = "AA";
        String name2 = "aa";

        int comparison = name1.compareTo(name2);

        if (comparison < 0) {
            System.out.println(name1 + " comes before " + name2 + " alphabetically.");
        } else if (comparison > 0) {
            System.out.println(name2 + " comes before " + name1 + " alphabetically.");
        } else {
            System.out.println(name1 + " and " + name2 + " are the same word.");
        }
    }
}
