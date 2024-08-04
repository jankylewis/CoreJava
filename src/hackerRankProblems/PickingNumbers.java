package hackerRankProblems;

import java.util.HashMap;
import java.util.Map;

public class PickingNumbers {

  public static int pickingNumbers(int[] a) {
    // Create a HashMap to store element frequencies
    Map<Integer, Integer> frequencyMap = new HashMap<>();

    // Count the frequency of each element
    for (int num : a) {
      frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
    }

    // Initialize variables for tracking the longest subarray
    int maxSubarrayLength = 0;

    // Iterate through the frequency map
    for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
      int currentElement = entry.getKey();
      int currentFrequency = entry.getValue();

      // Check if the current element and the element + 1 both exist
      int nextElementFrequency = frequencyMap.getOrDefault(currentElement + 1, 0);

      // Calculate the potential subarray length considering both elements
      int potentialLength = currentFrequency + nextElementFrequency;

      // Update the max subarray length if applicable
      maxSubarrayLength = Math.max(maxSubarrayLength, potentialLength);
    }

    return maxSubarrayLength;
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 2, 3, 1, 2};
    int result = pickingNumbers(arr);
    System.out.println(result); // Output: 5
  }
}