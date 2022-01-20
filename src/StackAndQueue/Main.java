package StackAndQueue;

public class Main {
    public static void main(String[] args) throws stackException {
        dynamicStack stack = new dynamicStack(5);

        stack.push(50);
        stack.push(5);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(89);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());
    }
}
