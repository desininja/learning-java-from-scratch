package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingExample {
    public static void main(String[] args){
        List<String> names = new ArrayList<String>();

        names.add("Himanshu");
        names.add("Vaibhavi");
        names.add("Bhatt");
        names.add("Nautiyal");

        for (String name:names
             ) {
            System.out.println(name);

        };
        Collections.sort(names);

        System.out.println("--------------------");
        for (String name:names
        ) {
            System.out.println(name);

        };
    }
}
