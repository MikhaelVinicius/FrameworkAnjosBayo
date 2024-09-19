package anjos;

public class Main {
    
    public static void main(String[] args) {
        AnjoFactory anjosFabrica = new ConcreteAngelFactory();

        Observer um = new AngelWatcher();
        Observer dois = new AngelWatcher();

        Anjo glorius = anjosFabrica.createAngel("Primeira");

        glorius.setComportamentoDeCombate(new Defensivo());

        System.err.println("Ataque de glorius: ");
        glorius.ataque();



        



    }

}
