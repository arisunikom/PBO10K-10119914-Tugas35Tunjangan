/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas35;

/**
 *
 * @author
 * Aris Prabowo
 * IF10K 10119914
 */
public class Main {
    public static void main(String[] args) {
        gajiTotal karyawan = new gajiTotal();
        karyawan.isMarried = true;
        karyawan.gaji= 6000000;
        karyawan.hitungTotalGaji(karyawan.gaji);
    }  
}
