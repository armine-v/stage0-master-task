package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        if(monthNumber==1 || monthNumber == 2 || monthNumber == 12)
            System.out.print("Winter\n");
        else if(monthNumber>= 3 && monthNumber<= 5)
            System.out.print("Spring\n");
        else if(monthNumber>= 6 && monthNumber<= 8)
            System.out.print("Summer\n");
        else if(monthNumber>= 9 && monthNumber<= 11)
            System.out.print("Autumn\n");
        else
            System.out.print("Wrong month number\n");
    }

}
