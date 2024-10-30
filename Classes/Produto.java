/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author AMANDAROTHMANNPIOVES
 */
public class Produto {
    // Atributos
    private String nome;
    private int preco;
    private int quantidade
            ;

    // Construtor
    public Produto(String nome, int preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Métodos
    public void mostrarDetalhes() {
        System.out.println("||Nome: " + nome + "\n||Preco: " + preco + "\nQuantidade: " + quantidade);
    }
}