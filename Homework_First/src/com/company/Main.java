package com.company;

import Logic.Logic;

public class Main {
    public static void main(String[] args) {
        Logic start = new Logic();
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + "\t" + start.Check_Division(i));
        }
    }
}
