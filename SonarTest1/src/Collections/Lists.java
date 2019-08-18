package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Lists {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("Apple");
        words.add("Bat");
        words.add("Cat");
        words.add("Hat");


        System.out.println(words);

        words.set(1,"Fish");
        System.out.println(words);
        words.set(3, "Orange");
        System.out.println(words);


        Iterator wordsIterator = words.iterator();
        while(wordsIterator.hasNext()){
            System.out.println(wordsIterator.next());
        }


    }

}
