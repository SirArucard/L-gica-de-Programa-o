import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("digite seu nome");
		String s = in.nextLine(); 
		char[] vet = s.toCharArray(); // Converte a string em um array de chars
		// Usa um for para percorrer o vetor com mais facilidade
		// Dentro do for, usa um if que verifica se o valor daquele indice é um ‘a’
		// Troca o valor ‘a’ por um espaço vazio
		for (int cont = 0; cont < vet.length; cont++) {
			if (vet[cont] == 'a') {
				vet[cont] = ' ';
			}
		}
		// Usa um for para imprimir cada valor do array de forma individual
		for (int cont = 0; cont < vet.length; cont++) {
			System.out.println(vet[cont]);
		}
	}
}


Obstante, essa substituição só troca o valor ‘a’, não o valor ‘A’, então se você tentar escrever “ARARA” nada mudará, mas “arara”, só será impresso “ r r “.


Na folha abaixo o mesmo código, porém usando while ao invés de for



















import java.util.Scanner;

public class SubstituiVogalWhile {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("digite seu nome");
        String s = in.nextLine();
        char[] vet = s.toCharArray();
        int cont = 0;
        while (cont < vet.length) {
            if (vet[cont] == 'a') {
                vet[cont] = ' ';
            }
            cont++;
        }

        cont = 0;
        while (cont < vet.length) {
            System.out.println(vet[cont]);
            cont++;
        }
    }
}