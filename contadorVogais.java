import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("digite um nome"); //Pede ao usuário um nome
        String str = in.nextLine();
        char[] caracteres = str.toCharArray(); //Transforma a string num array de chars
        int totalVogais = 0; //Variavel que guarda a quantidade de vogais
        int cont = 0;
        // O while abaixo passa por todos os valores dentro do array
        // Enquanto o contador for menor que o tamanho do array, ele executa o if Interno 
        // O If testa se o caracter que está na posição contada é uma vogal e adiciona um valor    ao totalVogais
        while (cont < caracteres.length) { 
            if (caracteres[cont] == 'a' ||
                caracteres[cont] == 'e' ||
                caracteres[cont] == 'i' ||
                caracteres[cont] == 'o' ||
                caracteres[cont] == 'u') {
                totalVogais++;
            }
            cont++;
        }
        System.out.println(str + " tem " + totalVogais + " vogais");
    }
}


