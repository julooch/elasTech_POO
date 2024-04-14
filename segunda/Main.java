package atividadePOO.segunda;

public class Main {

    public static void main(String[] args) {

        Continente africano = new Continente("África");
        Pais uganda = new Pais("Uganda", 5000000, 2334000);
        Pais egito = new Pais("Egito", 50564000, 100);

        africano.adicionarPais(uganda);
        africano.adicionarPais(egito);
        System.out.println("A dimensão total do continente é igual a: " + africano.dimensaoTotal());
        System.out.println("A população total do continente é igual a: " + africano.populacaoTotal());
        System.out.println("A densidade populacional do continente é: " + africano.densidadePopulacional());
        System.out.println("A maior população é do(a): " + africano.paisComMaiorPopulacao());
        System.out.println("A menor população é do(a): " + africano.paisComMenorPopulacao());

        System.out.println("O país com maior dimensão territorial é: " + africano.paisMaiorDimensao().getNomePais());
        System.out.println("O país com menor dimensão territorial é: " + africano.paisMenorDimensao().getNomePais());
        System.out.println("A razão territorial entre todos os países da(o) " + africano.getNomeContinente() + " é: " + africano.razaoTerritorial());

        System.out.println("Os países adicionados na " + africano.getNomeContinente() + " : " + africano.getNomesDosPaises());
    }
}
