package orgvetor;
import java.util.Scanner;

public class Orgvetor {

    import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int tamanhoArray = 0; //declara tamanho do Array
		int cont = 0; //Inicia o contador
		System.out.println("Me diga o tamanho do vetor: ");
		tamanhoArray = in.nextInt(); //Pede o tamanho do array
		while (tamanhoArray <= 0) {
			System.out.println("Digite um valor acima de 0");
			tamanhoArray = in.nextInt(); //Protege de array negativo
		}

		double[] numArray = new double[tamanhoArray]; //Inicia um Array com tamanho que o usuario digitou

		System.out.println("Digite abaixo os valores, um a um");
		while (cont < numArray.length) {
			numArray[cont] = in.nextDouble();
			cont++; //valores a cada bloco do array
		}
		cont = 0; //reinicia o valor do contador
		double trocador = 0; //Trocador de numeros
		int tamanhoTotal = tamanhoArray - 1; //protege o tamanhoTotal do Array;
		while (tamanhoTotal > 0) {
			cont = 1;
			while (cont <= tamanhoTotal) {
				if (numArray[cont] < numArray[cont - 1]) {
					trocador = numArray[cont];
					numArray[cont] = numArray[cont -1];
					numArray[cont -1] = trocador;
				}
				cont++;
			}
			tamanhoTotal--;
		}
		System.out.println(numArray[0] + " " + numArray[1] + " " + numArray[2] + " " + numArray[3]);
	}
}
}