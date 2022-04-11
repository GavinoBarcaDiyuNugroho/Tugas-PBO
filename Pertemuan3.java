/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Pertemuan3 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Surat Kaisar
        Scanner S = new Scanner(System.in);
        String rahasia = S.nextLine();
        int panjang = rahasia.length();
        int geser = S.nextInt();
        geser = geser%26;
        String str ="";
        char [] alfa = new char[] {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char [] alfaB = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(int b=0;b<panjang;b++){
            for(int a = 0; a<26;a++){
                if(26==geser+a && rahasia.charAt(b)==alfa[a]){
                    str = str + String.valueOf(alfa[a+geser-1]);
                }
                else if(26==geser+a && rahasia.charAt(b)==alfaB[a]){
                    str = str + String.valueOf(alfaB[a+geser-1]);
                }
                else if(26< geser+a && rahasia.charAt(b)==alfa[a]){
                    str = str + String.valueOf(alfa[a+geser-27]);
                }
                else if(26< geser+a && rahasia.charAt(b)==alfaB[a]){
                    str = str + String.valueOf(alfaB[a+geser-27]);
                }
                else if(rahasia.charAt(b)==alfa[a]){
                    str = str + String.valueOf(alfa[a+geser]);
                }
                else if(rahasia.charAt(b)==alfaB[a]){
                    str = str + String.valueOf(alfaB[a+geser]);
                }
            }
        }
        System.out.print(str);
        
        
        //Menghitung Luas
        int A = S.nextByte();
        if(A==1){
            int input=S.nextByte();
            System.out.println(persegi(input));
        }
        else if(A==2){
            int input1 =S.nextByte();
            int input2 =S.nextByte();
            System.out.println(persegi(input1,input2));
        }
        else if(A==3){
            int input1 =S.nextByte();
            if(jarijari(input1)==0){
                double hasil =22/7*persegi(input1);
                System.out.println(hasil);
            }
            else{
                int z = persegi(input1);
                z*=3.14;
                System.out.println((double)(z)); 
            } 
        }
        else System.out.println("Input yang anda masukan tidak sesuai");
        
        //Saldo Nasabah
        long saldo = S.nextLong();
        long isi = S.nextLong();
        double bonus = (hasil(saldo,isi)-7000)*0.0005;
        System.out.println(hasil(saldo,isi)-7000+bonus);
    }
    
    public static long hasil(long A, long B){
        return A + B;
    
    }
    public static byte persegi(int A){
        return (byte)(A*A);
    }
    public static byte persegi(int A,int B){
        return (byte)(A*B/2);
    }
    public static int jarijari(int A){
        int B = A%7;
        return B;
    }
        
    
}
