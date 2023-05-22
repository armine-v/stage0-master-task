package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        String str = "";
        for(int j = 0; j < cathetusLength; ++j) {
            for (int i = cathetusLength - j - 1; i > 0; --i) {
                str += " ";
            }
            for (int k = j + 1; k > 0; --k) {
                str += "*";
            }
            System.out.println(str);
            str = "";
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
