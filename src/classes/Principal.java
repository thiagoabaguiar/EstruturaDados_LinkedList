package classes;

/**
 * @author Thiago Aguiar
 */
public class Principal {

    public static void main(String[] args) {

        String fraseA = "Estou no objeto 0";
        String fraseB = "Estou no objeto 1";
        String fraseC = "Estou no objeto 2";
        
        Celula c0 = new Celula(fraseA);
        Celula c1 = new Celula(fraseB);
        Celula c2 = new Celula(fraseC);

        c1.adicionaFinal(c2);
        c1.adicionaComeco(c0);        
        System.out.println(c0);
        
        
    }

}
