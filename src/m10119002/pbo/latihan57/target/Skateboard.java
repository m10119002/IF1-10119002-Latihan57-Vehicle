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
 * Deskripsi Program : Class untuk objek Skateboard
 * Pertemuan 5
 * 
 */
public class Skateboard extends Vehicle {
    private double myBoardLength;
    
    public Skateboard() {System.out.println("SkateBoard");}
    
    public double getBoardLength() {return this.myBoardLength;}
    public void setBoardLength(double boardLength) {this.myBoardLength = boardLength;}
}
