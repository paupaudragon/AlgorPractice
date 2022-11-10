
public  class BinarySearch
{
    //constructor
    public BinarySearch()
    {

    }

    /**
     * Returns the zero-based index of an element of a key in an SORTED int array.
     * Returns -1 if there is no such element.
     * 
     * 1. If the key is greater than the middle element, then move the low to the element after the middle element.
     * 2. if the key is smaller than the middle element, then move high to the element before the middle element.
     * 
     * Index lo, mid, hi
     * index:0 1 2 3 4 5 6 7 8 9
     * lo:0; mid:4, hi:9
     * if move to the right
     * lo:5; mid:7; hi:9
     * if move to the left 
     * lo:0, mid:1, hi:3
     * 
     * @param arr the array
     * @param key the integer
     * @return the index of the integer in the array, or -1 if the integer doesn't exist.
     */
    public static int indexOf(int[]  arr, int key)
    {
        int low = 0;
        int hi = arr.length-1;
        int mid = low + (hi-low)/2;
        while (low <= hi)
        {
            if(key< arr[mid])
                hi= mid;
            else if (key > arr[mid])
                low= mid+1;
            else return mid;
        }
        return -1;
       
    }
}