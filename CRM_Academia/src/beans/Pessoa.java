/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author Rodolfo
 */
public abstract class Pessoa {
    private String nome, email, num_telefone, senha;
    private double matricula;
    
    public Pessoa(String nome, String email, String num_tel, String senha, double matricula){
        this.nome = nome;
        this.email = email;
        this.num_telefone = num_tel;
        this.senha = senha;
        this.matricula = matricula;
    } 
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    public void gerarMatricula(){
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNum_telefone() {
        return num_telefone;
    }

    public void setNum_telefone(String num_telefone) {
        this.num_telefone = num_telefone;
    }

    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }
}
