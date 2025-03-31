package list;

import java.util.*;

public class ex4ArrayList3 {

    public static void  main(String[] args){

        List<Integer> list2 =new ArrayList();

        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);



        int tot=0;
        for(Object value : list2){
            tot= tot + (Integer)value;
            System.out.println(value);
        }
        System.out.println("tot is : " + tot);
    }
}
