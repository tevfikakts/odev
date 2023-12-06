/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.odev6;
import java.util.Scanner;
/**
 *
 * @author tevfikaktas
 */
public class Odev6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("decimalden binary e çevirmek için decimal sayıyı giriniz: ");
        int sayi = scanner.nextInt();
        int gecici = sayi,kalan,binary=0,basamak=1;
        while(gecici>0){
            kalan = gecici % 2;//sayının 2 ye bölümünden kalanını al 
            binary = binary + (kalan * basamak); //kalanı basamak katsayısı ile çarp ve binary değişkenine ekle ve binary değişkenine ata
            gecici /= 2; // sayının yeni değeri bir önceki sayının 2ye bölünmüş hali
            basamak *= 10;// basamak katsayısını (decimale çevirdiğimiz için) her defasında 10 ile çarp
        }
        System.out.println(sayi+" decimal sayısının binary karşılığı: "+binary);// sonuçta bulunan binary sayısını yazdır
    }
}
