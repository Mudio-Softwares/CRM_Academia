/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crm_academia;

/**
 *
 * @author Rodolfo
 */
public class Lembrete {
    /*
    Mudar essa classe, colocando data de criação e data a disparar no formato de datas
    */
    private String lembrete, data_criacao, data_a_disparar;

     public Lembrete(String lembrete, String data_criacao, String data_a_disparar){
        this.lembrete = lembrete;
        this.data_a_disparar = data_criacao;
        this.data_a_disparar = data_a_disparar;
    }
     
    public String getLembrete() {
        return lembrete;
    }

    public void setLembrete(String lembrete) {
        this.lembrete = lembrete;
    }

    public String getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(String data_criacao) {
        this.data_criacao = data_criacao;
    }

    public String getData_a_disparar() {
        return data_a_disparar;
    }

    public void setData_a_disparar(String data_a_disparar) {
        this.data_a_disparar = data_a_disparar;
    }
    
   
}
