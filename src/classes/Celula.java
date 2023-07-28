package classes;

public class Celula {

    private Object elementoInterno;
    private Celula proximaCelula;

    public Celula(Object elementoInterno) {
        this.elementoInterno = elementoInterno;
    }

    public Object getElementoInterno() {
        return elementoInterno;
    }

    public void setElementoInterno(Object elementoInterno) {
        this.elementoInterno = elementoInterno;
    }

    public Celula getProximaCelula() {
        return proximaCelula;
    }

    public void setProximaCelula(Celula proximaCelula) {
        this.proximaCelula = proximaCelula;
    }
    
    public void adicionaFinal(Celula novaUltimaCelula){
        this.proximaCelula = novaUltimaCelula;
    }
    
    public void adicionaComeco(Celula novaPrimeiraCelula){
        novaPrimeiraCelula.proximaCelula = this;
    }

    @Override
    public String toString() {
        return "Celula :: { \n elementoInterno : " + elementoInterno + "\n proximaCelula : " + proximaCelula + "} \n";
    }

}
