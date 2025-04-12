public class Main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();

        minhaMusica.titulo = "Numb";
        minhaMusica.artista = "Linkin Park";
        minhaMusica.anoLancamento = 2003;

        minhaMusica.exibeFichaTecnica();
        minhaMusica.avalia(8.6);
        minhaMusica.avalia(9.7);
        minhaMusica.avalia(7.7);
        System.out.println(minhaMusica.somaDasAvaliacoes);
        System.out.println(minhaMusica.pegaMedia());
    }
}