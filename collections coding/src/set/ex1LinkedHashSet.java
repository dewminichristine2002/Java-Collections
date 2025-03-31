package set;


import java.util.LinkedHashSet;
import java.util.Set;

public class ex1LinkedHashSet {

    public static void main(String[] args){

       Set<Integer> set =  new LinkedHashSet<>();

       set.add(50);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(30);

        System.out.println(set);
 //in Set interface no duplicates are allowed
  //In LinkedHashSet it displays in the insertion order

    }


}
