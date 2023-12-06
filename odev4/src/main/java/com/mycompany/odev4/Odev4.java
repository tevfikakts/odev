/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.odev4;
import java.util.Scanner;
/**
 *
 * @author tevfikaktas
 */
public class Odev4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("10 ile 99 arasındaki iki basamaklı sayıların çarpımı sonucu bulunan palindromik sayılar");
        for (int i = 10; i <= 99; i++) {//iç içe döngü başlatır
            for (int j = 10; j <= 99; j++) {//içerdeki döngüdür her i değerini artan j değeri ile işlem yaptırır
                int k = i * j;//dışardaki dögü ile içerdeki döngüdeki değişkenleri çarpar
                int gecici = k;// k nın değişmemesi için gecici bir değer atanır
                int basamakdeger = 0;
                int ters = 0;
                
                while (gecici > 0) {
                    basamakdeger = gecici % 10;//her bir basamak değerini rakam olarak verir
                    ters = (ters * 10) + basamakdeger;//bulunan basamak değeri sayesinde sayıyı tersten yazdırır.
                    gecici /= 10;//geri kalan basamak değerlerini bulmak için her seferinde sayıyı 10 a böler
                } 
                
                if (ters == k) {//eğer çarpımları ile çarpımlarının tersi birbirine eşitse true değer döndür
                    System.out.println(i + " x " + j + " = " + k + " = " + ters);// sayının çarpımı ve tersinin eşit olduğu durumda yazdır
                }
            }
        }
    }    
}
