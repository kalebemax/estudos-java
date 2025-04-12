public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println(titulo);
        System.out.println(artista);
        System.out.println(anoLancamento);
    }

    double avalia(double nota) {
        somaDasAvaliacoes += nota;
      return totalDeAvaliacoes++;
    }

    double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
