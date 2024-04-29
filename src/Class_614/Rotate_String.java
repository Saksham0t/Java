package Class_614;

import java.util.Scanner;

public class Rotate_String {
    public static boolean rotateString(String s, String goal) {
        int len = s.length();
        if (len != goal.length()) {
            return false;
        }
//        StringBuilder str = new StringBuilder(goal);
//        str = str.append(str);
//        return str.indexOf(s) != -1;

        String concatenated = goal + goal;
        return concatenated.contains(s);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter String s:");
        String s = scn.next();
        System.out.println("Enter goal String:");
        String goal = scn.next();

        System.out.println(rotateString(s,goal));
    }
}

