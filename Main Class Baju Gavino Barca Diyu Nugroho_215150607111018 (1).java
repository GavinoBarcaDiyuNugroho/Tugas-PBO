/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baju;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Baju {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner S = new Scanner(System.in);
        bajuharga doni = new bajuharga();
        doni.displayawal();
        System.out.print("Baju yang akan anda beli bertipe : ");
        doni.jenis = S.nextLine();
        System.out.print("Jumlah Baju yang akan anda beli adalah : ");
        doni.jumlah = S.nextInt();
        System.out.println("");
        doni.display();
        
    }
    
}

