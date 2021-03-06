import java.util.ArrayList;
import java.util.HashMap;

public class Empresa {

    String nome;
    ArrayList<Cliente> clientes;
    ArrayList<Funcionario> funcionarios;
    ArrayList<Tarefa> tarefas;
    HashMap<Integer, Cliente> hashTarefasClientes;
    int limiteTarefas;

    Empresa(String nome){
        this.nome = nome;
        this.clientes = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
        this.tarefas = new ArrayList<>();
        this.limiteTarefas = 30; //default
    }

    public void contratar(Funcionario funcionario) {
        funcionarios.add(funcionario);

    }

    public boolean despedir(Funcionario funcionario) {
        return funcionarios.remove(funcionario);
    }

    public boolean adicionarTarefa(Tarefa tarefa) {
        if(tarefas.size() == limiteTarefas){
            System.out.println("O limite de " + limiteTarefas + " tarefas já foi atingido, impossível adicionar a tarefa " + tarefa);
            return false;
        }
        tarefas.add(tarefa);
        return true;
    }

    public boolean removeTarefa(Tarefa tarefa) {
        return tarefas.remove(tarefa);
    }

    public boolean mudarLimiteTarefas(int limite) {

        if (limite == 0) {
            System.out.println("Limite não pode ser 0");
            return false;
        }
        if (limite == this.limiteTarefas) {
            System.out.println("O limite já é " + limite);
            return false;
        }
        this.limiteTarefas = limite;
        return true;
    }

    public String getNome() {
        return this.nome;
    }

}
