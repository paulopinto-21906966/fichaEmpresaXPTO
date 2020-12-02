public class Tarefa {

    static int idMax = 0;

    int id;
    String desc;

    Tarefa(String desc) {
        this.desc = desc;
        this.id = idMax;
        idMax++;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getId() {
        return this.desc;
    }

    @Override
    public String toString() {
        return "Tarefa nº" + id + " (" + idMax + "); desc : " + desc;
    }
}
