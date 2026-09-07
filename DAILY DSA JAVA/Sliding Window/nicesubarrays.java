class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }
    
    private int atMost(int[] nums, int k) {
        if (k < 0) return 0;
        
        int left = 0, oddCount = 0, result = 0;
        
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] % 2 == 1) {
                oddCount++;
            }
            
            // shrink window while it has more than k odd numbers
            while (oddCount > k) {
                if (nums[left] % 2 == 1) {
                    oddCount--;
                }
                left++;
            }
            
            // every subarray ending at 'right' starting from 'left' to 'right'
            // has at most k odd numbers
            result += (right - left + 1);
        }
        
        return result;
    }
}