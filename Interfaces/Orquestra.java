/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author AMANDAROTHMANNPIOVES
 */
public class Orquestra {
    public static void main(String[] args) {
        Violao meuViolao = new Violao();
        Violino meuViolino = new Violino();
        Guitarra minhaGuitarra = new Guitarra();
        
            System.out.println(meuViolao.tocar());
            System.out.println(meuViolino.tocar());
            System.out.println(minhaGuitarra.tocar());
            
            
            System.out.println(meuViolao.afinar());
            System.out.println(meuViolino.afinar());
            System.out.println(minhaGuitarra.afinar());
    }
}
