package week11;

import java.util.*;

public class DemoIterator {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>(Arrays.asList("sun", "grass", "garden", "wind"));
        list1.forEach(System.out::println);

        Iterator<String> list1It = list1.iterator();
        //System.out.println(list1It.next());

        while(list1It.hasNext()){
            System.out.println(list1It.next());
        }

        Set<Integer> nums = new HashSet<>(Arrays.asList(3, 4, 5, 2, 6, 1, 7, 9, 24, 4, 23, 23, 5, 53, 1, 5, 21, 3, 50));

        // remove all the numbers more than 20

        Iterator<Integer> numIt = nums.iterator();

        while(numIt.hasNext()){
            if(numIt.next() > 20){
                numIt.remove();
            }
        }

        Map<String, String> person = new HashMap<>();
        person.put("FIRST_NAME", "James");
        person.put("LAST_NAME", "Bond");

        for(Map.Entry<String,String> eachEntry : person.entrySet()){
            System.out.println(eachEntry.getKey());
            System.out.println(eachEntry.getValue());
        }

    }
}
