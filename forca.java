import java.util.Scanner;

public class JogoDaForca {

    static int erros; //Conta os erros
    static String palavra; //Guarda a palavra que será descoberta
    static char[] enigma; //Guarda a palavra em enigma ("--------------")
    static char[] letrasUsadas; //Guarda as letras usadas pra descobrir a palavra
    static int totalLetrasUsadas; // Contador para o array letrasUsadas

    // Objeto Scanner para entrada do usuário (equivalente ao 'in' e 'ch' do rascunho)
    static Scanner in = new Scanner(System.in);


    // Função Principal (main)
    public static void main(String[] args) {

        System.out.println("====== Bem vindo ao jogo da Forca! --");
        System.out.println("-------------------------------------"); //"Menu"

        erros = 0;
        totalLetrasUsadas = 0;
        letrasUsadas = new char[26]; // 26 letras do alfabeto
        palavra = definePalavra();  // palavra = ch.next();
        enigma = criaEnigma(palavra); // criaEnigma(palavra);
        exibeTela(letrasUsadas, enigma, erros); // Action - Exibição Inicial

        // Loop principal do jogo que usa o numero de erros
        // Mudei pra erros < 6 porque o loop começa em 0
        while (erros < 6 && verificaEnigma(enigma)) {

            char letra = coletaLetra(); // Action - Entrada do Jogador
            boolean existe = buscaLetra(letra, palavra); // Ação: Lógica de Verificação
            if (existe) {
                substituiNoEnigma(letra, enigma, palavra);
            } else {
                erros++; // Se a letra NÃO existe, o contador de erros aumenta.
            }

            // Ação: Registro da Letra Tentada
            adicionaLetras(letra);

            // Ação: Exibir estado atualizado
            exibeTela(letrasUsadas, enigma, erros);
        }

        // Saída do loop: O jogo terminou.
        // Exibe o resultado final (vitória ou derrota).
        exibeResultado(erros, palavra);
    }
    private static String definePalavra() {
        System.out.print("Jogador 1, digite a palavra secreta: ");
        String p = in.nextLine().toUpperCase(); // Padroniza para maiúsculas
        return p;
    }
    
    private static char[] criaEnigma(String palavra) {
        char[] transformando = new char[palavra.length()];
        
        for (int i = 0; i < transformando.length; i++){
            transformando[i] = '-';
        }
        return transformando;
        
    }
    private static void exibeTela(char[] letrasUsadas, char[] enigma, int erros){
        
    }

    }


