package banco;

import java.util.ArrayList;
import java.util.List;
import models.Cliente;
import models.Lanche;

public class BancoDadosLanchonete {
    
    private static List<Cliente> tabelaCliente;
    private static List<Lanche> tabelaLanche;

    public static List<Cliente> getTabelaCliente() {
        return tabelaCliente;
    }
    public static List<Lanche> getTabelaLanche() {
        return tabelaLanche;
    }
    
    public static void inicializarBancoCliente(){
        tabelaCliente = new ArrayList<Cliente>();
    }
    public static void inicializarBancoLanche(){
        tabelaLanche = new ArrayList<Lanche>();
    }
    
}
