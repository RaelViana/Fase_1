

public class FluxoCondicional_If_Else {

    public static void main(String[] args) {

        //Exemplo utilização if
        // O if executa um bloco de código apenas se a condição for verdadeira.
        int idade = 20;

        if (idade >= 18) {
            System.out.println("Você é maior de idade");
        }

        // O else executa outro bloco quando a condição for falsa.
        int ano = 2005;

        if (ano >= 2007) {
            System.out.println("Sim, o ano é maior");
        } else {
            System.out.println("Não, o ano é menor");
        }


        // Exemplo utilizando operador logico
        int suaIdade = 25;
        boolean possuiCnh = true;

        if (suaIdade >= 18 && possuiCnh) {
            System.out.println("Pode dirigir");
        } else {
            System.out.println("Não pode dirigir");
        }

    }

    
    

}