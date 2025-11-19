/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author emmas
 */
public class Baton extends Arme{
    
    int age;   

    public Baton(String n, int niv, int ag) {
        super(n, niv); 

        if (ag > 100) {
            ag = 100;
        } else if (ag < 0) {
            ag = 0;
        }
        age = ag;
    }

    @Override
    public String toString() {
        return super.toString() + " | Age : " + age;
    }
    
}
