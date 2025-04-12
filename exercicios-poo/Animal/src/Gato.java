public class Gato extends Animal {
    private String som;
    private String manias;

    public void emitirSom() {
        System.out.println("miau miau");
    }

    public void arranharMoveis() {
        System.out.println("Arranhando movéis!");
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public String getManias() {
        return manias;
    }

    public void setManias(String manias) {
        this.manias = manias;
    }
}
