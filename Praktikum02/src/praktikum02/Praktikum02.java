/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum02;
import java.util.Scanner;
import java.util.*;
public class Praktikum02 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Angka 1 : ");
        int a = input.nextInt();
        System.out.print("Angka 2 : ");
        int b = input.nextInt();
        System.out.println("Menu");
        System.out.println("1.Penjumlahan");
        System.out.println("2.Pengurangan");
        System.out.println("3.Pembagian");
        System.out.println("4.Perkalian");
        System.out.print("Pilih :");
        Kalkulator hitung = new Kalkulator (a,b);
        String menu = input.nextLine();
        switch (menu){
        case "1": 
             System.out.println("Penjumlahan "+hitung.jumlah(a,b));
        break;
        case "2": 
           
             System.out.println("Penjumlahan "+hitung.kurang(a,b));
        break;
        case "3": 
             
             System.out.println("Penjumlahan "+hitung.bagi(a,b));
        break;
        case "4": 
   
             System.out.println("Penjumlahan "+hitung.kali(a,b));
        break;
        
                
        }
        
       
                
    }
    
}
