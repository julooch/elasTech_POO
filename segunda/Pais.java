package atividadePOO.segunda;

import java.util.Scanner;
import java.util.Set;

public class Pais {
    private String nomePais;
    private int dimensaoTerritorial;
    private int populacao;

    public Pais(String nomePais, int dimensaoTerritorial, int populacao) {
        this.nomePais = nomePais;
        this.dimensaoTerritorial = dimensaoTerritorial;
        this.populacao = populacao;
    }

    public String getNomePais() {
        return nomePais;
    }

    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }

    public int getDimensaoTerritorial() {
        return dimensaoTerritorial;
    }

    public void setDimensaoTerritorial(int dimensaoTerritorial) {
        this.dimensaoTerritorial = dimensaoTerritorial;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }


}




