package set;


import java.util.SortedSet;
import java.util.TreeSet;

public class ex3SortedSetTreeSet {
    public static void main(String[] args){

        SortedSet<Integer> set =  new TreeSet<>();

        set.add(50);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(30);

        System.out.println(set);
        //in Set interface no duplicates are allowed
        //In SortedSet it displays in the ascending order
        //So in TreeSet also it displays in the ascending order


    }
}
