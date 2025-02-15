package com.fkocabiyikci.Examples;


import java.util.Scanner;


public class SingleOrDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı yazınız: ");

        int number;
        number = scanner.nextInt();
        if(number <0){
            System.out.println("Lütfen pozitif bir sayı giriniz: ");
        }
        else if(number>0){
            if (number % 2 == 0){
                System.out.println("Sayı çifttir: ");
            }
            else{
                System.out.println("Sayı tektir: ");
            }
            scanner.close();
        }
    }
}
