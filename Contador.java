package atividadePOO;

public class Contador {

    private int contador;

    public Contador(int contador) {
        this.contador = contador;
    }


    // mostra o valor do contador
    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    // zera o contador
    public void zerar(){
        contador = 0;
        System.out.println(getContador());
    }

    // incrementa o contador
    public void incrementar(int contador){
        System.out.println(contador = contador + 1);
    }

}
