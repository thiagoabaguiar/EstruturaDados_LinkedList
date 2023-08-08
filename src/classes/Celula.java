package classes;

public class Celula<T> {

    private T elementoInterno;
    private Celula proximaCelula;

    public Celula(T elementoInterno) {
        this.elementoInterno = elementoInterno;
    }

    public T getElementoInterno() {
        return elementoInterno;
    }

    public void setElementoInterno(T elementoInterno) {
        this.elementoInterno = elementoInterno;
    }

    public Celula getProximaCelula() {
        return proximaCelula;
    }

    public void setProximaCelula(Celula proximaCelula) {
        this.proximaCelula = proximaCelula;
    }
    
    
    
    /////////////////////////////////////////////////////////
    
    

    /**
     * Método para adicionar uma nova célula no começo da cadeia
     * @param novaPrimeiraCelula 
     * Nova célula que será considerada a primeira da cadeia
     */
    public void adicionaComeco(Celula novaPrimeiraCelula) {
        novaPrimeiraCelula.proximaCelula = this;
    }

    /**
     * Método para adicionar uma nova célula ao final da cadeia
     * @param novaUltimaCelula 
     * Nova célula que será considerada a última da cadeia
     */
    public void adicionaFinal(Celula novaUltimaCelula) {
        this.proximaCelula = novaUltimaCelula;
    }

    /**
     * Método para remover a primeira célula da cadeia
     */
    public void removeComeco() {
        this.proximaCelula = null;
    }

    /**
     * Método para remover a última célula da cadeia
     * @param novaUltimaCelula 
     * Célula que será considerada a última após a remoção da atual última célula
     */
    public void removeFinal(Celula novaUltimaCelula) {
        novaUltimaCelula.proximaCelula = null;
    }

    /**
     * Método para adicionar uma célula entre duas células existentes
     * @param celulaAnterior
     * Célula anterior
     * @param celulaPosterior 
     * Célula posterior
     */
    public void adicionaEntreCelulas(Celula celulaAnterior, Celula celulaPosterior) {
        celulaAnterior.proximaCelula = this;
        this.proximaCelula = celulaPosterior;
    }

    /**
     * Método para remover uma célula ou grupo de células da cadeia
     * @param celulaInicio
     * Célula inicial
     * @param celulaFim 
     * Célula final
     */
    public void removeEntreCelulas(Celula celulaInicio, Celula celulaFim) {
        celulaInicio.proximaCelula = celulaFim;
        this.proximaCelula = null;
    }

    /**
     * Método para contar quantas células existem na cadeia, começando da célula atual
     * @return
     * Retorna o número de células
     */
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

    /**
     * Método para localizar um elemento interno dentro da cadeia toda de células
     * @param elementoALocalizar
     * Object a ser localizado
     * @return 
     * Posição relativa do objecto localizado, considerando a célula atual como início da cadeia
     */
    public int localizaPosicaoElemento(T elementoALocalizar) {
        int posicao = 0;
        Celula celulaAtual = this;

        while (!celulaAtual.elementoInterno.equals(elementoALocalizar)) {

            if (celulaAtual.proximaCelula != null) {
                celulaAtual = celulaAtual.proximaCelula;
                posicao++;
            } else {
                posicao = -1;
                break;
            }

        }

        return posicao;
    }

    /**
     * Método para localizar um elemento interno à partir de uma posição relativa dentro da cadeia
     * @param posicaoALocalizar
     * Posição relativa, considerando a célula atual como ponto de partida
     * @return 
     * Objeto localizado à partir da posição informada
     */
    public Object localizaElementoPorPosicao(int posicaoALocalizar) {
        Celula celulaAtual = this;
        Object elementoInternoLocalizado = this.elementoInterno;

        int i = 0;
        while (i < posicaoALocalizar) {

            if (celulaAtual.proximaCelula != null) {
                celulaAtual = celulaAtual.proximaCelula;
                elementoInternoLocalizado = celulaAtual.elementoInterno;
                i++;
            } else {
                elementoInternoLocalizado = null;
                break;
            }
        }

        return elementoInternoLocalizado;
    }

    @Override
    public String toString() {
        return "Celula :: { \n elementoInterno : " + elementoInterno + "\n proximaCelula : " + proximaCelula + "} \n";
    }

}
