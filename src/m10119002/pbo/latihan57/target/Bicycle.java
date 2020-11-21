/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan57.target;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Class untuk objek Bicycle
 * Pertemuan 5
 * 
 */
public class Bicycle extends Vehicle {
    private int myGearCount;
    
    public Bicycle() {System.out.println("Bicycle");}
    
    public int getGearCount() {return this.myGearCount;}
    public void setGearCount(int gearCount) {this.myGearCount = gearCount;}
}
