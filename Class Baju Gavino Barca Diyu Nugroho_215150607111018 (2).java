/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baju;

/**
 *
 * @author DELL
 */
public class bajuharga {
    String jenis;
    int harga, jumlah;
    final int bajua = 100000;
    final int bajub = 125000;
    final int bajuc = 175000;
    
    void displayawal(){
        System.out.println("Baju yang tersedia :");
        System.out.println("Baju A dengan harga 100000");
        System.out.println("Baju B dengan harga 125000");
        System.out.println("Baju C dengan harga 175000");
    }
    void hargaa(){
        if(this.jumlah>100){
            this.harga=95000;
        }
        else this.harga = this.bajua;
    }
    void hargab(){
        if(this.jumlah>100){
            this.harga=120000;
        }
        else this.harga = this.bajub;
    }
    void hargac(){
        if(this.jumlah>100){
            this.harga=160000;
        }
        else this.harga = this.bajuc;
    }
    
    void display(){
        if(jenis.equalsIgnoreCase("a")){
            hargaa();
        }
        else if(jenis.equalsIgnoreCase("b")){
            hargab();
        }
        else if(jenis.equalsIgnoreCase("c")){
            hargac();
        }
        System.out.println("Jenis yang anda beli    : " +jenis);
        System.out.println("harga per buah          : " +harga);
        System.out.println("Total harga             : " +harga*jumlah);
    }
    
}
