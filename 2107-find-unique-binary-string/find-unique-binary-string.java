public class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            // Flip the i-th bit of the i-th string
            result.append(nums[i].charAt(i) == '0' ? '1' : '0');
        }
        return result.toString();
    }
}
