/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author AMANDAROTHMANNPIOVES
 */
public class App {
    public static void main(String[] args) {
        // Criando um objeto Carro que herda de Veiculo
        Livro caderno = new Livro("sonhos de uma noite de verão", "amanda", 500);
        Aluno pessoa = new Aluno("amanda", 1234, "informatica");
        Produto item = new Produto("sonhos", 2500, 500);

        // Chamando o método da subclasse
        caderno.mostrarDados();
        pessoa.mostrarInformacoes();
        item.mostrarDetalhes();
    }
}
