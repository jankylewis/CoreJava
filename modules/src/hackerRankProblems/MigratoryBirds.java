//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.function.*;
//import java.util.regex.*;
//import java.util.stream.*;
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
//
//class MbResult {
//
//    /*
//     * Complete the 'migratoryBirds' function below.
//     *
//     * The function is expected to return an INTEGER.
//     * The function accepts INTEGER_ARRAY arr as parameter.
//     */
//
//    static List<Integer> getListOfMaxValues(List<Integer> values) {
//
//        int tempMax = 0;
//        List<Integer> maxValues = new ArrayList<>();
//
//        for (int idx = 0; idx < values.size(); idx++) {
//
//            if (values.get(idx) > tempMax) {
//                maxValues.add(values.get(idx));
//            }
//
////            if (!maxValues.)
//
//
//        }
//    }
//
//    public static int migratoryBirds(List<Integer> arr) {
//
//        // Write your code here
//
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        for (int idx = 0; idx < arr.size(); idx++) {
//
//            int currentKey = arr.get(idx);
//
//            if (!hashMap.containsKey(currentKey))
//                hashMap.put(currentKey, 1);
//
//            if (hashMap.containsKey(currentKey))
//                hashMap.put(currentKey, hashMap.get(currentKey) + 1);
//        }
//
//        List<Integer> values = hashMap.values().stream().toList();
//
//        return -1;
//    }
//
//}
//
//public class MigratoryBirds {
//
//    public static void main(String[] args) throws IOException {
////        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
////        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
////
////        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
//
////        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
////                .map(Integer::parseInt)
////                .collect(toList());
//
//        List<Integer> arr = new ArrayList<>();
//        arr.add(1);
//        arr.add(1);
//        arr.add(2);
//        arr.add(2);
//        arr.add(2);
//        arr.add(3);
//        arr.add(3);
//
//        int result = MbResult.migratoryBirds(arr);
//
//        System.out.println(result);
//
////        bufferedWriter.write(String.valueOf(result));
////        bufferedWriter.newLine();
////
////        bufferedReader.close();
////        bufferedWriter.close();
//    }
//}
