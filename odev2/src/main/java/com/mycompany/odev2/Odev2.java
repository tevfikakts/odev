/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.odev2;
import java.util.Scanner;
/**
 *
 * @author tevfikaktas
 */
public class Odev2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("verilen 9 basamaklı sayı içinde ardışık 4 basamaklı en büyük çarpımı hesaplaması için sayıyı giriniz: ");
        int sayi = scanner.nextInt();
        int gecici,basamakdeger,carpim=1,sayac,maks=1,gecici2=sayi;
            for(int i=1; i<=6; i++){
                gecici = gecici2;
                carpim=1;//döngünün her aşamasında carpim sıfırlanmalı
                sayac=1;//döngünün her aşamasında sayac sıfırlanmalı
                while(sayac<=4){ //art arda gelen her 4 basamaktaki sayılar birbiriyle çarpılır  
                        basamakdeger = gecici % 10;
                        gecici /= 10;
                        carpim*=basamakdeger;
                        sayac++;
                    }
                gecici2 /= 10;//döngüye sağdan başlandığı için bir sonraki ardışık 4 basamağa geçmek için 10 ile bölünür
                if(maks<carpim){//maks değişkenine her 4 basamaktaki çarpım eğer bir öncekinden büyükse atanır.
                    maks=carpim;
                }   
            } 
        System.out.println(maks);//atanan en büyük maks değeri sonuç olarak yazdırılır
    }
}
