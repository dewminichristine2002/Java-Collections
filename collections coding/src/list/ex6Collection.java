package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;


public class ex6Collection {
    public static void main(String[] args){

       Collection<String> list = new ArrayList<>();
        //Collection<String> list = new Vector<>();
        //Collection<String> list = new List<>();  //didnt work but

        list.add("abc");
        list.add("def");
        list.add("ghi");
        list.add("jkl");
        list.add("abc");


        for(String value : list){
            System.out.println(value);
        }


}}
