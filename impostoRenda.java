import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sal = new Scanner(System.in);
		System.out.print("Por favor digite o valor dos seus ganhos mensais: ");
		double salario = sal.nextDouble();
		double imposto = 0;
		// declaramos variaveis que realizam o calculo previamente para usarmos
		double deducao22 = (4664 - 3751) * 0.225;
		double deducao15 = (3751 - 2826) * 0.15;
		double deducao7 = (2826 - 2259) * 0.075;


		// o if testa em qual malha voce entra e realiza os calculos
		// puxando o valor de deducao das variaveis ja criadas para facilitar o codigo
		if (salario < 2259) {
			System.out.println("Voceh esta fora da malha do leao, saiu ileso do miau! ");
		} else if (salario > 2259 && salario < 2826) {
			imposto = (salario - 2259) * 0.075;
			salario = salario - imposto;
		} else if (salario > 2826 && salario < 3751) {
			imposto = (salario - 2826) * 0.15;
			imposto = imposto + deducao7;
		} else if (salario > 3751 && salario < 4664) {
			imposto = (salario - 3751) * 0.225;
			imposto = imposto + deducao15;
			imposto = imposto + deducao7;
		} else if (salario > 4664) {
			imposto = (salario - 4664) * 0.275;
			imposto = imposto + deducao22;
			imposto = imposto + deducao15;
			imposto = imposto + deducao7;
		}
		if (salario >2259) {
			salario = salario - imposto;
			// Aqui realizei o uso do string.format, algo que não foi ensinado ainda
			// ele serve pra transformar as variaveis em texto para impressao
			// Alem disso o uso do %.2f eh feito para que tenhamos numeros 
			// de somente 2 casas decimais
			// NAO USEM ENQUANTO ELE NAO ENSINAR
			System.out.println(String.format("O leaozinho te pegou, pode passando R$ %.2f pra gente ai", imposto));
			System.out.println(String.format("Te sobrou R$ %.2f otario", salario));
		}
	}
}