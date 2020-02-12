/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba;
public class kerucut {
    double alas;
    double selimut;
    double tinggi1;
    double hasil;
     public kerucut() {
    }
    kerucut(double alas, double selimut, double tinggi1){
        this.alas = alas;
        this.selimut = selimut;
        this.tinggi1 = tinggi1;
    }
    public double jumlah(double alas, double selimut){
        hasil=alas+selimut;
        return hasil;
}
        public double volume2(double alas,double tinggi1){
        hasil=1/3*alas*tinggi1;
        return hasil;
}
}
