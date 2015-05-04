/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crm_academia;

import beans.Pessoa;
import beans.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Rodolfo
 */
public class Clientes extends Pessoas{
    private static final String clientes_table = "Clientes";
    private static final String lembretes_table = "Lembrete";
    private static final String nome_Banco_de_Dados = "Mudio";
 
    public Clientes(){
        try(
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mudio", "root", "556556");
                Statement stm = con.createStatement();
                ){
            stm.executeUpdate("Create table if not exists " + clientes_table + " (nome varchar(50), email varchar(40), num_tel varchar(40)"
                    + ", senha varchar(40), matricula float(53), PRIMARY KEY(matricula));");
            stm.executeUpdate("Create table if not exists " + lembretes_table + " (matricula float(53), lembrete varchar(500), data_criacao"
                    + " varchar(20), data_execucao varchar(20));");
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    //retorna falso caso não consiga inserir cliente no banco de dados
    public boolean insertCliente(Cliente cliente){
        
        
        try(
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + nome_Banco_de_Dados, "root", "556556");
                PreparedStatement stm = con.prepareStatement("Insert into " + clientes_table + " values (?, ?, ?, ?, ?)");
                ){
            stm.setString(1, cliente.getNome());
            stm.setString(2, cliente.getEmail());
            stm.setString(3, cliente.getNum_telefone());
            stm.setString(4, cliente.getSenha());
            stm.setDouble(5, cliente.getMatricula());
            
            stm.execute();
            System.out.println("Cliente " + cliente.getNome() + " adicionado com sucesso");
            return true;
            
        }
        catch(SQLException ex){
            System.out.println("ERRO: " + ex.getMessage());
            return false;
        }
    }
  
    @Override
    public boolean addLembrete(Pessoa pessoa, Lembrete lembrete) {
        try(
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + nome_Banco_de_Dados, "root", "556556");
                PreparedStatement stm = con.prepareStatement("Insert into " + lembretes_table + " values (?,?,?,?);");
                )
        {
            stm.setDouble(1, pessoa.getMatricula());
            stm.setString(2, lembrete.getLembrete());
            stm.setString(3, lembrete.getData_criacao());
            stm.setString(4, lembrete.getData_a_disparar());
            stm.execute();
            
            return true;
        }
        catch(SQLException ex){
            ex.printStackTrace();
            return false;
        }
    }
    
    @Override
    public boolean girarCatraca() {
    //Se pagamento, exames, dia ou horário estiver ok, liberar catraca.
        //adicionar ultima vez que usuário esteve na academia.
        //adicionar frequência.
        //adicionar total de pessoas que estão na academia.
        return false;
    
    }
}
