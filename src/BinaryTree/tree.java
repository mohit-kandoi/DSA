package BinaryTree;

import java.util.Stack;

public class tree {

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
         Pair(Node node,int state){
             this.node = node;
             this.state = state;
         }
    }

    public static void display(Node node){
        if(node == null){
            return;
        }
        String str = "";
//        str += node.left == null ? "." : node.left.data+"";
//        str += " <- " + node.data + " -> ";
//        str += node.right == null ? "." : node.right.data+"";
        if(node.left != null){
            str = str + node.left.data+"";
        }else{
            str = str + ".";
        }
        str = str + ("<-" + node.data + "->");
        if(node.right != null){
            str = str + node.right.data+"";
        }else{
            str = str + ".";
        }
        System.out.println(str);
        display(node.left);
        display(node.right);
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
//        display(root);
        System.out.println(size(root));
        System.out.println(sum(root));
        System.out.println(max(root));
    }

    public static int size(Node node){
        if(node == null){
            return 0;
        }
        int ls = size(node.left);
        int rs = size(node.right);
        int ts = ls + rs + 1;
        return ts;
    }
    public static int sum(Node node){
        if(node == null){
            return 0;
        }
        int ls = sum(node.left);
        int rs = sum(node.right);
        int ts = ls + rs + node.data;
        return ts;
    }
    public static int max(Node node){
        if(node == null){
            return Integer.MIN_VALUE;
        }
        int left = max(node.left);
        int right = max(node.right);
        int max = Math.max(node.data, Math.max(left,right));
        return max;
    }
    public static int height(Node node){
        if(node == null){
            return -1; // for edges -1 and for nodes 0;
        }
         int lh = height(node.left);
         int rh = height(node.right);
         int totalH = Math.max(lh, rh)+1;
         return totalH;
    }
}
