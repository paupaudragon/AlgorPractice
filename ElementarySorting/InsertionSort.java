package ElementarySorting;

/**
 * This is class sorts(ascendent) an integer array by insertion sort. 
 * First take current position element out and compare with the left side element, if smaller, then move the element from left to right by 1
 * Until reaching the first element or greater than the left side element.
 * 
 * Time complexity: O(n^2)
 * Space complexity: O(1)
 * 
 * Best Case: Already sorted O(n)
 * Worst Case:Reverse order O(n^2)
 * Stability: stable
 * 
 * When to use: 
 * 1. Insertion sort is used when number of elements is small.
 * 2. When it is a linked list.
 * 3. when a huge sorted list is added with some small data.
 */
public class InsertionSort {

    public InsertionSort(){}

    public static void sort(int [] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && temp<arr[j]){
                arr[j+1]=arr[j]; //j+1 cannot be i here, because when while runs second time, j != i-1 anymore, the relations 
                j--;
            }
            arr[j+1] = temp;
        }

    }

    public static void main(String[] args){
        int [] arr = {4,3,2};
        InsertionSort.sort(arr);
        for (int i : arr) 
        {
            System.out.println(i);
        }
    }

}
