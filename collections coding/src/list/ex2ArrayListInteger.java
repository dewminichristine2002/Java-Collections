package list;

import java.util.*;


public class ex2ArrayListInteger
{
    public static void  main(String[] args){

        ArrayList list2 =new ArrayList();

        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
       //list2.add("abc");


        int tot=0;
        for(Object value : list2){
            tot= tot + (Integer)value;
            System.out.println(value);
        }
        System.out.println("tot is : " + tot);
    }

    }

