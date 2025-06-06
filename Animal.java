public class Animal {
    String especie;
    int idade;
    String cor;
    String nome;

    void comer() {
        System.out.println(nome + " está comendo.");
    }

    void dormir() {
        System.out.println(nome + " está dormindo.");
    }

    void correr() {
        System.out.println(nome + " está correndo.");
    }

    void emitirSom() {
        System.out.println(nome + " está emitindo um som.");
    }
}
