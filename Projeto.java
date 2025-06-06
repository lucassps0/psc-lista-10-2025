public class Projeto {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Joana";
        pessoa.idade = 30;
        pessoa.setCpf("111.222.333-44");
        pessoa.setEmail("joana@email.com");

        System.out.println("Pessoa: " + pessoa.nome + ", CPF: " + pessoa.getCpf() + ", Email: " + pessoa.getEmail());
        pessoa.falar();

        Carro carro = new Carro();
        carro.modelo = "Civic";
        carro.cor = "Preto";
        carro.placa = "XYZ-1234";
        carro.ano = 2020;
        carro.ligarMotor();
        carro.acelerar();

        Celular celular = new Celular();
        celular.marca = "Apple";
        celular.modelo = "iPhone 13";
        celular.cor = "Branco";
        celular.armazenamento = 256;
        celular.tocarMusica();
        celular.enviarMensagem();

        Animal animal = new Animal();
        animal.nome = "Rex";
        animal.especie = "Cachorro";
        animal.idade = 5;
        animal.cor = "Marrom";
        animal.emitirSom();
        animal.correr();

        Relogio relogio = new Relogio();
        relogio.setMarca("Casio");
        relogio.tipo = "Digital";
        relogio.cor = "Preto";
        relogio.material = "Plástico";
        System.out.println("Marca do relógio: " + relogio.getMarca());
        relogio.marcarHora();

        Geladeira geladeira = new Geladeira();
        geladeira.setMarca("Brastemp");
        geladeira.setCapacidade(500);
        geladeira.cor = "Branca";
        geladeira.numeroPortas = 2;
        System.out.println("Geladeira: " + geladeira.getMarca() + ", " + geladeira.getCapacidade() + "L");
        geladeira.refrigerar();



    }
}
