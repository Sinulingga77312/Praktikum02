/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba;

public class limas {
    double alas1;
    double total;
    double tinggi2;
    double hasil;
     public limas() {
    }
    limas(double alas1, double total, double tinggi2){
        this.alas1 = alas1;
        this.total = total;
        this.tinggi2 = tinggi2;
    }
    public double jumlah(double alas1, double total){
        hasil=alas1+3*total;
        return hasil;
}
    public double volume1(double alas1, double tinggi2){
        hasil=0.3*alas1*tinggi2;
        return hasil;
}
}
