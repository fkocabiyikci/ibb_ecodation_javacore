package com.fkocabiyikci.Examples;

import java.util.Scanner;


public class LinearEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1.Dereceden 1 Bilinmeyenli Denklem Çözme");
        System.out.println("a sayısını giriniz: ");
        double a = scanner.nextFloat();
        System.out.println("b sayısını giriniz: ");
        double b = scanner.nextFloat();

        double x = -b / a;
        System.out.println("x'in değeri: " +x);

        scanner.close();

    }}
