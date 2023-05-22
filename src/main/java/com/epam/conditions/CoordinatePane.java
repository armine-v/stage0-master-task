package com.epam.conditions;

public class CoordinatePane {

    public void printQuadrant(int x, int y) {
        if(x==0 || y==0)
            System.out.print("zero\n");
        else if (x > 0) {
            if (y > 0)
                System.out.print("first\n");
            else if (y < 0)
                System.out.print("fourth\n");
        }
        else if (x < 0) {
            if (y > 0)
                System.out.print("second\n");
            else if (y < 0)
                System.out.print("third\n");
        }
    }
}

