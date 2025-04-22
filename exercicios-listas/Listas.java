import java.util.ArrayList;

public class Listas {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Breaking the habit");
        lista.add("Numb");
        lista.add("Faint");
        lista.add("Somewhere i belong");
        lista.add("Lost");
        for (String item: lista){
            System.out.println(item);
        }
     }
}
