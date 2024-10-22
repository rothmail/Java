/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author AMANDAROTHMANNPIOVES
 */

public class Aluno {
    // Atributos
    private String nome;
    private int matricula;
    private String curso;

    // Construtor
    public Aluno(String nome, int matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    // Métodos
    public void mostrarInformacoes() {
        System.out.println("||Nome: " + nome + "\n||Matricula: " + matricula + "\nCurso: " + curso);
    }
}