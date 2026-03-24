import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> counter = new HashMap<>();
        
        for (int n : nums) {
            counter.put(n, counter.getOrDefault(n, 0) + 1);
        }

        int len = nums.length;

        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            if (entry.getValue() > len / 2) {
                return entry.getKey();
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] nums = {2, 1, 1, 1, 2};
        
        int result = sol.majorityElement(nums);
        System.out.println("Majority Element: " + result);
    }
}
