/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mercado;

/**
 *
 * @author AMANDAROTHMANNPIOVES
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Mercado {
    public void start() {
        ArrayList<Produto>carrinho = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        
        boolean menu = false;
        
        while(!menu) {
            System.out.println("MENU:\n||1. Adicionar Item\n||2. Remover Item\n||3. Ver Carrinho\n||4. Realizar Pagamento\n||5. Encerrar Programa");
            String opcao = scanner.nextLine();
            
            switch(opcao){
                case "1":
                    System.out.println("SESSAO DESEJADA:\n1 - Comida\n 2 - Eletronico\n 3 - Brinquedo\n 4 - Roupa\n 5 - Limpeza");
                    String sessao = scanner.nextLine();

                    switch(sessao){
                        case "1":
                            System.out.println("Nome do produto:");
                            String produtoComida = scanner.nextLine();
                            double precoComida = Math.random()* 100; 
                            Produto newComida = new Comida(produtoComida,precoComida);
                            carrinho.add(newComida);
                            break;
                        case "2":
                            System.out.println("Nome do produto:");
                            String produtoEletronico = scanner.nextLine();
                            double precoEletronico = (Math.random()* 1000)+ 100; 
                            Produto newEletronico = new Eletronico(produtoEletronico,precoEletronico);
                            carrinho.add(newEletronico);
                            break;
                        case "3":
                            System.out.println("Digite o nome do produto:");
                            String produtoB = scanner.nextLine();
                            double precoB = (Math.random()* 300)+20; 
                            Produto newBrinquedo = new Brinquedo(produtoB,precoB);
                            carrinho.add(newBrinquedo);   
                            break;
                        case "4":
                            System.out.println("Nome do produto:");
                            String produtoRoupa = scanner.nextLine();
                            double precoRoupa = (Math.random()* 300)+ 30; 
                            Produto newRoupa = new Roupa(produtoRoupa,precoRoupa);
                            carrinho.add(newRoupa);
                            break;
                        case "5":
                            System.out.println("Digite o nome do produto:");
                            String produtoLimpeza = scanner.nextLine();
                            double precoLimpeza = Math.random()* 100; 
                            Produto newLimpeza = new Limpeza(produtoLimpeza,precoLimpeza);
                            carrinho.add(newLimpeza);
                        default:
                            System.out.println("Opcao invalida");
                            break;
                    }
                    break;
                case "2":
                    for(int i = 0; i < carrinho.size();i++){
                        System.out.println(i + " - "+ carrinho.get(i).nome);
                    }

                    System.out.println("Digite o numero do produto que quer remover: ");
                    int remove = scanner.nextInt();
                    carrinho.remove(remove);
                    break;
                case "3":
                    System.out.println("Produtos no Carrinho");

                    for (int i = 0; i < carrinho.size();i++) {
                        System.out.print(carrinho.get(i).nome + " ");
                        System.out.println("R$"+ df.format(carrinho.get(i).preco));
                    }
                    break;
                case "4":
                    System.out.println("Pagamento Realizado");
                    carrinho.clear();
                    break;
                case "5":
                    System.out.println("Ecerrando...");
                    menu = true;
                default:
                    System.out.println("Opcao invalida! Tente novamente.");
            }
        }
    }
}