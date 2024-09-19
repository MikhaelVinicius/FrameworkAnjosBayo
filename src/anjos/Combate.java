package anjos;


class Defensivo implements ComportamentoCombate{

    @Override
    public void atacar(){
        System.err.println("Ataque baixo");
    }

    public void defender(){

        System.err.println("Defesa forte");
    }
}