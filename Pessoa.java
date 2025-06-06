public class Pessoa {
    String nome;
    int idade;
    private String cpf;
    private String email;

    void andar() {
        System.out.println(nome + " está andando.");
    }

    void comer() {
        System.out.println(nome + " está comendo.");
    }

    void dormir() {
        System.out.println(nome + " está dormindo.");
    }

    void falar() {
        System.out.println(nome + " está falando.");
    }

    // Getters e Setters para atributos privados
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

