package javaapplication1;

import java.util.Scanner;


public class JavaApplication1 {


    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Manda o nome e sobrenome: ");
    String nome = in.nextLine();
    
    System.out.print("Diga-me sua idade: ");
    int idade = in.nextInt();
    
    System.out.print("Voceh eh um estudante? Sim ou Nao? S/N ");
    char resposta = in.next().charAt(0);
    
    boolean estudante;
    
    if (resposta == 'S'){
        estudante = true;
    } else if (resposta == 'N') {
        estudante = false;
    } else {
        System.out.print("PAra de ser burro porra, e S ou N caralho");
        resposta = in.next().charAt(0);
        
    }
    System.out.printf("Informacoes %s, %d anos, estudante: %b%n", nome, idade, estudante);
    }
    
}