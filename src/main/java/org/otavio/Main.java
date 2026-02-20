package org.otavio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double valorReais = 100;
        
        double realParaDolar = 0.19;
        double valorRealEmDolar = valorReais * realParaDolar;
        System.out.println(valorRealEmDolar);
    }
}