package stack;

import java.util.Stack;

public class ex1stack {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();
        stack.push("aaaaaaa");
        stack.push("bbbbbbb");
        stack.push("ccccccc");
        stack.push("ddddddd");
        stack.push("eeeeeee");
        stack.add("ffffffff");

        System.out.println(stack);
        //Remove last Item
        System.out.println("Stack pop = " + stack.pop() + "\n");
        // it will show what will be deleted when we give it to println

        System.out.println(stack);
        //Add elements
        System.out.println("Stack add = " + stack.add("1111111") + "\n");
        System.out.println("Stack add = " + stack.add("2222222") + "\n");

        System.out.println(stack);

        //uses last in first out
    }
}
