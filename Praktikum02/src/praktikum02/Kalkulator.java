/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum02;
public class Kalkulator {
    double a;
    double b;
    double hasil;

    public Kalkulator() {
    }
    Kalkulator(double a, double b){
        this.a = a;
        this.b = b;
    }
    public double jumlah(double a, double b){
        hasil=a+b;
        return hasil;
    }
      public double kurang(double a, double b){
        hasil=a-b;
        return hasil;
    }
        public double kali(double a, double b){
        hasil=a*b;
        return hasil;
    }
          public double bagi(double a, double b){
        hasil=a/b;
        return hasil;
    }
}
