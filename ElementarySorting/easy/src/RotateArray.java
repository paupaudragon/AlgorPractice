package ElementarySorting.easy.src;

public class RotateArray {

    // //passed 37/38, time limit exceeded.
    // public void rotate(int[] nums, int k) {
        
    //     while(k >0){
    //         int n = nums.length;
    //         int temp = nums[n-1];
    //         for(int i = n-1; i > 0; i--){
    //             nums[i]= nums[i-1];
    //         }
    //         nums[0]= temp;
    //         k--; 
    //         }
             
    // }

    //Reverse the array recursively
    //Devide the array into 2 parts, one is the part need to be shift to the begining of the array; the other one is the one need to be shift  right.
    //For example, [1 2 3 4 5 6 7], k =3
    //Part 1: [1 2 3 4] Part 2: [5 6 7]
    //1. reverse part 1 + reverse part 2
    //[4 3 2 1][7 6 5]
    //2.reverse the new array as a whole
    //[5 6 7 1 2 3 4]
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int mod = k % n;
        reverse(nums, n-mod, n-1);
        reverse(nums, 0, n-mod-1);
        reverse(nums, 0, n-1);
    }

    //1. Place the two pointers (let start and end) at the start and end of the array.
    //2. Swap arr[start] and arr[end]
    //3. Increment start and decrement end with 1
    //4. If start reached to the value length/2 or start ≥ end, then terminate otherwise repeat from step 2.
    public static void reverse(int[] array, int start, int end){
        int i= start;
        int j = end;
       while(i < j){
        swap(array, i, j);
        j--;
        i++;
    }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        rotate(nums, 1);
        for(int i: nums){
            System.out.println(i);
        }
    }
}
