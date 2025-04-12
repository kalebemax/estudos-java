public class Cachorro extends Animal {
    private String som;
    private String manias;

    public void emitirSom() {
        System.out.println("au au");
    }

    public void abanarRabo() {
        System.out.println("Abanando rabo!");
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
