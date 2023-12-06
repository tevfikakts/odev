/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.odev10;
import java.util.Scanner;
/**
 *
 * @author tevfikaktas
 */
public class Odev10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 den 10 a kadar fatöryelleri alan fakat 5 faktöryeli almayan döngü");
        int faktoryel = 1;
        for (int n = 1; n <= 10; n++) {
            if (n == 5)
            continue;  //eğer n değeri 5 ise bir sonraki işlemi yapmadan döngüyü dögünün 1 arttırılmış hali ile devam eder
            faktoryel = faktoryel * n; //her n değerini faktoryel değişkeni ile çarpıp çıkan sonucu faktoryel değişkenine atıyoruz 
            System.out.println(n+"! = "+faktoryel);// her n değeri için faktoryel değişkenini yazdırıyoruz
        }
    }
}
