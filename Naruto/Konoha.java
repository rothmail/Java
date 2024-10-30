/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Naruto;

/**
 *
 * @author AMANDAROTHMANNPIOVES
 */
public class Konoha {
    public static void main(String[] args) {
        ClaUchiha claUchiha = new ClaUchiha("Uchiha", "Sasuke");
        ClaHyuga claHyuga = new ClaHyuga("Hyuga", "Hinata");
        ClaNara claNara = new ClaNara("Nara", "Shikamaru");
        ClaAkimichi claAkimichi = new ClaAkimichi("Akimichi", "Choji");
        
        claUchiha.habilidadeEspecial();
        claUchiha.exibirDetalhes();
        
        claHyuga.habilidadeEspecial();
        claHyuga.exibirDetalhes();
        
        claNara.habilidadeEspecial();
        claNara.exibirDetalhes();
        
        claAkimichi.habilidadeEspecial();
        claAkimichi.exibirDetalhes();
    }
}
