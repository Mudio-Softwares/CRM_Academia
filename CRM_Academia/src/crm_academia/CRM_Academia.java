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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Rodolfo
 */
public class CRM_Academia {

    static Clientes Lista_Clientes = new Clientes();
    
    public static void main_menu(){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("1 - Cadastrar aluno\n2 - Consultar aluno\nDigite a opção escolhida: ");
        int opcao = scan.nextInt();
        
        switch(opcao){
            case 1:
                AdicionarCliente();
                break;
        }
    
    }
  
    public static void main(String[] args) throws SQLException{
       main_menu();
    }
    
    private static void AdicionarLembrete(Pessoa pessoa) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("****** Página de lembretes ********\n Digite o lembrete: ");
        String lembrete = scan.nextLine();
        
        System.out.println("Digite a data a ser lembrado");
        String data_execucao = scan.nextLine();
        
        Date aux = new Date();
        
        Lembrete aux1 = new Lembrete(lembrete, aux.getDay() + "/" + aux.getMonth() + "/" +aux.getYear(), data_execucao);
        if (Lista_Clientes.addLembrete(pessoa, aux1))
            System.out.println("Lembrete adicionado com sucesso!");
        else
            System.out.println("Lembrete não adicionado");
    }
    
    private static void AdicionarCliente() {
        Scanner scan = new Scanner(System.in);
        System.out.println("**not working yet!*** Deseja cadastrar com os dados do facebook?\n1 - Sim\n2 - Não");
        
        System.out.print("Digite o nome:");
        String nome = scan.next();
        
        System.out.print("Digite o email:");
        String email = scan.next();
        
        System.out.print("Digite o número do telefone:");
        String num_tel = scan.next();
        
        System.out.print("Digite o senha:");
        String senha = scan.next();
        
        System.out.print("Digite o matricula:");
        double matricula = scan.nextDouble();
        
        Cliente bla = new Cliente(nome, email, num_tel, senha, matricula);
        
        Lista_Clientes.insertCliente(bla);
        
        System.out.print("Gostaria de adicionar um lembrete a esse usuário? \n1 - SIm\n2 - Não");
        
        if (scan.nextInt() == 1){
            AdicionarLembrete(bla);
        }
    }
    
}
