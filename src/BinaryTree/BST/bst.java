package BinaryTree.BST;

import BinaryTree.tree;

import java.util.HashSet;
import java.util.Stack;

public class bst {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data, Node left,Node right){
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

    public static Node constructor(int[] arr, int lo, int hi){

        if(lo > hi){
            return null;
        }

        int mid = (lo+hi)/2;
        int data = arr[mid];
        Node lc = constructor(arr, lo, mid-1);
        Node rc = constructor(arr,mid+1, hi);

        Node node = new Node(data,lc,rc);
        return node;

    }

    public static void main(String[] args) {

        int[] arr = {12,25,37,50,62,75,87};
        Node root = constructor(arr,0,arr.length-1);
//        display(root);
        System.out.println(min(root));
    }

    public static int max(Node node){
        if(node.right != null) return max(node.right);
        else return node.data;
    }

    public static int min(Node node){
        if(node.left != null) return min(node.left);
        else return node.data;
    }

    public static boolean find(Node node, int data){
        if(node == null) return false;
        if(data > node.data) return find(node.right, data);
        else if(data < node.data) return find(node.left, data);
        else return true;
    }
}


