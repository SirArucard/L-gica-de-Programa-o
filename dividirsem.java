package dividindo;
import java.util.Scanner;

public class Dividindo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Dividendo: ");
		int dividendo = in.nextInt();
		System.out.print("Divisor: ");
		int divisor = in.nextInt();
		int quociente = 0;
		int resto = 0;
		// Abaixo o if testa se o divisor que o usuario escreveu eh zero
		// Se não ele segue pra um calculo, enquanto o dividendo for maior ou igual
// divisor
		// nisso ele atribui ao dividendo o valor dele mesmo menos o divisor
		// No momento que o dividendo passar a ser menor que o divisor ele para
		// Se o dividendo for menor que o divisor ele somente atribui o valor ao resto
		if (divisor == 0) {
			System.out.println("O quociente eh indefinido ");
		} else if (dividendo > divisor) {
			while (dividendo >= divisor) {
				dividendo = dividendo - divisor;
				quociente++;
				resto = dividendo;
			}
		} else if (dividendo < divisor) {
			resto = dividendo;
		}
		// Imprime os valores do resultado, que e o quociente, e o resto
		System.out.println("Resultado: " +quociente);
		System.out.println("Resto: " +resto);
	}
}
