/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes.Batalha;

/**
 *
 * @author AMANDAROTHMANNPIOVES
 */
public class Mago extends Personagem {
    
    
        public Mago(String nome){
        super(nome, 80, 25);
    }
    
    public void atackOfFire(){
        this.atack += this.atack;
    }
}