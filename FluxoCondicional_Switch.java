

public class FluxoCondicional_Switch {

    public static void main(String[] args) {


        //Exemplo de utilização comparando a variável a possiveis valores
        int dia = 3;

        switch (dia) {

            case 1:
                System.out.println("Domingo");
                break;

            case 2:
                System.out.println("Segunda");
                break;

            case 3:
                System.out.println("Terça");
                break;

            default:
                System.out.println("Dia inválido");
        }


        // Sem o break, o Java continua executando os próximos casos
        int numero = 1;

        switch (numero) {
        
            case 1:
                System.out.println("Um");
        
            case 2:
                System.out.println("Dois");
        }

        //Essa é uma forma mais atualizada de utilização, bem mais legivel
        int opcao = 2;

        switch (opcao) {

            case 1 -> System.out.println("Cadastrar");

            case 2 -> System.out.println("Listar");

            case 3 -> System.out.println("Sair");

            default -> System.out.println("Opção inválida");
        }



    }   
    
}