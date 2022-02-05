package BinaryTree;

import java.util.ArrayList;
import java.util.Stack;

public class Travesal {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    static class Pair{
        Node node;
        int state;
        Pair(Node node, int state){
            this.node = node;
            this.state = state;
        }
    }

    public static void main(String[] args) {

        Integer[] arr = {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
        Node root = new Node(arr[0],null,null);
        Pair rtp = new Pair(root,1);

        Stack<Pair> st = new Stack<>();
        st.push(rtp);
        int index = 0;
        while (st.size() > 0){
            Pair top = st.peek();
            if(top.state == 1){
                index++;
                if (arr[index] != null){
                    Node ln = new Node(arr[index], null,null);
                    top.node.left = ln;

                    Pair lp = new Pair(ln,1);
                    st.push(lp);
                }else{
                    top.node.left = null;
                }
                top.state++;
            }else if(top.state == 2){
                index++;
                if (arr[index] != null){
                    Node rn = new Node(arr[index], null,null);
                    top.node.right = rn;

                    Pair rp = new Pair(rn,1);
                    st.push(rp);
                }else{
                    top.node.right = null;
                }
                top.state++;
            }else{
                st.pop();
            }
        }

//        traversal(root);

        list = new ArrayList<>();
        System.out.println(find(root, 40));
        System.out.println(list);
    }

    //Nodes K Levels Far:


    //K level Down:
    public static void kDown(Node node, int k){
        if(node == null || k<0){
            return;
        }
        if(k==0){
            System.out.println(node.data);
        }
        kDown(node.left, k-1);
        kDown(node.right, k-1);
    }

    //Node to Root Path Printing:
    static ArrayList<Integer> list;
    public static boolean find(Node node, int data){
        if(node == null){
            return false;
        }
        if(node.data == data){
            list.add(node.data);
            return true;
        }
        boolean findInLeft = find(node.left, data);
        if (findInLeft){
            list.add(node.data);
            return true;
        }

        boolean findInRight = find(node.right,data);
        if (findInRight){
            list.add(node.data);
            return true;
        }

        return false;
    }

    //PreOrder, InOrder, Postorder Traversal:
    public static void traversal(Node root){
        Stack<Pair> st = new Stack<>();
        Pair rtp = new Pair(root,1);
        st.push(rtp);

        String pre = "";
        String in = "";
        String post = "";
        while(st.size() > 0){
            Pair top = st.peek();
            if(top.state == 1){
                pre = pre +  top.node.data+" ";
                top.state++;

               if(top.node.left != null){
                   Pair lp = new Pair(top.node.left,1);
                   st.push(lp);
               }
            }
            else if (top.state == 2){
                in = in +  top.node.data+" ";
                top.state++;

                if(top.node.right != null){
                    Pair rp = new Pair(top.node.right,1);
                    st.push(rp);
                }
            }
            else{
                post += top.node.data+" ";
                st.pop();
            }
        }
        System.out.println(pre);
        System.out.println(in);
        System.out.println( post);
    }
}
