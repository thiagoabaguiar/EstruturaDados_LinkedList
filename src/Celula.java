
/**
 * @author Thiago Aguiar
 */
public class Celula {

    private Object elementoInterno;
    private Celula proxCelula;

    public Celula(Object elementoInterno, Celula proxCelula) {
        this.elementoInterno = elementoInterno;
        this.proxCelula = proxCelula;
    }

    public Object getElementoInterno() {
        return elementoInterno;
    }

    public void setElementoInterno(Object elementoInterno) {
        this.elementoInterno = elementoInterno;
    }

    public Celula getProxCelula() {
        return proxCelula;
    }

    public void setProxCelula(Celula proxCelula) {
        this.proxCelula = proxCelula;
    }

    @Override
    public String toString() {
        return "Celula{" + "elementoInterno=" + elementoInterno + ", proxCelula=" + proxCelula + '}';
    }  
    
}
