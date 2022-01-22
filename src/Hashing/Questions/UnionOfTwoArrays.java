package Hashing.Questions;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArrays {
    public static void main(String[] args) {

    }
    public static int doUnion(int a[], int n, int b[], int m)
    {
        Set<Integer> set = new HashSet<>();
        for(int item: a){
            set.add(item);
        }
        for (int item: b ) {
            set.add(item);
        }
        return set.size();
    }
}
