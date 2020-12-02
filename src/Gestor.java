import java.util.ArrayList;

public class Gestor extends Funcionario {

    ArrayList<Cliente> clientes;

    public Gestor(String nome, int salario) {
        super(nome, salario);
    }

    public int calculaSalario() {
        return this.salario = salario + (int) (0.5 * getTarefasGeridas()); // salario devia ter sido double :(
    }

    public int getTarefasGeridas() {
        int count = 0;
        for(Cliente cliente : clientes){
            count += cliente.getTarefas().size();
        }

        return count;
    }
}
