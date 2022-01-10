package PracticeLeetCode.Easy;

import ConditionsAndLoops.SwitchStmt;

public class RomanToInteger {
    public static void main(String[] args){
        String s = "MCMXCIV";
        System.out.println(convert(s));
    }

    static int convert(String s){

        int ans = 0;
        while(!s.isEmpty()){
            String ch = s.substring(0,1);
            if(ch.equals("V") || ch.equals("L") || ch.equals("D") || ch.equals("M")){
                switch (ch){
                    case "V":
                        ans = ans + 5;
                        break;
                    case "L":
                        ans = ans + 50;
                        break;
                    case "D":
                        ans = ans + 500;
                        break;
                    case "M":
                        ans = ans + 1000;
                        break;
                }
                s = s.substring(1);
            }
            if(ch.equals("I") || ch.equals("X") || ch.equals("C")){
                if(s.length() >= 2 ) {
                    String chNext = s.substring(0, 2);

                    if (chNext.equals("IV") || chNext.equals("IX") || chNext.equals("XL") || chNext.equals("XC") || chNext.equals("CD") || chNext.equals("CM")) {
                        switch (chNext) {
                            case "IV":
                                ans += 4;
                                break;
                            case "IX":
                                ans += 9;
                                break;
                            case "XL":
                                ans += 40;
                                break;
                            case "XC":
                                ans += 90;
                                break;
                            case "CD":
                                ans += 400;
                                break;
                            case "CM":
                                ans += 900;
                                break;
                        }
                        s = s.substring(2);
                    }
                    else {
                        switch (ch) {
                            case "I":
                                ans += 1;
                                break;
                            case "X":
                                ans += 10;
                                break;
                            case "C":
                                ans += 100;
                                break;
                        }
                        s = s.substring(1);
                    }
                }
                else {
                    switch (ch) {
                        case "I":
                            ans += 1;
                            break;
                        case "X":
                            ans += 10;
                            break;
                        case "C":
                            ans += 100;
                            break;
                    }
                    s = s.substring(1);
                }
            }
        }
        return ans;
    }
}
