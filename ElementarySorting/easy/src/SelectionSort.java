package ElementarySorting.easy.src;

public class SelectionSort
{
    //TODO: make this class generic.
    
    public SelectionSort(){}

    /**
     * Sorts an array by slecting the smallest element in the array and place it to the left side of the array.
     * Then, repeat to the rest of the array until finish.
     * 
     * Time complexity: O(N^2)(best and worst)
     * Space complexity: O(1)
     * Stability: unstable
     * 
     * 
     * When to use:         
     * 1. When the list is small. As the time complexity of the selection sort is O(N2) which makes it inefficient for a large list.
     * 2. When memory space is limited because it makes the minimum possible number of swaps during sorting.
     * @param arr
     * @param n
     */
    public static void sort(int[] arr)
    {
        //Iterates thru the array to find any element smaller than the current element.
        for(int i=0; i<arr.length-1; i++)
        {
            //current element is the first element. 
            int min_index = i;

            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[j]<arr[min_index])
                {
                    min_index = j;
                }
            }
            
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args)
    {
        int [] arr = {4,3,2,1};
        SelectionSort.sort(arr);
        for (int i : arr) 
        {
            System.out.println(i);
        }

    }

}