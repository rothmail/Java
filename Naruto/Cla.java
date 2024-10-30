/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Naruto;

/**
 *
 * @author AMANDAROTHMANNPIOVES
 */
public abstract class Cla {
    public String nomeDoCla;
    public String lider;
    
    public Cla(String nome, String lider){
    this.nomeDoCla = nome;
    this.lider = lider;
    }
    
    public abstract void habilidadeEspecial();
    public void exibirDetalhes(){
            System.out.println("Cla:" + nomeDoCla + "\nLider:" + lider + "\n");
    }
}
