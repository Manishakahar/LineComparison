package com.blz.lineComparison;
import java.util.Scanner;
public class LineComparison {
    static  int x1,y1,x2,y2;
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation");
        Double length1=getInput();
        Double length2=getInput();
        int result=length1.compareTo(length2);
        if(result==0)System.out.println("lines are equals");
        if(result==1) {
            System.out.println("First line is grater than second");
        } else{
            System.out.println("Second line is grater then First");
        }
    }
    public static double calculatedLength() {
        double x=Math.pow((x2-x1), 2);
        double y=Math.pow((y2-y1), 2);
        double length = Math.floor(Math.sqrt(x+y));
        return length;
    }
    public static double getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Line Coordinate for first point");
        x1=sc.nextInt();
        y1=sc.nextInt();
        System.out.println("Enter Line Coordinate for Second point");
        x2=sc.nextInt();
        y2=sc.nextInt();
        calculatedLength();
        return calculatedLength();
    }
}

