package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        //number is a 4-digit number
        int sum = 0;
        for(int i = 3; i >= 0; --i){
            sum += (int)(number/Math.pow(10,i));
            number -= Math.pow(10,i) * (int)(number/Math.pow(10,i));
        }
        System.out.print(sum + "\n");
    }
}
