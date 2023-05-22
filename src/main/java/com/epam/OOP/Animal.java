package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){
        String description = "This animal is mostly ";
        description += color + ". It has ";
        description += numberOfPaws;
        if(numberOfPaws == 1)
            description += " paw ";
        else
            description += " paws ";
        description += "and ";
        if(hasFur)
            description += "a fur.";
        else
            description += "no fur.";
        return description;
    }
}