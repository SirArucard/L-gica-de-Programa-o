import java.util.Scanner;

public class exercicios {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int opcao = 0;
        
        System.out.println(" Bem vindo aos exercicios de ");
        System.out.println(" Fundamentos e Controle de Fluxo!");
        System.out.println("=================================");
        System.out.println("1. Par ou Impar?");
        System.out.println("2. Cancluladora Simples");
        System.out.println("3. Maior de Tres");
        System.out.println("4. Varificacao de Idade");
        System.out.println("5. Tabuada");
        System.out.println("6. Contagem Regressiva");
        System.out.println("7. Soma de Numeros Pares");
        System.out.println("8. Media de Notas");
        System.out.println("9. Senha de Acesso");
        System.out.println("10. Caixa Eletronico Limitado");
        System.out.println("X. Sair (Qualquer outra tecla a nao ser as de cima)");
        opcao = in.nextInt();
        
        switch (opcao) {
            case 1:
                System.out.println("Digire um numero inteiro");
                int numero = in.nextInt();
                if (numero%2 == 0) {
                    System.out.println("Seu numero eh par menorzin");
                } else {
                    System.out.println("Teu numero eh impar");
                }
                break;
            case 2:
                System.out.println("Digite abaixo os dois numeros que serao usados no calculo");
                double numdiv1 = in.nextDouble();
                double numdiv2 = in.nextDouble();
                System.out.println("Digite agora o que voce quer calcular? (+ - * ou /)");
                char operador = in.next().charAt(0);
                if (operador == '+') {
                    System.out.printf("%f + %f eh igual a %f", numdiv1, numdiv2, numdiv1 + numdiv2);
                } else if (operador == '-') {
                    System.out.printf("%f - %f eh igual a %f", numdiv1, numdiv2, numdiv1 - numdiv2);
                } else if (operador == '*') {
                    System.out.printf("%f * %f eh igual a %f", numdiv1, numdiv2, numdiv1 * numdiv2);
                } else if (operador == '/') {
                    System.out.printf("%f / %f eh igual a %f", numdiv1, numdiv2, numdiv1 / numdiv2);
                } else {
                    System.out.printf("Voceh digitou um operador invalido amigo");
                }
                break;
            case 3:
                System.out.println("Digite abaixo 3 numeros distintos");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                int num3 = in.nextInt();
                if (num1 > num2 && num1 > num3) {
                    System.out.printf("O numero %d eh maior que os outros\n", num1);
                } else if (num2 > num3 && num2 > num1) {
                    System.out.printf("O numero %d eh maior que os outros\n", num2);
                } else {
                    System.out.printf("O numero %d eh o maior\n", num3);
                }
                break;    
            case 4:
                System.out.println("Diga-me a sua idade: ");
                num1 = in.nextInt();
                if (num1 > 18){
                    System.out.printf("Voceh tem %d anos, ou seja, ed maior de idade\n", num1);
                } else {
                    System.out.println("Tu eh kid ainda");
                }
                break;
            case 5:
                System.out.println("Bem vindo a tabuada! Digite o numero que voceh quer saber a tabuada: ");
                num1 = in.nextInt();
                int multiplicador = 1;
                while (multiplicador <= 10){
                    System.out.printf("%d*%d = %d\n", num1, multiplicador, num1*multiplicador);
                    multiplicador++;
                }
                break;
            case 6:
                System.out.println("CONTAGEM REGRESSIVA INICIADA!");
                int contagem = 10;
                while (contagem >= 0) {
                    System.out.println(contagem);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    contagem--;
                }
                System.out.println("FOGO!");
                break;
            case 7:
                System.out.println("Digite abaixo 10 numeros");
                int soma = 0;
                int contador = 0;
                while (contador <10) {
                    num1 = in.nextInt();
                    if (num1%2 == 0){
                        soma = soma + num1;
                    } else {
                    }
                    System.out.println("Proximo");
                    contador++;
                } System.out.printf("A soma total dos numeros pares foi %d\n", soma);
                break;
            case 8:
                System.out.println("Digite quantas provas voce realizou: ");
                int provas = in.nextInt();
                double media = 0;
                contador = 0;
                while (contador < provas){
                    System.out.println("Digite a nota que tirou nas provas respectivamente: ");
                    num1 = in.nextInt();
                    media = num1 + media;
                    contador++;
                } 
                media = media / provas;
                System.out.println("Sua media total foi: " + media);
                break;
            case 9:
                String senha = "GatoNet123";
                contador = 0;
                System.out.println("Tente descobrir a senha secreta: ");
                in.nextLine();
                
                while (contador < 3) {
                    String tentativa = in.nextLine();
                    if (tentativa.equals(senha)) {
                        System.out.println("Voceh acertou em cheio! Parabens");
                        break;
                    } else {
                        System.out.println("Senha incorreta. Tentativa (" + (contador + 1) + "/3).");
                        contador++;
                    }
                } 
                if (contador == 3) {
                System.out.println("Acesso Bloqueado!");
                }
                break;
            case 10:
                System.out.println("Ola usuario, quanto voce quer sacar?");
                double dinheiro = in.nextDouble();
                int notas = (int) dinheiro / 100;
                System.out.printf("%d de R$100,00\n", notas);
                dinheiro = dinheiro - (notas * 100);
                notas = (int) dinheiro / 50;
                System.out.printf("%d de R$50,00\n", notas);
                dinheiro = dinheiro - (notas * 50);
                notas = (int) dinheiro / 20;
                System.out.printf("%d de R$20,00\n", notas);
                dinheiro = dinheiro - (notas * 20);
                notas = (int) dinheiro / 10;
                System.out.printf("%d de R$10,00\n", notas);
                dinheiro = dinheiro - (notas * 10);
                notas = (int) dinheiro / 5;
                System.out.printf("%d de R$5,00\n", notas);
                dinheiro = dinheiro - (notas * 5);
                notas = (int) dinheiro / 2;
                System.out.printf("%d de R$2,00\n", notas);
                dinheiro = dinheiro - (notas * 2);
                System.out.println("No fim sobrou R$" +dinheiro+" sem sacar.");
                
                
                
                
                break;
            default:
                break;
        }
