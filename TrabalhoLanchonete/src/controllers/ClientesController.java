package controllers;

import banco.BancoDadosLanchonete;
import models.Cliente;

public class ClientesController {
    
    public static void adicionarCliente(int codigo, String nome, String cpf){
        // criei o objeto para ir para o banco
        Cliente a = new Cliente();
        
        // Preenchendo o objeto
        a.setCodigo(codigo);
        a.setNome(nome);
        a.setCpf(cpf);
        
        BancoDadosLanchonete.getTabelaCliente().add(a);
    }
    
    public static Cliente buscarPorCodigo(int codigo){
        
        for(Cliente a : BancoDadosLanchonete.getTabelaCliente()){
            if(a.getCodigo() == codigo){
                return a;
            }
        }
        
        return null;
    }

    public static void adicionarCliente(int cod, String nome, double preco) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
