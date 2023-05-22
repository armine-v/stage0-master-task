package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if(year < 0 || month < 1 || month > 12)
            System.out.print("invalid date\n");
        else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            System.out.print("31\n");
        else if (month == 4 || month == 6 || month == 9 || month == 11)
            System.out.print("30\n");
        else if (month == 2)
            if (year%4==0)
                if(year%100 == 0 && year%400 != 0)
                    System.out.print("28\n");
                else
                    System.out.print("29\n");
            else
                System.out.print("28\n");
    }
}
