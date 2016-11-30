package aula2311_camadas;

import banco.BancoDadosLanchonete;
import views.ClienteView;

public class TrabalhoLanchonete {

    public static void main(String[] args) {
        BancoDadosLanchonete.inicializarBancoCliente();

        ClienteView clienteView = new ClienteView();
        
        while (true) {
            clienteView.exibirMenuCadastroCliente();
        }
    }
}
