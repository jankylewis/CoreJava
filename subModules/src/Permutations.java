import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        permuteHelper(nums, 0, permutations);
        return permutations;
    }

    private static void permuteHelper(int[] nums, int currentIndex, List<List<Integer>> permutations) {
        if (currentIndex == nums.length) {
            // Base case: When all elements are placed, create a new list for the permutation
            List<Integer> permutation = new ArrayList<>();
            for (int num : nums) {
                permutation.add(num);
            }
            permutations.add(permutation);
            return;
        }

        // Fix the current element and try permutations for remaining elements
        for (int i = currentIndex; i < nums.length; i++) {
            // Swap current element with the next element
            swap(nums, currentIndex, i);

            // Recursively explore permutations for remaining elements
            permuteHelper(nums, currentIndex + 1, permutations);

            // Backtrack: swap back to undo the change
            swap(nums, currentIndex, i);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> permutations = permute(nums);
        System.out.println(permutations);
    }
}