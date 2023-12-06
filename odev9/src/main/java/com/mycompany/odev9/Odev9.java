/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.odev9;
import java.util.Scanner;
/**
 *
 * @author tevfikaktas
 */
public class Odev9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 1;
        int toplam = 0;
        while (n <= 10) {
            toplam = toplam + n;//toplam değerine her n değeri eklenir
            System.out.println(" 1 den "+n+" 'e kadar toplam = "+toplam);//n değerine kadar olan toplam yazdırılır
            n++;//1 den 10 a kadar gidebilmesi için n artırılır
        } 
    }
}
