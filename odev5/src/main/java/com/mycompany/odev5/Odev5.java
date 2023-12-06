/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.odev5;
import java.util.Scanner;
/**
 *
 * @author tevfikaktas
 */
public class Odev5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("girilen binary sayının decimal karşılığı için sayı giriniz: ");
        int sayi = scanner.nextInt();
        int bd=0,toplam=0, gecici=sayi;//bd= 2 nin kaçıncı üssü olacağını belirler
        while(gecici>0){
            if(gecici%10==1){//binary sayısının 10 a bölümünden kalan 1 ise işlemi yap eğer 0 olsaydı sayı için işlem yapılmasına gerek kalmazdı
                toplam += (int) Math.pow(2,bd);//basamak 1 ise 2nin bd üssünü al ve toplam ile topla
            }
            gecici = gecici/10;//işlemi sağdan yaptığımız için sayıyı her defasında 10 a böl
            bd++;//if'in true sağlanması farketmeksizin bd yi arttır
        }
        System.out.println(sayi+" binary sayısının decimal karşılığı: "+toplam);//toplam = binary sayının decimal karşılığıdır yazdır
    }
}
