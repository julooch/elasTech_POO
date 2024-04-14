package atividadePOO;

public class Main {

    public static void main(String[] args) {
        Contador contador1 = new Contador(13);

        contador1.incrementar(contador1.getContador());
        System.out.println(contador1.getContador());
        contador1.zerar();

    }
}
