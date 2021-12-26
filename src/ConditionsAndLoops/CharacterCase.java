package ConditionsAndLoops;

import java.util.Scanner;

public class CharacterCase {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        if(ch >= 65 && ch <= 90){
            System.out.println("Uppercase");
        }
        if(ch >= 97 && ch <= 122){
            System.out.println("LowerCase");
        }


    }
}
