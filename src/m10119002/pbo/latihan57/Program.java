/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan57;

import m10119002.pbo.latihan57.target.Bicycle;
import m10119002.pbo.latihan57.target.Skateboard;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Program ini berisi program vehicle
 * Pertemuan 5
 * 
 */
public class Program {
    public static void main(String[] args) {
        Bicycle sepeda = new Bicycle();
        sepeda.setBrand("Trek Bike");
        sepeda.setModel("7.4FX");
        sepeda.setGearCount(23);
        
        System.out.println("Brand : ".
                concat(sepeda.getBrand()));
        System.out.println("Model : ".
                concat(sepeda.getModel()));
        System.out.println("Jumlah Gear : ".
                concat(Integer.toString(sepeda.getGearCount())));
        System.out.println("");
        
        Skateboard papanRoda = new Skateboard();
        papanRoda.setBrand("Ally Skate");
        papanRoda.setModel("Rocket");
        papanRoda.setBoardLength(54.5);
        
        System.out.println("Brand : ".
                concat(papanRoda.getBrand()));
        System.out.println("Model : ".
                concat(papanRoda.getModel()));
        System.out.println("Panjangnya Board: ".
                concat(Double.toString(papanRoda.getBoardLength())));
    }
}
