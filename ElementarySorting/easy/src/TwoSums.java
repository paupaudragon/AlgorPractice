package ElementarySorting.easy.src;

import java.util.HashMap;
import java.util.Map;

public class TwoSums {
   
        public int[] twoSum(int[] nums, int target) {
        
            //Note that HashMap can only search value of a given key not the other way around.
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], i);
            }
            for (int i = 0; i < nums.length; i++) {
                int temp = target - nums[i];
                if (map.containsKey(temp) && map.get(temp) != i) {
                    return new int[] { i, map.get(temp) };
                }
            }
            // In case there is no solution, we'll just return null
            return null;
         
        }
    }
