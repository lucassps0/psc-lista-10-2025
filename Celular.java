public class Celular {
    String marca;
    String modelo;
    String cor;
    int armazenamento;

    void ligar() {
        System.out.println("Ligando o celular " + modelo + " da marca " + marca);
    }

    void tirarFoto() {
        System.out.println("Foto tirada com o celular.");
    }

    void tocarMusica() {
        System.out.println("Tocando música no celular.");
    }

    void enviarMensagem() {
        System.out.println("Mensagem enviada pelo celular.");
    }
}
