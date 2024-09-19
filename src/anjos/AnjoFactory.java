package anjos;

// Factory Method para criar anjos
abstract class AnjoFactory {
    abstract Anjo createAngel(String type);
}

class ConcreteAngelFactory extends AnjoFactory {
    @Override
    Anjo createAngel(String type) {
        switch (type) {
            case "Primeira": return new BaixaEsfera();
         
            default: throw new IllegalArgumentException("Anjo desconhecido");
        }
    }
}