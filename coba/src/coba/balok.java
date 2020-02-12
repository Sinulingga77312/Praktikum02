/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba;
public class balok {
    double panjang;
    double tinggi;
    double lebar;
    double hasil;
     public balok() {
    }
    balok(double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    public double jumlah(double panjang, double lebar){
        hasil=panjang*lebar;
        return hasil;
}
    public double volume(double panjang, double lebar,  double tinggi){
        hasil=panjang*lebar*tinggi;
        return hasil;
}
}