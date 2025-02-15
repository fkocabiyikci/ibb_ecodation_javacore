package com.fkocabiyikci.Examples;

import java.util.Scanner;


public class CelciusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double celcius, fahrenheit;
        System.out.println("°C değerini giriniz: " );
        celcius = scanner.nextDouble();
        fahrenheit = (celcius *9/5) + 32;
        System.out.println("Fahrenheit değeri: " +fahrenheit);
        scanner.close();

    }
}
