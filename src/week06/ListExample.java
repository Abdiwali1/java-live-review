package week06;

import java.util.ArrayList;
import java.util.Arrays;

public class ListExample {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println(nums);
        nums.add(5);
        System.out.println(nums);
        nums.addAll(Arrays.asList(3, 5, 6, 24));
        System.out.println(nums);

        nums.removeIf(p -> p % 2 == 1);
        System.out.println(nums);

        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(4, 5, 12, 5));

    }
}
