package CollectionFramework;
import java.util.*;

public class main {
//    public static class LinkedList {
//        Node head;
//        Node tail;
//        public void add(int value){
//            Node toAdd = new Node();
//        }
//
//        static class Node {
//            int value;
//            Node next;
//        }
//    }

    public static void main(String[] args) {
        //Minimum Maximum
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(10);
        pq.add(-22);
        pq.add(34);
        while(pq.size() != 0){
            System.out.println(pq.peek());
            pq.poll();
        }
    }
}
//className objectName = new className();


class dog {
    int legs;
    String breed;

    dog(){
        this.legs = 6;
        this.breed = "bhanu";
    }
    dog(int legs,String breed){
        this.legs = legs;
        this.breed = breed;
      //  System.out.println("constructor is called because object is created");
    }
}
