/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes.Batalha;

/**
 *
 * @author AMANDAROTHMANNPIOVESANA
 */
class Personagem {
    String nome;
    int vida;
    int atack;
    
    public Personagem(String nome, int vida, int atack){
        this.nome = nome;
        this.vida = vida;
        this.atack = atack;
            
    }
    
    public void atacar(Personagem outroPersonagem){
        outroPersonagem.vida -= this.atack;
    }
    
    public boolean estarVivo(){
        if(this.vida <= 0){
            return true;
        }else{
            return false;
        }
    }
}