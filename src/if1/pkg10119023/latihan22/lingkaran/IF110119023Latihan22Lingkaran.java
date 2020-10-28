/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if1.pkg10119023.latihan22.lingkaran;

/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R 
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program :
 *
 */
import java.util.Scanner.*;
import java.util.Scanner;
import java.util.InputMismatchException;
public class IF110119023Latihan22Lingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float PHi = 22/7f;
        int diameter;
        System.out.println("=====Perhitungan Lingkaran=====");
        System.out.print("Masukkan nilai diameter lingkaran : ");
        while(!scan.hasNextInt()){
            if (!scan.hasNextInt()){
            System.out.println("Nilai diameter tidak sesuai\n");
            }
            System.out.print("Masukkan nilai diameter lingkaran : ");
            scan.next();
        }
        diameter = scan.nextInt();
        System.out.println("=====Halsil Perhitungan Lingkaran=====");
        int r = diameter/2;
        double luas = (double)PHi*r*r;
        double keliling = (double)PHi*r*2;
        
        System.out.println("Jari-jari Lingkaran = "+r+" cm");
        System.out.printf("Luas Lignkaran : %.2f cm%n",luas);
        System.out.printf("Keliling Lingkaran : %.2f cm%n",keliling);
    }

}
