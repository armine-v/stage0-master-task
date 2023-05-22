package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        String number_string = String.valueOf(number);
        String number_reversed = "";
        for (int i = number_string.length() - 1; i >= 0; i--) {
            number_reversed += number_string.charAt(i);
        }
        number = Integer.parseInt(number_reversed);
        System.out.print(number + "\n");
    }
}
