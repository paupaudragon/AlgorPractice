package ElementarySorting.easy.src;
class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[j]!= nums[i]){
                nums[j] = nums[i];
                j++;
        }
        
       }
        return j;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().removeDuplicates(new int[]{1,1,3,4,5,5}));}
    
}