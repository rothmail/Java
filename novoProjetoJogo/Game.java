/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package novoProjetoJogo;

/**
 *
 * @author AMANDAROTHMANNPIOVES
 */
import java.util.Scanner;

public class Game {
     private int numberToGuess;
    private Player player;
    private GuessValidator guessValidator;
    private Scanner scanner;

    public Game() {
        this.numberToGuess = (int) (Math.random() * 3) + 1;
        this.player = new Player();
        this.guessValidator = new GuessValidator();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Bem-vindo ao jogo de pedra-papel-tesoura, " + player.getName() + "!");
        boolean hasWon = false;

        while (!hasWon) {
            System.out.print("Digite seu utensiliu: ");
            int guess = scanner.nextInt();
            hasWon = guessValidator.validateGuess(guess, numberToGuess);
        }

        System.out.println("Parabéns, " + player.getName() + "! Você ganhou.");
    }
}