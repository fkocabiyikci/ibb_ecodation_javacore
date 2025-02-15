package com.fkocabiyikci.Examples;

import java.util.Scanner;


public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı yazınız: ");
        double number;
        number =scanner.nextDouble();


        if(number < 0) {
            System.out.println("Sayı negatiftir. ");
        }
        else if(number>0){
            System.out.println("Sayı pozitiftir. ");
        }
        else {
            System.out.println("Sayı 0'dır. ");
        }
        scanner.close();



    }
}
