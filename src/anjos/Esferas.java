package anjos;

class BaixaEsfera implements Anjo{

    private String nome;
    private int forca;
    private ComportamentoCombate combate;


    

    @Override
    public String getNome(){
        return this.nome;
    }

    @Override
    public int getNivelDeForca(){
        return this.forca;
    }

    @Override
    public void setComportamentoDeCombate(ComportamentoCombate combate){
        this.combate = combate;
    };

    @Override
    public void ataque(){
        System.err.println("Ataque fraco");
    };




}
