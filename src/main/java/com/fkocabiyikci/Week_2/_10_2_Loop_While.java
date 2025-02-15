package com.fkocabiyikci.Week_2;


public class _10_2_Loop_While {

    public static void main(String[] args) {
        // i++  i'nin değerini 1 artırır.
        // i=i+1 i değişkeninin mevcut değerine 1 ekleyerek yeni değerini atar.
        // i+=1 i'nin değerine 1 ekler ve sonucu i'ye geri atar.
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " - ");
            i++;
        }

        // while döngüsü sonsuzluk
        // while(;true){}
    }
}