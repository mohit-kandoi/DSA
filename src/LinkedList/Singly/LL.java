package LinkedList.Singly;

import java.util.List;

public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL() {

        this.size = 0;
    }

    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public int delete(int index){
        if(index == 0){
           return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }
        Node temp = head;
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
        return temp.next.value;
    }

    public int deleteLast(){
        if(size <= 1){
           return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    private Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    //Insert using Recursion:
    public void insertRec(int val, int index){
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node){

        if(index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index--, node.next);
        return node;
    }

    public void insert(int val, int index){

        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node{

        int value;
        Node next;

        public Node(int value) {

            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    //QUESTIONS:
    public void duplicates(){
        Node temp = head;

        while(temp.next != null){
            if(temp.value == temp.next.value){
                temp.next = temp.next.next;
                size--;
            }
            else{
                temp = temp.next;
            }
        }
        tail = temp;
        tail.next = null;
    }

    // merge:
    public static LL merge(LL first, LL second){
        Node head1 = first.head;
        Node head2 = second.head;
        LL ans = new LL();

        while(head1 != null && head2 != null){
            if(head1.value < head2.value){
                ans.insertLast(head1.value);
                head1 = head1.next;
            }else{
                ans.insertLast(head2.value);
                head2 = head2.next;
            }
        }

        while(head1 != null){
            ans.insertLast(head1.value);
            head1 = head1.next;
        }
        while(head2 != null){
            ans.insertLast(head2.value);
            head2 = head2.next;
        }
        return ans;
    }

    // Starting Node of Cycle
    public void startNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int length = 0;
        boolean check = false;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                check = true;
                ListNode temp = slow;
                do{
                    temp = temp.next;
                    length++;
                }while(temp != slow);
            }
        }
        // Find the first node:
        if(check){
            ListNode first = head;
            ListNode second = head;

            // keep moving second till the length
            while(length > 0){
                second = second.next;
                length--;
            }
            // now keep moving both first and second so that meet a single point of cycle start.
            while(first != second){
                first = first.next;
                second = second.next;
            }
//            return second;
            System.out.println(second);
        }else
            return;

    }


  //Reversing the Linked List(RECURSION):

    private void reverse(Node node){
        if(node == tail){
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    // in place reversal of linked list:
    private ListNode reverseInPlace(ListNode head){
        if(head == null || head.next == null){
            return head;
        }

        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while(present != null){
            present.next = prev;
            prev = present;
            present = next;
            if(next != null){
                next = next.next;
            }
        }
        head = prev;
        return head;
    }

    // reverse the sub part of a linked list: IMPORTANT
    private ListNode reverseSubPart(ListNode head,int left, int right){
        if(left == right){
            return head;
        }

        //skip the first left-1 nodes:
        ListNode current = head;
        ListNode prev = null;
        for (int i = 0;current != null && i < left-1; i++) {
            prev = current;
            current = current.next;
        }
        ListNode last = prev;

        ListNode newEnd = current;

        //reverse between left and right:
        ListNode next = current.next;
        for(int i=0; current!=null && i<right-left+1; i++){
            current.next = prev;
            prev = current;
            current = next;
            if(next != null){
                next = next.next;
            }
        }
        if(last != null){
            last.next = prev;
        }
        else{
            head = prev;
        }
        newEnd.next = current;
        return head;
    }

    // palindrome linked list:

    public boolean isPalindrome(ListNode head) {
        ListNode mid = midNode(head);
        ListNode headSecond = reverseInPlace(mid);
        ListNode rereverseHead = headSecond;

        //compare both the halves:
        while (head != null && headSecond != null) {
            if (head.val != headSecond.val) {
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverseInPlace(rereverseHead);
        if(head == null || headSecond == null){
            return true;
        }
        return false;
    }

    private ListNode midNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


    public static void main(String[] args) {
        LL list1 = new LL();
        LL list2 = new LL();
        list1.insertLast(1);
        list1.insertLast(3);
        list1.insertLast(5);
        list1.insertLast(6);
        list2.insertLast(1);
        list2.insertLast(2);
        list2.insertLast(3);

        LL ans = merge(list1, list2);
        ans.display();

    }
}
