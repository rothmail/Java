/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces.SistemaDePagamento;

/**
 *
 * @author AMANDAROTHMANNPIOVES
 */
public class Main {
    public static void main(String[] args) {
        CartaoCredito pagarCredito = new CartaoCredito();
        PayPal pagarPP = new PayPal();
        
           pagarCredito.processarPagamento(2);
           pagarPP.processarPagamento(2);
           System.out.println(pagarCredito.obterDetalhes());
           System.out.println(pagarPP.obterDetalhes());
    }
}
