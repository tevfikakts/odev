/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.odev1;

import java.util.Scanner;

/**
 *
 * @author tevfikaktas
 */
public class Odev1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("0 ile 100 arasında rastgele oluşturulan 10 sayının toplamını veren kod");//başlık
        int sayi,toplam = 0;    //değişkenler tanımlandı
        for(int i=1; i<10; i++){    //10 adet sayıyı döndürmesi için for döngüsü
            sayi = (int) (Math.random() * 100);     //0 ile 100 arasında rastgele sayı üretir 
            toplam += sayi;     //üretilen rastgele sayıları her defasında toplar
            System.out.println("sayi: "+sayi);      //0 ile 100 arasında rastgele üretilen her sayıyı yazdırır
        }
        System.out.println("sayıların toplamı: "+toplam);       //rastgele üretilen sayıların tolamını yazdırır
    }
}
