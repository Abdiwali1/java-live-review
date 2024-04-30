package week07;

import java.util.Arrays;

public class TestArrayMethods {
    public static void main(String[] args) {
        // classname.method
        int[] nums = {4, 3, 5, 15};
        System.out.println(ArrayUtils.indexOf(nums, 5));

        int[] num2 = {3, 4, 1, 5, 6, 5};
        System.out.println(ArrayUtils.indexOf(num2, 6));
        System.out.println(ArrayUtils.indexOf(num2, 7));

        //int[] num3 = new int[0];
        int[] sub1 = ArrayUtils.subArray(num2, 0, 3);
        int[] sub2 = ArrayUtils.subArray(num2, 2, 5);

        System.out.println(Arrays.toString(sub1));
        System.out.println(Arrays.toString(sub2));

    }
}
