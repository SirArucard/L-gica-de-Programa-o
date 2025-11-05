package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("num: ");
		int num = in.nextInt();
		System.out.print("num2: ");
		int num2 = in.nextInt();
		int contador = 1;
		int somador = num;
		// o if protege e calcula da maneira correta a multiplicacao
		// usando condicoes que protegem o codigo dos numeros negativos
		// e tambem da multiplicacao com numero 0, que sempre da 0
		if (num2 < 0) {
			num2 = 0 - num2;
			while (contador < num2) {
				num = num + somador;
				contador++;
			}
			num = 0 - num;
		} else if (num2 == 0) {
			num = 0;
		} else {
			while (contador < num2) {
				num = num + somador;
				contador++;
			}
		}
		System.out.println("Resultado: " + num);
	}

}}