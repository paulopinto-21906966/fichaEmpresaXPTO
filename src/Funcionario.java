public class Funcionario {

    String nome;
    int salario;
    int horasTrabalhadas;
    String tipoFunc = "Funcionario";

    public Funcionario(String nome, int salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public int getSalario() {
        return this.salario;
    }

    public int getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }

    @Override
    public String toString() {
        return "Funcionario " + this.nome +
                "\nTipo Funcionário: " + this.tipoFunc +
                "\nSalário: " + this.salario;
    }
}

