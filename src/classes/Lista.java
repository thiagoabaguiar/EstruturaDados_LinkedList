package classes;

public class Lista<T> {

    private Celula<T> entradaLista;

    public Lista() {
        this.entradaLista = null;
    }

    public void add(T elemento) {

        Celula<T> novaCelula = new Celula(elemento);

        if (this.isEmpty()) {
            this.entradaLista = novaCelula;
            return;
        }

        Celula<T> celulaAtual = this.entradaLista;
        while (true) {
            if (celulaAtual.getProximaCelula() == null) {
                celulaAtual.setProximaCelula(novaCelula);
                break;
            } else {
                celulaAtual = celulaAtual.getProximaCelula();
            }
        }

    }

    public void removeLast() {

        Celula<T> celulaAtual = entradaLista;
        Celula<T> celulaAnteriorAAtual = entradaLista;

        if (this.entradaLista == null) {
            return;
        }

        if (entradaLista.getProximaCelula() == null) {
            this.entradaLista = null;
            return;
        }

        while (true) {

            if (celulaAtual.getProximaCelula() != null) {
                celulaAnteriorAAtual = celulaAtual;
                celulaAtual = celulaAtual.getProximaCelula();
            } else {
                celulaAnteriorAAtual.setProximaCelula(null);
                break;
            }
        }

    }

    public int size() {
        int tamanho = 0;

        if (this.entradaLista == null) {
            return tamanho = 0;
        }

        Celula<T> celulaAtual = this.entradaLista;
        while (true) {

            if (celulaAtual.getProximaCelula() == null) {
                tamanho++;
                break;
            } else {
                celulaAtual = celulaAtual.getProximaCelula();
                tamanho++;
            }

        }

        return tamanho;
    }

    public boolean isEmpty() {
        return entradaLista == null ? true : false;
    }

    @Override
    public String toString() {
        String retorno = "*** LISTA ***\n";

        if (this.isEmpty()) {
            return retorno += "null";
        }

        Celula<T> celulaAtual = entradaLista;
        while (true) {
            retorno += celulaAtual.getElementoInterno() + "\n";
            if (celulaAtual.getProximaCelula() == null) {
                break;
            } else {
                celulaAtual = celulaAtual.getProximaCelula();
            }
        }

        return retorno;
    }

}