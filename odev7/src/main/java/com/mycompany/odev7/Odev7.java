/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.odev7;

/**
 *
 * @author tevfikaktas
 */
public class Odev7 {

    public static void main(String[] args) {
        System.out.println("0 ile 100 arasındaki sayılarda çift ve tek sayıları yazdırma");
        for(int i=1; i<=100; i++){
            if(i%2==0){//sayının 2 ile bölümünden kalanı 0 ise çifttir
                System.out.println(i+" sayısı çifttir");
            }
            else if(i%2==1){//sayının 2 ile bölümünden kalanı 1 ise sayı tektir
                System.out.println(i+" sayısı tektir");
            }
        }
    }
}
