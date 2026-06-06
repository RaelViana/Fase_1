import java.util.Scanner;

public class Calculadora {

    // Exercicio utilizando os fluxos condicionais If Else, Switch
    public static void main(String[] args) {
        
        System.out.println("----------------------------------------------------------");
        System.out.println("------------- Escolha uma operação -----------------------");
        System.out.println("----------------------------------------------------------");
        System.out.println(" [1] - Soma ");
        System.out.println(" [2] - Subtração");
        System.out.println(" [3] - Divisão ");
        System.out.println(" [4] - Multiplicação ");
        System.out.println("----------------------------------------------------------");

        Scanner s = new Scanner(System.in);
        System.out.print("Digite a opção: ");
        int opcao = s.nextInt();
        System.out.println();
            while (opcao < 1 || opcao > 4) {
                System.out.println("Opção inválida, tente novamente.");
                System.out.print("Digite novamente a opção ");
                opcao = s.nextInt();
                System.out.println();
            }
            switch (opcao) {
                case 1 -> System.out.println("Operação escolhida Soma");
                case 2 -> System.out.println("Operação escolhida Subtração");
                case 3 -> System.out.println("Operação escolhida Divisão");
                case 4 -> System.out.println("Operação escolhida Multiplicação");
                default-> System.out.println("Opção inválida, tente novamente.");
            }         
        
        
        System.out.println();
        System.out.println("------------- Escolha Dois Valores -----------------------");
        System.out.println("----------------------------------------------------------");



        Scanner scanner = new Scanner(System.in);
        System.out.print("1° Valor: ");
        int valor1 = scanner.nextInt();
        System.out.print("2° Valor: ");
        int valor2 = scanner.nextInt();

        int soma = valor1 + valor2;
        int subtracao = valor1 - valor2;
        int divisao = valor1 / valor2;
        int multiplicacao = valor1 * valor2;

        if (opcao == 1) {
            System.out.println("A Soma entre " + valor1 + " + " + valor2 + " = " + soma);
            System.out.println(soma);
        } 
        else if(opcao == 2) {
            System.out.println("A Subtração entre " + valor1 + " - " + valor2 + " = " + subtracao); 
        }
        else if(opcao == 3) {
            System.out.println("A Divisão entre " + valor1 + " / " + valor2 + " = " + divisao); 
        }
        else{
            System.out.println("A Multiplicação entre " + valor1 + " x " + valor2 + " = " + multiplicacao);
        }


    }
}