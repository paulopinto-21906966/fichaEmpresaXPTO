public class Tecnico extends Funcionario {

    public Tecnico(String nome, int salario) {
        super(nome, salario);
    }

    public int calculaSalario() {
        return salario;
    }

}
