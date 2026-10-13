import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        // map 세팅
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }        

        for(int i = 0; i < nums.length; i++) {
            int rest = target - nums[i];
            // rest가 map에 있는지 확인
            int index = map.getOrDefault(rest, -1);

            if(index == -1 || index == i) continue;

            return new int[]{index, i};
        }
        return new int[]{0,0};
    }
}