public class ClienteEmpresarial extends Cliente {

    String nomeResposavel;
    int telefoneResponsavel;

    public ClienteEmpresarial(String nome, int telefone, int nif, String nomeR, int telR) {
        super(nome, telefone, nif);
        this.nomeResposavel = nomeR;
        this.telefoneResponsavel = telR;
    }

    public String getNomeR(){
        return this.nomeResposavel;
    }

    public int getTelefoneR(){
        return this.telefoneResponsavel;
    }
}
