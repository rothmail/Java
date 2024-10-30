/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes.Batalha;

/**
 *
 * @author AMANDAROTHMANNPIOVES
 */
public class Guerreiro extends Personagem {
    public Guerreiro(String nome){
        super(nome, 100, 15);
    }

    public void atackEspecial(){
        this.atack += this.atack;
    }
}
