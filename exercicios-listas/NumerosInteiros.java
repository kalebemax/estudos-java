import java.util.ArrayList;
import java.util.Collections;

public class NumerosInteiros {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(20);
        lista.add(1500);
        lista.add(1);
        lista.add(77);
        lista.add(94);

        Collections.sort(lista);
        System.out.println("Lista ordenada: " + lista);
    }
}
