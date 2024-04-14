package atividadePOO.segunda;

import java.util.*;

public class Continente {

    private String nomeContinente;
    private Set<Pais> paises;

    public Continente(String nomeContinente) {
        this.nomeContinente = nomeContinente;
        this.paises = new HashSet<>();
    }

    public String getNomeContinente() {
        return nomeContinente;
    }

    public void setNomeContinente(String nomeContinente) {
        this.nomeContinente = nomeContinente;
    }

    public Set<Pais> getPaises() {
        return paises;
    }

    public void setPaises(Set<Pais> paises) {
        this.paises = paises;
    }

    public void adicionarPais(Pais pais){
        paises.add(pais);
    }

    public int dimensaoTotal() {
        int dimensaoTotal = 0;
        for (Pais pais : paises) {
            dimensaoTotal += pais.getDimensaoTerritorial();
        }
        return dimensaoTotal;
    }

    public int populacaoTotal() {
        int populacaoTotal = 0;
        for (Pais pais : paises) {
            populacaoTotal += pais.getPopulacao();
        }
        return populacaoTotal;
    }

    public double densidadePopulacional() {
        return (double) populacaoTotal() / dimensaoTotal();
    }

    public String paisComMaiorPopulacao() {
        Pais paisMaiorPopulacao = null;
        int maxPopulacao = Integer.MIN_VALUE;
        for (Pais pais : paises) {
            if (pais.getPopulacao() > maxPopulacao) {
                maxPopulacao = pais.getPopulacao();
                paisMaiorPopulacao = pais;
            }
        }
        return paisMaiorPopulacao.getNomePais();
    }

    public String paisComMenorPopulacao() {
        Pais paisMenorPopulacao = null;
        long minPopulacao = Long.MAX_VALUE;
        for (Pais pais : paises) {
            if (pais.getPopulacao() < minPopulacao) {
                minPopulacao = pais.getPopulacao();
                paisMenorPopulacao = pais;
            }
        }
        return paisMenorPopulacao.getNomePais();
    }

    public Pais paisMaiorDimensao() {
        Pais paisMaiorDimensao = null;
        int maxDimensao = Integer.MIN_VALUE;
        for (Pais pais : paises) {
            if (pais.getDimensaoTerritorial() > maxDimensao) {
                maxDimensao = pais.getDimensaoTerritorial();
                paisMaiorDimensao = pais;
            }
        }
        return paisMaiorDimensao;
    }

    public Pais paisMenorDimensao() {
        Pais paisMenorDimensao = null;
        int minDimensao = Integer.MAX_VALUE;
        for (Pais pais : paises) {
            if (pais.getDimensaoTerritorial() < minDimensao) {
                minDimensao = pais.getDimensaoTerritorial();
                paisMenorDimensao = pais;
            }
        }
        return paisMenorDimensao;
    }

    public double razaoTerritorial() {
        int paisMaiorDimensao = paisMaiorDimensao().getDimensaoTerritorial();
        int paisMenorDimensao = paisMenorDimensao().getDimensaoTerritorial();
        return (double) paisMaiorDimensao / paisMenorDimensao;
    }

    public List<String> getNomesDosPaises() {
        List<String> nomesDosPaises = new ArrayList<>();
        for (Pais pais : paises) {
            nomesDosPaises.add(pais.getNomePais());
        }
        return nomesDosPaises;
    }
}
