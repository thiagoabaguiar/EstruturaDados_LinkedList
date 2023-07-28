package classes;

/**
 * @author Thiago Aguiar
 */
public class Principal {

    public static void main(String[] args) {

        String frase0 = "Estou no objeto 0";
        String frase1 = "Estou no objeto 1";
        String frase2 = "Estou no objeto 2";
        String frase3 = "Estou no objeto 3";
        String frase4 = "Estou no objeto 4";
        
        Celula c0 = new Celula(frase0);
        Celula c1 = new Celula(frase1);
        Celula c2 = new Celula(frase2);
        Celula c3 = new Celula(frase3);
        Celula c4 = new Celula(frase4);

        /* Cenário testando ADIÇÃO de célula no começo da cadeia,
        e ADIÇÃO de célula no final da cadeia.
        */
        //c1.adicionaFinal(c2);
        //c1.adicionaComeco(c0);        
        //System.out.println(c0);
        
        /* Cenário testando REMOÇÃO de célula do começo da cadeia,
        e REMOÇÃO de célula do final da cadeia.
        */
        //c0.adicionaFinal(c1);
        //c1.adicionaFinal(c2);
        //c2.adicionaFinal(c3);
        //System.out.println(c0);
        //c0.removeComeco();
        //System.out.println(c0);
        //System.out.println(c1);
        //c3.removeFinal(c2);
        //System.out.println(c0);
        
        /* Cenário testando ADIÇÃO de célula no meio da cadeia,
        ou seja, entre duas células que já estão linkadas uma a outra
        */
        //c0.adicionaFinal(c2);
        //System.out.println(c0);
        //c1.adicionaEntreCelulas(c0, c2);
        //System.out.println(c0);
        
        /* Cenário testando REMOÇÃO de célula no meio da cadeia,
        ou seja, entre duas células que já estão linkadas uma a outra
        */
        //c0.adicionaFinal(c1);
        //c1.adicionaFinal(c2);
        //c2.adicionaFinal(c3);
        //System.out.println(c0);
        //c1.removeEntreCelulas(c0, c2);
        //System.out.println(c0);
        
        /* Cenário para contagem de células à frente (inclusive a atual)
        à partir de um ponto da cadeia
        */
        //c0.adicionaFinal(c1);
        //c1.adicionaFinal(c2);
        //c2.adicionaFinal(c3);
        //c3.adicionaFinal(c4);
        //System.out.println(c0);       
        //System.out.println("Total de Células: " + c0.tamanhoCadeiaParaFrente());
        
    }

}
