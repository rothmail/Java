/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author AMANDAROTHMANNPIOVES
 */
public class Violino implements InstrumentoMusical {
    @Override
    public String tocar() {
        return "O violino esta tocando";
    }
    @Override
    public String afinar() {
        return "O violino esta afinado";
    }
}