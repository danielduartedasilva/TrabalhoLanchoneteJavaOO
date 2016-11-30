package views;

import banco.BancoDadosLanchonete;
import controllers.ClientesController;
import java.util.Scanner;
import models.Cliente;

public class ClienteView {

    Scanner scan = new Scanner(System.in);

    public void exibirMenuCadastroCliente() {
        System.out.println("1 - Cadastrar Cliente");
        System.out.println("2 - Exibir Clientes");
        System.out.println("3 - Exibir Cliente por codigo");
        System.out.print("Informe a opção desejada: ");
        int opcao = scan.nextInt();
        scan.nextLine();

        switch (opcao) {
            case 1:
                cadastrarCliente();
                break;
            case 2:
                exibirClientes();
                break;
            case 3:
                exibirClientePorCodigo();
        }
    }

    private void cadastrarCliente() {
        System.out.print("Digite o codigo do cliente: ");
        int cod = scan.nextInt();
        scan.nextLine();

        System.out.print("Digite o nome do cliente: ");
        String nome = scan.nextLine();

        System.out.print("Digite o cpf do cliente: ");
        String cpf = scan.nextLine();

        ClientesController.adicionarCliente(cod, nome, cpf);
    }

    private void exibirClientes() {

        System.out.println("---");

        for (Cliente a : BancoDadosLanchonete.getTabelaCliente()) {

            System.out.println("Codigo cliente: " + a.getCodigo());
            System.out.println("Nome cliente: " + a.getNome());
            System.out.println("Cpf cliente: " + a.getCpf());
            System.out.println("");
        }
        System.out.println("---");
    }

    private void exibirClientePorCodigo() {
        System.out.print("Digite o codigo do aluno: ");
        int cod = scan.nextInt();
        scan.nextLine();

        Cliente z = ClientesController.buscarPorCodigo(cod);

        if (z != null) {
            System.out.println("");
            System.out.println("Codigo: " + z.getCodigo());
            System.out.println("Nome: " + z.getNome());
            System.out.println("Cpf: " + z.getCpf());
            System.out.println("");
        } else {
            System.out.println("Aluno não encontrado");
        }

    }
}
