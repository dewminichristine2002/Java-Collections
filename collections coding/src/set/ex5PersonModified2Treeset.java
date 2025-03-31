package set;

import java.util.Set;
import java.util.TreeSet;

public class ex5PersonModified2Treeset {

    public static void main(String[] args) {

        Set<PersonModified2> set = new TreeSet<>();
        set.add(new PersonModified2(30));
        set.add(new PersonModified2(20));
        set.add(new PersonModified2(40));
        set.add(new PersonModified2(50));
        set.add(new PersonModified2(30));
        set.add(new PersonModified2(10));
        set.add(new PersonModified2(10));
        set.add(new PersonModified2(20));

        for (PersonModified2 value : set) {
            System.out.println("Your age is :" + value);
        }
    }

}
