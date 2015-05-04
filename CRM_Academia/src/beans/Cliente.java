/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

public class Cliente extends Pessoa{
    public Cliente(String nome, String email, String num_tel, String senha, double matricula){ 
        super(nome, email, num_tel, senha, matricula);
    }
}
