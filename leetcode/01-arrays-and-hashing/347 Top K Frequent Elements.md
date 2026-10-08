## 문제
[347 Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/description/)

## 문제 분석
- 정수 배열 nums와 정수 k가 주어짐
- nums에 중복된 숫자의 개수를 카운트하고, 가장많은순으로 k 개 반환

## 제약조건
- 1 <= nums.length <= 105
- -104 <= nums[i] <= 104
- k is in the range [1, the number of unique elements in the array].
- It is guaranteed that the answer is unique.
 


```java
import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            int count = map.getOrDefault(num, 0);
            count++;
            map.put(num, count);
        }

        List<Integer> keyList = new ArrayList<>(map.keySet());

        keyList.sort((a, b) -> map.get(b) - map.get(a));

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = keyList.get(i);
        }
        return result;
    }
}
```