package media;
import java.util.Scanner;

public class Media {

    import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// iniciamos um variavel que sera o tamanho do nosso vetor
		int tamanhoArray = 0;
		int cont = 0;
		System.out.println("Me diga o tamanho do vetor: ");
		// pedimos ao usuario esse valor
		tamanhoArray = in.nextInt();
		// protegemos contra numeros negativos
		// Vetores nao podem ter indices negativos
		// Indice eh o numero de “espaços” de um vetor
		while (tamanhoArray <= 0) {
			System.out.println("Digite um valor acima de 0");
			tamanhoArray = in.nextInt();
		}
		// Declaramos o vetor que tem como quantidade de indices
		// O valor que o usuario nos deu antes
		double[] numArray = new double[tamanhoArray];

		// usando um while, conseguimos alocar valores em cada indice
		// usamos um contador para que o while percorra todo nosso vetor
		// “Vetor[contador] = proximo numero do usuario
		// Assim passamos cada indice
		System.out.println("Digite abaixo os valores, um a um");
		while (cont < numArray.length) {
			System.out.println("Valor num " + cont);
			numArray[cont] = in.nextDouble();
			cont++;
		}
		// realizamos a soma de todos os valores do vetor
		// usamos o mesmo contador de antes, porem zeramos ele antes de usar
		cont = 0;
		double total = 0;
		while (cont < tamanhoArray) {
			total = total + numArray[cont];
			cont++;
		}
		// pra finalizar, de forma facil, usamos o total da soma dividido pelo tamanho
		//do array
		System.out.println("Teste media: " + total / tamanhoArray);
	}

}








