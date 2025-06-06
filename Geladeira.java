public class Geladeira {
    private String marca;
    private int capacidade; // em litros
    String cor;
    int numeroPortas;

    void refrigerar() {
        System.out.println("Geladeira está refrigerando.");
    }

    void congelar() {
        System.out.println("Geladeira está congelando.");
    }

    void iluminar() {
        System.out.println("Iluminando interior da geladeira.");
    }

    void armazenarAlimentos() {
        System.out.println("Armazenando alimentos.");
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}
