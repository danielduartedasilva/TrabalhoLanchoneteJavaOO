package views;

import banco.BancoDadosLanchonete;
import controllers.ClientesController;
import controllers.LanchesController;
import java.util.Scanner;
import models.Lanche;

public class LancheView {
    Scanner scan = new Scanner(System.in);
    
    public void exibirCadastroLanche(){
        System.out.println("1 - Cadastrar Lanche");
        System.out.println("2 - Exibir Lanches");
        System.out.println("3 - Exibir Lanche por codigo");
        System.out.print("Informe a opção desejada: ");
        int opcao = scan.nextInt();
        scan.nextLine();

        switch (opcao) {
            case 1:
                cadastrarLanche();
                break;
            case 2:
                exibirLanches();
                break;
            case 3:
                exibirLanchePorCodigo();
        }
    }

    private void cadastrarLanche() {
        System.out.print("Digite o codigo do lanche: ");
        int cod = scan.nextInt();
        scan.nextLine();

        System.out.print("Digite o nome do lanche: ");
        String nome = scan.nextLine();

        System.out.print("Digite o preço do lanche: ");
        double preco = scan.nextDouble();

        ClientesController.adicionarCliente(cod, nome, preco);
    }

    private void exibirLanches() {
            System.out.println("---");

        for (Lanche l : BancoDadosLanchonete.getTabelaLanche()) {

            System.out.println("Codigo lanche: " + l.getCodigo());
            System.out.println("Nome lanche: " + l.getNome());
            System.out.println("Preço lanche: " + l.getPreco());
            System.out.println("");
        }
        System.out.println("---");
    }

    private void exibirLanchePorCodigo() {
        System.out.print("Digite o codigo do aluno: ");
        int cod = scan.nextInt();
        scan.nextLine();

        Lanche l = LanchesController.buscarPorCodigo(cod);

        if (l != null) {
            System.out.println("");
            System.out.println("Codigo: " + l.getCodigo());
            System.out.println("Nome: " + l.getNome());
            System.out.println("Cpf: " + l.getPreco());
            System.out.println("");
        } else {
            System.out.println("Aluno não encontrado");
        }
    }
}
