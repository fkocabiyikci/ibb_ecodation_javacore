package com.fkocabiyikci.Week_2;



// do-while şart sağlansın yada sağlanmasın 1 kere çalışır.
public class _10_3_Loop_DoWhile {

    // Şart sağlansa da sağlanmasa da döngü çalışır.

    public static void main(String[] args) {
        // i++
        // i=i+1
        // i+=1

        int i = 40;
        do {
            System.out.print(i + " - ");
            i++;
        } while (i <= 10);
    }
}
