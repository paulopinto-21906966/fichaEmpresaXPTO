import java.lang.reflect.Array;
import java.util.ArrayList;

public class Cliente {
    String nome;
    int telefone;
    int nif;
    ArrayList<Tarefa> tarefas;

    public Cliente(String nome, int telefone, int nif) {
        this.nome = nome;
        this.telefone = telefone;
        this.nif = nif;
        this.tarefas = new ArrayList<>();
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

    public ArrayList<Tarefa> getTarefas(){
        return tarefas;
    }

    @Override
    public String toString() {
        return "Cliente " + this.nome + "\nContacto Telefónico: " + this.telefone;
    }
}
