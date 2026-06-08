public class Loop_for {
    
    public static void main(String[] args) {

        //O for é usado quando você já sabe quantas vezes deseja repetir algo.

        // ESTRUTURA - for (inicialização; condição; incremento)


        //exemplo básico
        for (int i = 1; i <= 5; i++) {
            System.out.println("Número: " + i);
        }

        // //exemplo de tabuada - for aninhado
          for (int i = 1; i <= 10; i++) {
            System.out.println("\nTabuada do " + i + ":");

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " X " + j + " = " + (i * j));
                
            }
        }


        //Incrementado de dois em dois
        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
            
        }


        // Decremento (contagem regressiva)
        for (int i = 10; i >= 0; i--) {
            System.out.println(i + " ");
        }

        // Utilizando para percorrer listas
        String[] frutas = {"Maçã", "Banana", "Laranja", "Uva"};
        
        for (String fruta : frutas) {
            System.out.println(fruta);
        }


    }
        
    
}
