import java.util.ArrayList;

public class Tarefeiro extends Funcionario {

    int numTarefasCompletas;
    ArrayList<Tarefa> tarefas;
    ArrayList<Tarefa> tarefasCompletas;

    public Tarefeiro(String nome, int salario) {
        super(nome, salario);
    }

    public int calculaSalarioTarefeiro() {
        int bonus = (this.numTarefasCompletas > 100 && this.horasTrabalhadas < 75) ? (int) (0.25 * (numTarefasCompletas - 50)) : 0;
        return this.salario =  505 + 2 * this.horasTrabalhadas + bonus; // salario devia ter sido double :(
    }

    public void executaTarefa() {
        this.numTarefasCompletas++;
        Tarefa tarefa = this.tarefas.get(0);
        this.tarefasCompletas.add(tarefa);
        this.tarefas.remove(tarefa);
    }

    public int getNumTarefasCompletas(){
        return this.numTarefasCompletas;
    }

    public Tarefa[] getTarefasCompletas(){
        return (Tarefa[]) this.tarefasCompletas.toArray();
    }

}
