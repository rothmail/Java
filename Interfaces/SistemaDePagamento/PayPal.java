/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces.SistemaDePagamento;

/**
 *
 * @author AMANDAROTHMANNPIOVES
 */
public class PayPal implements Pagamento {
   String email = "arpiovesana@gmail.com";
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ valor processado via PayPal");
    }
    
    @Override
    public String obterDetalhes() {
        return email;
    }
}