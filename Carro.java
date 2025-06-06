public class Carro {
    String modelo;
    String cor;
    String placa;
    int ano;

    void acelerar() {
        System.out.println("O carro modelo " + modelo + " está acelerando.");
    }

    void frear() {
        System.out.println("O carro está freando.");
    }

    void ligarMotor() {
        System.out.println("O motor foi ligado.");
    }

    void buzinar() {
        System.out.println("Buzinando: Biii!");
    }
}
