/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.odev8;
import java.util.Scanner;
/**
 *
 * @author tevfikaktas
 */
public class Odev8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("girilen kenarlar ile dikdörtgenin alanını bulma");
        System.out.println("kenar1 i giriniz: ");
        int kenar1 = scanner.nextInt();//kenar1 kullanıcıdan alınır
        System.out.println("kenar2 yi giriniz:  ");
        int kenar2 = scanner.nextInt();// kenar2 kullanıcıdan alınır
        int alan = kenar1*kenar2; // kenar1 ve kenar2 çarpılır ve alan değişkenine atanır
        System.out.println("dikdörtgenin alanı: "+alan); // alan yazdırılır
    }
}
