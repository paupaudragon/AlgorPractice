package ElementarySorting;

public class RotateArray {

    //passed 37/38, time limit exceeded.
    public void rotate(int[] nums, int k) {
        
        while(k >0){
            int n = nums.length;
            int temp = nums[n-1];
            for(int i = n-1; i > 0; i--){
                nums[i]= nums[i-1];
            }
            nums[0]= temp;
            k--; 
            }
             
    }
}
