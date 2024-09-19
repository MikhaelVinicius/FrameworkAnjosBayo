package anjos;


//Interface do anjo para o FactoryMethod


public interface Anjo {

    String getNome();
    int getNivelDeForca();
    void setComportamentoDeCombate(ComportamentoCombate comportamento);
    void ataque();
    
}