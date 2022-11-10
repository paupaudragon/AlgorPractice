

import java.util.Arrays;

public class SingleNumber {
    // didn't come up with a way that uses const extra space

    // this is from online
    //How XOR works: 
    //1. a ^ 0 = 0
    //2. a^b^b = b^a^b = a
    public int singleNumber(int[] nums) {
        int result =0;
        Arrays.sort(nums);//quicksort
        for(int i = 0; i < nums.length; i++){
            result ^= nums[i];
        }
        return result;
        
    }
}
