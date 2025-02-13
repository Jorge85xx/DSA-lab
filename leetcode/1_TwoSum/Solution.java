// 1 - Two Sum
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++) {
            map.put(nums[i], i);
        }
        for(int i = 0; i<nums.length; i++) {
            int aux = target - nums[i];
            if(map.containsKey(aux) && map.get(aux) != i){
                return new int[] {i, map.get(aux)};
            }
        }
        return new int[] {};
    } 

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {3,2,4};
        int target = 6;
        int[] result = sol.twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);    
    }
}