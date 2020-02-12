/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba;
import java.util.Scanner;
import java.util.*;
public class Coba {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        final double phi = 3.14;
        String balek;
        do{
        System.out.println("Menu");
        System.out.println("1.Balok");
        System.out.println("2.Kerucut");
        System.out.println("3.Limas Segitiga");
        String menu = Input.nextLine();
        switch(menu){
            case "1":
                     System.out.print("Panjang :");
                     float panjang = Input.nextFloat();
                     System.out.print("Lebar :");
                     float lebar = Input.nextFloat();
                     System.out.print("Tinggi :");
                     float tinggi = Input.nextFloat();
                     balok hitung = new balok (panjang,lebar,tinggi);
                     System.out.println("Luas Balok : "+hitung.jumlah(panjang,lebar));
                     System.out.println("Volume Balok : "+hitung.volume(panjang,lebar,tinggi));
                 
                break;
             case "2":
                     System.out.print("Luas Alas :");
                     float alas = Input.nextFloat();
                     System.out.print("Luas Selimut :");
                     float selimut = Input.nextFloat();
                     System.out.print(" Tinggi :");
                     float tinggi1 = Input.nextFloat();
                     kerucut luas = new kerucut (alas,selimut,tinggi1);
                     System.out.println("Luas Kerucut : "+luas.jumlah(alas,selimut));
                     System.out.println("Volume Kerucut : "+luas.volume2(alas,tinggi1));
                 
                break;
                 case "3":
                     System.out.print("Luas Alas :");
                     float alas1 = Input.nextFloat();
                     System.out.print("Luas total Segitiga :");
                     float total = Input.nextFloat();
                     System.out.print(" Tinggi :");
                     float tinggi2 = Input.nextFloat();
                     limas luas1 = new limas (alas1,total,tinggi2);
                     System.out.println("Luas Limas : "+luas1.jumlah(alas1,total));
                     System.out.println("Volume Limas : "+luas1.volume1(alas1,tinggi2));
                 
                break;
        }
        System.out.print("Balek :");
        Input.nextLine();
        balek = Input.nextLine();
    }while(balek.equals("y"));
    }   
    
}
