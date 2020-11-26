/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas35;

/**
 *
 * @author dropsuite
 */
public class gajiTotal {
    boolean isMarried;
    double gaji;
    double tunjangan = 0.35;
    private double hitungTunjangan(double gaji){
        if(isMarried){
            return tunjangan*gaji;
        }
        return 0;
    }
    public void hitungTotalGaji(double parGaji){
        double totalTunjangan = hitungTunjangan(parGaji);
        double totalGaji=totalTunjangan+parGaji;
        System.out.println("Gaji Pokok: "+parGaji);
        System.out.println("Tunjangan: "+totalTunjangan);
        System.out.println("Gaji Total Anda: "+totalGaji);
    }
}
