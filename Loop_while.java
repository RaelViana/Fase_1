import java.util.Scanner;

public class Loop_while {
    
    public static void main(String[] args) {
        
        //O while é usado quando você NÃO sabe exatamente quantas repetições existirão.
        //Ele continua enquanto a condição for verdadeira.

        
        // //Exemplo basico
        // int contador = 1;
        // while (contador <= 5) {

        //     System.out.println(contador);

        //     contador++;
        // }

        
        // // Exemplo decremento de 2 em 2
        // int i = 10;
        
        // while (i >= 0) {
        //     System.out.println(i + " ");
        //     i -= 2;
        // }

        // // Exemplo validação de entrada
        // Scanner scanner = new Scanner(System.in);
        // int idade = -1;
        
        // while (idade < 0 || idade > 95) {
        //     System.out.print("Digite uma idade válida (0-95): ");
        //     idade = scanner.nextInt();
            
        //     if (idade < 0 || idade > 95) {
        //         System.out.println("Idade inválida! Tente novamente.");
        //     }
        // }
        
        // System.out.println("Idade registrada: " + idade);
        // scanner.close();


        // O Do while executa o bloco pelo menos uma vez antes de verificar a condição.

        // // Exemplo basico
        // int contador = 0;
        
        // do {
        //     System.out.println("Contador: " + contador);
        //     contador++;
        // } while (contador <= 5);


        // Exemplo  menu interativo
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Buscar");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Opção CADASTRAR selecionada");
                    break;
                case 2:
                    System.out.println("Opção LISTAR selecionada");
                    break;
                case 3:
                    System.out.println("Opção BUSCAR selecionada");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
        
        scanner.close();

    }
    
}
