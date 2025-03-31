package list;
import java.util.*;


public class ex1 {

    public static List addElements(){
        List list =new ArrayList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(40);


        //list.add("abc");
        //since there was a string added to the array list it give an error while calculating the total

        return list;
    }

    public static void listTotal(List list){

        int tot=0;
        for(Object value : list){
            tot= tot + (Integer)value;
        }
        System.out.println("tot is : " + tot);
    }
}
