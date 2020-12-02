public class Tarefa {

    static int idMax = 0;

    int id;
    String desc;
    int duracao;
    int mes;

    Tarefa(String desc, int duracao) {
        this.desc = desc;
        this.duracao = duracao;
        this.id = idMax;
        idMax++;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getId() {
        return this.desc;
    }

    int horasGastas() { //getDuracao
        return duracao;
    }

    @Override
    public String toString() {
        return "Tarefa nº" + id + " (" + idMax + "); desc : " + desc;
    }
}
