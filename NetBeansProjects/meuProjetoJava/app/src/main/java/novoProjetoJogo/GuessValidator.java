/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package novoProjetoJogo;

/**
 *
 * @author AMANDAROTHMANNPIOVES
 */
public class GuessValidator {
    public boolean validateGuess(int guess, int numberToGuess) {
        if (guess == 1 && numberToGuess == 1) {
            System.out.println("Voces escolherem: tesoura! tente novamente!");
            return false;
        } else if (guess == 2 && numberToGuess == 2) {
            System.out.println("Voces escolherem: pedra! tente novamente!");
            return false;
        } else if (guess == 3 && numberToGuess == 3){
            System.out.println("Voces escolherem: papel! tente novamente!");
            return false;
        }else if (guess == 3 && numberToGuess == 1){
            System.out.println("Voce ganhou!! parabens!");
            return true;
        } else if (guess == 3 && numberToGuess == 2){
            System.out.println("Voce ganhou!! parabens!");
            return true;
        } else if (guess == 2 && numberToGuess == 1){
            System.out.println("Voce ganhou!! parabens!");
            return true;
        } else if (guess == 2 && numberToGuess == 3){
            System.out.println("Voce Perdeu!! Tente novamente!"); 
            return false;
        } else if (guess == 1 && numberToGuess == 2){
            System.out.println("Voce Perdeu!! Tente novamente!"); 
            return false;
        } else if (guess == 1 && numberToGuess == 3){
            System.out.println("Voce ganhou!! parabens!"); 
            return true;
        } else {
            return true;
        }
}
}