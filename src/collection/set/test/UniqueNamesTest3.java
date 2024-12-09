package collection.set.test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueNamesTest3 {
    public static void main(String[] args) {
        List<Integer> list = List.of(30, 20, 20, 10, 10);
        Set<Integer> set = new TreeSet<>(list);
        for (Integer s : set) {
            System.out.println(s);
        }
    }
}
