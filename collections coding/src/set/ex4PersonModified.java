package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class ex4PersonModified {
    public static void main(String[] args) {

        Set<PersonModified> set = new LinkedHashSet<>();
        set.add(new PersonModified(30));
        set.add(new PersonModified(20));
        set.add(new PersonModified(40));
        set.add(new PersonModified(50));
        set.add(new PersonModified(30));
        set.add(new PersonModified(10));
        set.add(new PersonModified(10));
        set.add(new PersonModified(20));

        for (PersonModified value : set) {
            System.out.println("Your age is :" + value);
        }
    }
}
//here no duplicates a we have override some functions such as equals hashcode likewise
//since its linkedhashset we made it without duplicates