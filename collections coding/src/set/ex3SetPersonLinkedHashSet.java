package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class ex3SetPersonLinkedHashSet {

    public static void main(String[] args){

        Set<Person> set = new LinkedHashSet<>();
        set.add(new Person(30));
        set.add(new Person(20));
        set.add(new Person(40));
        set.add(new Person(50));
        set.add(new Person(30));
        set.add(new Person(10));
        set.add(new Person(10));
        set.add(new Person(20));

        for(Person value : set){
            System.out.println("Your age is :" + value);
        }



    }
}

