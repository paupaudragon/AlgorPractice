package ElementarySorting;

import java.util.HashSet;
import java.util.Set;

class ArrayContainDuplicate {

    //1. Slower method by tzhou
    // public boolean containsDuplicate(int[] nums) {
    //     Set<Integer> set = new HashSet<>();// true, no duplicate, false contains duplicate
    //              boolean b = true;
    //            for(int i : nums){
    //                b = set.add(i);
    //                if(b==false)
    //                    return !b;//has duplicate
    //            }
    //            return !b;
    //        }

    //2. Faster from online
    //Logic: 
    //      1. Check if an element for array is in the Hashset(start empty), return true if it it does. 
    //      2. Add this element. Which means the HashSet didn't have this elemnt before addng.
    //      3. Move to next element and repeat 1, 2, 3 until reach the end of the array.
    //      4. if the above never returns true, there is no repeated element, return false.
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> indexes = new HashSet<>();
        for(int i = 0 ; i<nums.length; i++){
            if(indexes.contains(nums[i])){
                return true;
            }
            indexes.add(nums[i]);
        }
        return false;
    }
}
