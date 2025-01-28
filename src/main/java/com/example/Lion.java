package com.example;

import java.util.List;

public class Lion {

    private final boolean hasMane;
    private final Feline feline;

    public Lion(Feline feline, String sex) throws Exception {
        this.feline = feline; // Инъекция зависимости
        if ("Самец".equals(sex)) {
            this.hasMane = true;
        } else if ("Самка".equals(sex)) {
            this.hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - Самец или Самка");
        }
    }
    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}