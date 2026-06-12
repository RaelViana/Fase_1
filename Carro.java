public class Carro extends Veiculo{

    public void ligar(){
        confereCambio(); // encapsulamento os metodos não precisam estar visiveis na classe principal
        confereCombustivel(); // encapsulamento os metodos não precisam estar visiveis na classe principal
        System.out.println("CARRO LIGADO");
    }

    private void confereCombustivel(){
        System.out.println("Conferindo combustivel"); 
    }

    private void confereCambio(){
        System.out.println("Conferindo cambio em P"); 
    }
    
}
