/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studi.kasus.pkg4;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class StudiKasus4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner S = new Scanner(System.in);
        int A = S.nextByte();
        if(A==1){
            int B = S.nextByte();
            Persegi baru = new Persegi();
            baru.setsisi(B);
            System.out.println(baru.getluas());   
        }
        else if(A==2){
            int B = S.nextByte();
            int C = S.nextByte();
            Segitiga baru = new Segitiga();
            baru.setsisi(B, C);
            System.out.println(baru.getluas()/2);   
        }
        else if(A==3){
            int B = S.nextByte();
            if(0==B%7){
                Lingkaran baru = new Lingkaran();
                baru.setjarijari(B);
                System.out.println((double)(baru.getluasA()));
            }
            else {
                Lingkaran baru = new Lingkaran();
                baru.setjarijari(B);
                
                System.out.println((double)(baru.getluasB()));
            }
        }
        else {System.out.println("Input yang anda masukan tidak sesuai");}
    }
}
class Persegi{
    private int sisi = 0;
    public void setsisi(int sisi){
        this.sisi = sisi;
    }
    public int getluas(){
        return sisi*sisi;
    }
}
class Segitiga{
    private int sisi = 0;
    private int sisi2 = 0;
    public void setsisi(int sisi, int sisi2){
        this.sisi = sisi;
        this.sisi2 = sisi2;
    }
    public byte getluas(){
        return (byte)(sisi*sisi2);
    }
}
class Lingkaran{
    private int jarijari = 0;
    public void setjarijari(int jarijari){
        this.jarijari = jarijari;
    }
    public int getluasA(){
        return 22/7*jarijari*jarijari;
    }
    public int getluasB(){
        int z = jarijari*jarijari;
        z*=3.14;
        return z;
    }
}
    
