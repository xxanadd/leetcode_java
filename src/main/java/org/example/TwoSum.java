package org.example;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numsMap.put(nums[i], i);
        }
        for (int firstIdx = 0; firstIdx < nums.length; firstIdx++) {
            int firstValue = nums[firstIdx];
            if (numsMap.containsKey(target - firstValue)){
                int secondIdx = numsMap.get(target - firstValue);
                if (firstIdx != secondIdx) {
                    res[0] = firstIdx;
                    res[1] = secondIdx;
                    break;
                }
            }
        }
        return res;
    }
}
