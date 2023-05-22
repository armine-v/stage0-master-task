package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        String str = "";
        for(int j = 0; j < cathetusLength; ++j) {
            for (int i = cathetusLength - j - 1; i > 0; --i) {
                str += " ";
            }
            for(int k = j + 1; k > 0; --k){
                str += k;
            }
            for(int k = 2; k < j + 2; ++k){
                str += k;
            }
            System.out.println(str);
            str = "";
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
