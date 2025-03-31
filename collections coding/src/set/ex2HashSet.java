package set;

import java.util.HashSet;

import java.util.Set;

public class ex2HashSet {
    public static void main(String[] args){

        Set<Integer> set =  new HashSet<>();

        set.add(50);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(30);

        System.out.println(set);
        //in Set interface no duplicates are allowed
        //In HashSet it dosen't displays in the insertion order

    }
}
