package com.blz.lineComparison;
import java.util.Scanner;
public class Line_Comparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation");
        System.out.println("Enter the first (x1,y1) point");
        int x1 = getInputFromUser("first");
        int y1 = getInputFromUser("second");
        System.out.println("Enter the second (x2, y2) point");
        int x2 = getInputFromUser("first");
        int y2 = getInputFromUser("second");
        double x = Math.pow((x2 - x1), 2);
        double y = Math.pow((y2 - y1), 2);
        Double length = Math.floor(Math.sqrt(x + y));
        System.out.println(length);

        System.out.println("Enter the second line of co-ordinated");
        System.out.println("Enter the first (a1,b1) point");
        int a1 = getInputFromUser("first");
        int b1 = getInputFromUser("second");
        System.out.println("Enter the second (a2, b2) point");
        int a2 = getInputFromUser("first");
        int b2 = getInputFromUser("second");
        double a = Math.pow((a2 - a1), 2);
        double b = Math.pow((b2 - b1), 2);
        double length1 = Math.floor(Math.sqrt(a + b));
        System.out.println(length1);
        int result = length.compareTo(length1);
    }
    public static int getInputFromUser(String number) {
        System.out.println("Enter the " + number + " line co-ordinated");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();

    }
}
