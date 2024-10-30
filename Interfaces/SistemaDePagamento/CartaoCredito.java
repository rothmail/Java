/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces.SistemaDePagamento;

/**
 *
 * @author AMANDAROTHMANNPIOVES
 */
public class CartaoCredito implements Pagamento {
   String numeroCartao = "1234-5678-9012";
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ valor processado via Cartão de Crédito");
    }
    
    @Override
    public String obterDetalhes() {
        return numeroCartao.substring(numeroCartao.length() - 4);
    }
}
