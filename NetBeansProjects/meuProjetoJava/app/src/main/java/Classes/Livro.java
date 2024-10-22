/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author AMANDAROTHMANNPIOVES
 */
public class Livro {
    // Atributos
    private String titulo;
    private String autor;
    private int paginas;

    // Construtor
    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // Métodos
    public void mostrarDados() {
        System.out.println("||Titulo: " + titulo + "\n||Autor: " + autor + "\nPaginas: " + paginas);
    }
}