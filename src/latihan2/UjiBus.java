/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author ASUS GAMING PC
 */
public class UjiBus {
    public static void main(String[] args) {
        //membuat objek bus mini dari kelas bus
        Bus busBesar = new Bus(40);
        busBesar.cetak();
        //penambahan penumpang
        busBesar.addPenumpang(15); //menambah 15
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(5); //nambah 5
        busBesar.cetak();
        //penambah lagi
        busBesar.addPenumpang(26); //nambah 26
        busBesar.cetak();
        
    }
}
