import java.util.HashSet;
import java.util.Scanner;

public class Main {
   // public static int longestConsecutive(int[] nums) {

    public static int leetcode128(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // Store all numbers
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        // Check every number
        for (int x : set) {

            // x is the beginning of a sequence
            if (!set.contains(x - 1)) {

                int current = x;
                int currentLength = 1;

                // Find consecutive numbers
                while (set.contains(current + 1)) {
                    current++;
                    currentLength++;
                }

                // Update longest
                longest = Math.max(longest, currentLength);
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array
        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Call function
        int answer = leetcode128(nums);

        System.out.println("Longest consecutive sequence = " + answer);

        sc.close();
    }
}
// HashSet
// ↓
// add all numbers
// ↓
// x - 1 doesn't exist
// ↓
// current = x
// ↓
// while x + 1 exists
// ↓
// current++
// ↓
// currentLength++
// ↓
// longest