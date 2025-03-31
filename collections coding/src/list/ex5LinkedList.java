package list;

import java.util.LinkedList;
import java.util.List;

public class ex5LinkedList {

public static void main(String[] args){

    List<String> linkedlist = new LinkedList<>();
    //we can make a linkedlist like this also
   // LinkedList<String> linkedlist = new LinkedList<>();


    linkedlist.add("abc");
    linkedlist.add("def");
    linkedlist.add("ghi");
    linkedlist.add("jkl");
    linkedlist.add("abc");


    for(String value : linkedlist){
        System.out.println(value);
    }



}



}
