package week7;

public class ArrayUtils {

    public static int indexOf(int[] nums, int element){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == element){
                return i;
            }
        }
        return -1;
    }

    public static int[] subArray(int[] nums, int start, int end){

        if(end <= start || nums == null || nums.length == 0){
            return null;
        }

        int[] result = new int[end - start];

        // i will be used to assign to the result array
        // start will be used to read from the original array
        for(int i = 0; i < result.length; i++){
            result[i] = nums[start++];
        }

        return result;
    }
    // i  = 2
    // start  = 4
    // [1, 5, 6]
   // subArray({3, 4, 1, 5, 6, 5}, 2, 5) -> {1, 5, 6}

}
/*
ArrayUtils [array, loop, method]

    Create these two utility methods for array objects

    indexOf(int[] arr, int element)
        create a method that will search for and return the index of the given element in the array.
            if there is multiple of that element return the first occurrence
            if the element does not exist return -1

        Ex:
            indexOf({3, 4, 1, 5, 6, 5}, 5) -> 3
            indexOf({3, 4, 1, 5, 6, 5}, 7) -> -1
            indexOf({3, 4, 1, 5, 6, 5}, 3) -> 0

    subArray(int[] arr, int start, int end)
        create a method that will return part of the array back. The part of sub-array will be based on the start the end indexes. The end index is not included

        Ex:
          subArray({3, 4, 1, 5, 6, 5}, 0, 3) -> {3, 4, 1}
          subArray({3, 4, 1, 5, 6, 5}, 2, 5) -> {1, 5, 6}
          subArray({3, 4, 1, 5, 6, 5}, 1, 6) -> {4, 1, 5, 6, 5}

 */
