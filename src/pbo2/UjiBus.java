/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2;

/**
 *
 * @author ASUS GAMING PC
 */
public class UjiBus {
    public static void main(String[] args) {
        //membuat objek bus mini dari kelas bus
        Bus busMini = new Bus();
        //memasukkan nilai jumlah penumpang dan penumpang maksimal ke dLm oobjek busmini
        busMini.penumpang = 5;
        busMini.maxPenumpang = 15;
        //memanggil method cetak pada kelas bus
        busMini.cetak();
        //menambhakan penumpang pada busmini
        busMini.penumpang = busMini.penumpang + 5;
        //memanggil method cetak lagi
        busMini.cetak();
        //mengurangi jumlah penumppang
        busMini.penumpang = busMini.penumpang - 2;
        busMini.cetak();
        
        //menambahkan jumlah penumpang 
        busMini.penumpang = busMini.penumpang + 8;
        busMini.cetak();
    }
    
}
