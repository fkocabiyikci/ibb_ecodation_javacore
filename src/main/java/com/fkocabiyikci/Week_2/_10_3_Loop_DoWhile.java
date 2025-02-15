package com.fkocabiyikci.Week_2;



// do-while şart sağlansın yada sağlanmasın 1 kere çalışır.
public class _10_3_Loop_DoWhile {

    // Şart sağlansa da sağlanmasa da döngü çalışır.

    public static void main(String[] args) {
        // i++  i'nin değerini 1 artırır.
        // i=i+1 i değişkeninin mevcut değerine 1 ekleyerek yeni değerini atar.
        // i+=1 i'nin değerine 1 ekler ve sonucu i'ye geri atar.

        int i = 40;
        do {
            System.out.print(i + " - ");
            i++;
        } while (i <= 10);
    }
}
