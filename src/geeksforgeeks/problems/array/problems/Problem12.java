package geeksforgeeks.problems.array.problems;

/**
 * Maximum sum such that no two elements are adjacent
 * Question: Given an array of positive numbers, find the maximum sum of a
 * subsequence with the constraint that no 2 numbers in the sequence
 * should be adjacent in the array. So 3 2 7 10 should return 13 (sum of 3 and 10)
 * or 3 2 5 10 7 should return 15 (sum of 3, 5 and 7).Answer the question in most efficient way.
 */
public class Problem12 {
    public static void main(String[] args) {
        int[] arr = {3, 22, 5, 10, 7};
        int maxIncluding = 3;
        int maxExcluding = 0;
        int excl_new;
        for (int i = 1; i < arr.length; i++) {
            excl_new = (maxIncluding > maxExcluding) ? maxIncluding : maxExcluding;
            /* current max including i */
            maxIncluding = maxExcluding + arr[i];
            maxExcluding = excl_new;
        }
        if (maxExcluding > maxIncluding) {
            System.out.println(maxExcluding);
        } else {
            System.out.println(maxIncluding);
        }
    }
}