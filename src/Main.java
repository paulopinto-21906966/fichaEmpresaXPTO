public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Alferes Malheiro enterprise");

        Funcionario f1 = new Gestor("Alferes Malheiro", 2100);
        Funcionario f2 = new Tarefeiro("Marta Simões", 700);
        Funcionario f3 = new Tecnico("Paulo Pinto", 1100);

        empresa.contratar(f1);
        empresa.contratar(f2);
        empresa.contratar(f3);


    }
}
