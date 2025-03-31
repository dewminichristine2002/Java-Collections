package Queue;
import java.util.PriorityQueue;

public class ex1Queue {

    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        priorityQueue.add(11);
        priorityQueue.add(22);
        priorityQueue.add(22);
        priorityQueue.add(44);
        priorityQueue.add(33);
        priorityQueue.add(55);
        priorityQueue.add(66);
        priorityQueue.add(77);
        priorityQueue.add(88);

        System.out.println("=======Before=======================");
        System.out.println(priorityQueue);

        //Show first element
        System.out.println("Queue Peek = " + priorityQueue.peek());
        //Poll delete the first element
        System.out.println("Queue Poll = " + priorityQueue.poll());
        //Poll delete the second element
        System.out.println("Queue Poll = " + priorityQueue.poll());
        // Insert new element 99
        priorityQueue.add(99);

        System.out.println("=======After=======================");
        System.out.println(priorityQueue);


 //uses the first in first out

    }
}
