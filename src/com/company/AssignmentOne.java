package com.company;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class AssignmentOne {


    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("C://Users//Gulnaz Sergey//Documents//course1//java//file1.txt.txt"));
        Scanner sc2 = new Scanner(new File("C://Users//Gulnaz Sergey//Documents//course1//java//file2.txt.txt"));
        int x, y;
        Shape shape = new Shape();
        while(sc1.hasNextLine()) {
            x = sc1.nextInt();
            y = sc1.nextInt();
            Point point1=new Point(x, y);
            shape.addPoint(point1);
        }
        System.out.println("File1: ");
        System.out.println("The perimeter of the first Shape is: " + shape.calcPerimeter());
        System.out.println("The longest side of the first Shape is: " + shape.longSide());
        System.out.println("The average length of the first Shape is: " + shape.averageLength());
        Shape shape2=new Shape();
        while(sc2.hasNextLine()) {
            x = sc2.nextInt();
            y = sc2.nextInt();
            Point point2=new Point(x,y);
            shape2.addPoint(point2);
        }
        System.out.println("File2: ");
        System.out.println("The perimeter of the second Shape is: " + shape2.calcPerimeter());
        System.out.println("The longest side of the second Shape is: " + shape2.longSide());
        System.out.println("The average length of the second Shape is: " + shape2.averageLength());
    }



}


