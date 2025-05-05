import java.util.List;

public class Banco {

    public String nome;

    private List<Cliente> listaClientes;
    private List<Conta> listaContas;

    public String getNome() {
        return nome;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public List<Conta> getListaContas() {
        return listaContas;
    }
}
