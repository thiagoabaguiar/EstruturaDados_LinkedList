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

    public void adicionaComeco(Celula novaPrimeiraCelula) {
        novaPrimeiraCelula.proximaCelula = this;
    }

    public void adicionaFinal(Celula novaUltimaCelula) {
        this.proximaCelula = novaUltimaCelula;
    }

    public void removeComeco() {
        this.proximaCelula = null;
    }

    public void removeFinal(Celula novaUltimaCelula) {
        novaUltimaCelula.proximaCelula = null;
    }

    public void adicionaEntreCelulas(Celula celulaAnterior, Celula celulaPosterior) {
        celulaAnterior.proximaCelula = this;
        this.proximaCelula = celulaPosterior;
    }

    public void removeEntreCelulas(Celula celulaInicio, Celula celulaFim) {
        celulaInicio.proximaCelula = celulaFim;
        this.proximaCelula = null;
    }

    public int tamanhoCadeiaParaFrente() {
        int tamanho = 1;

        if (this.proximaCelula == null) {
            return tamanho;
        } else {
            Celula celulaAtual = this.proximaCelula;
            while (celulaAtual != null) {
                tamanho++;
                celulaAtual = celulaAtual.proximaCelula;
            }
        }

        return tamanho;
    }

    @Override
    public String toString() {
        return "Celula :: { \n elementoInterno : " + elementoInterno + "\n proximaCelula : " + proximaCelula + "} \n";
    }

}
