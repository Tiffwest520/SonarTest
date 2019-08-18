package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class MoreList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(76);
        numbers.add(100);
        numbers.add(799);
        numbers.add(765);
        numbers.add(7633);

        System.out.println(numbers);
        //numbers.sort();
        Collections.sort(numbers);
        System.out.println(numbers);





    }
}
