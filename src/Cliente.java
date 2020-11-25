public class Cliente {
    String nome;
    int telefone;
    int nif;

    public Cliente(String nome, int telefone, int nif) {
        this.nome = nome;
        this.telefone = telefone;
        this.nif = nif;
    }

    public String getNome() {
        return this.nome;
    }

    public int getTelefone() {
        return this.telefone;
    }

    public int getNif() {
        return this.nif;
    }

    @Override
    public String toString() {
        return "Cliente " + this.nome + "\nContacto Telefónico: " + this.telefone;
    }
}
