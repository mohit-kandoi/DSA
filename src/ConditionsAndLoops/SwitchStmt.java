package ConditionsAndLoops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchStmt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the name of fruit: ");
        String name  = in.next();
        switch (name) {
            case "mango":
                System.out.println("king of fruits");
                break;
            case "apple":
                System.out.println("red fruit");
                break;
            case "grapes":
                System.out.println("little yellow fruit");
                break;
            default:
                System.out.println("enter valid fruit name!");
                break;
        }
    }
}