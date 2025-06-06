public class Relogio {
    private String marca;
    String tipo;
    String cor;
    String material;

    void marcarHora() {
        System.out.println("Relógio está marcando a hora.");
    }

    void despertar() {
        System.out.println("Alarme do relógio tocando.");
    }

    void cronometrar() {
        System.out.println("Cronômetro ativado.");
    }

    void iluminarVisor() {
        System.out.println("Iluminando visor do relógio.");
    }

    // Getter e Setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
