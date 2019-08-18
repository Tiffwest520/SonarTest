package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class StudentCollectionRunner {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        students.add(1,"Adam");
        students.add("Whitney");
        students.add("Bernard");

        System.out.println(students);

        Collections.sort(students);
        System.out.println(students);



    }
}
