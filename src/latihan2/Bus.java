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
public class Bus {
    public int penumpang;
    public int maxPenumpang;
    //konstruktor kela bus
    public Bus(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }

    
    //method mutator untuk menambahkan penumpang
    public void addPenumpang(int penumpang){
        int temp;
        temp = this.penumpang+penumpang;
        if(temp >= maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else{
            this.penumpang = temp;
        }
    }
    public void cetak(){
        System.out.println("Penumpang Bus sekarang adalah "+penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah "+maxPenumpang);
    }
}
