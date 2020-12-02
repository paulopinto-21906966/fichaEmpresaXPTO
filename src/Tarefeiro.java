import java.util.ArrayList;

public class Tarefeiro extends Funcionario {

    int numTarefasCompletas;
    ArrayList<Tarefa> tarefas;
    ArrayList<Tarefa> tarefasCompletas;

    public Tarefeiro(String nome, int salario) {
        super(nome, salario);
    }

    public int calculaSalario() {
        int bonus = (numTarefasCompletas > 100 && horasTrabalhadas < 75) ? (int) (0.25 * (numTarefasCompletas - 50)) : 0;
        return this.salario = 505 + 2 * horasTrabalhadas + bonus; // salario devia ter sido double :(
    }

    public void executaTarefa() {
        this.numTarefasCompletas++;
        Tarefa tarefa = this.tarefas.get(0);
        this.tarefasCompletas.add(tarefa);
        this.tarefas.remove(tarefa);
    }

    public int getNumTarefasCompletas() {
        return this.numTarefasCompletas;
    }

    public int getHorasTrabalhadas(){
        return horasTrabalhadas;
    }

    public int setHorasTrabalhadas(){

        int horas = 0;
        for(Tarefa t : tarefas){
            horas += t.horasGastas();
        }

        return horas;
    }


    public Tarefa[] getTarefasCompletas() {
        return (Tarefa[]) this.tarefasCompletas.toArray();
    }

    public void displayTarefas(){
        for(Tarefa tarefa : tarefas){
            System.out.println(tarefa);
        }
    }

}
