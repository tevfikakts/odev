/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.odev3;
import java.util.Scanner;
/**
 *
 * @author tevfikaktas
 */
public class Odev3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("girilen sayının kaçıncı asal sayı olduğunu bulmak için sayı girin");
        int sayi = scanner.nextInt();
        int sayac2=0;
        for(int i = 2; ; i++){//asal sayıyı bulmak için dögü başlatılıyor
            int sayac = 0;//her defasında sayacın sıfırlanması gerekiyor aksi helde aşağıdaki if' in içerisindeki değer sağlanmaz
            for(int j = 2; j<i; j++){//2 den sayıya kadar olan sayılar sayıya bölünür ve kalansız bölünebiliyorsa sayac artırılır
                if(i % j == 0){
                    sayac++;
                }
            }
            if(sayac==0){//sayı bölünmediyse sayac artmaz ve sayı asal sayıdır
                sayac2++;//buradaki sayac2 2 den itibaren kaç tane asal sayı bulunduğunu gösterir
                if(sayac2==sayi){//sayac2 girilen sayıya eşitse kaçıncı sayı olduğunu bulmuşuz demektir.
                    System.out.println(i+" asal sayısı "+sayi+"th asal sayıdır");// i değişkeni asal sayı sayi değişkeni ise kaçıncı olduğunu gösterir
                }
            }
        }
    }
}
