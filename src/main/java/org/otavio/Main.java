package org.otavio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor que deseja converter: ");
        double valorReais = scanner.nextDouble();
        double realParaDolar = 0.19;
        double valorRealEmDolar = valorReais * realParaDolar;
        System.out.println(valorRealEmDolar);
    }
}