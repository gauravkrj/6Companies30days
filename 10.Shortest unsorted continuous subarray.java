public class Solution {

    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int[] dummy = nums.clone();
        Arrays.sort(dummy);

        int start = 0;
        while (start < n && nums[start] == dummy[start]) start++;

        int end = n - 1;
        while (end > start && nums[end] == dummy[end]) end--;

        return end - start + 1;
    }
}
