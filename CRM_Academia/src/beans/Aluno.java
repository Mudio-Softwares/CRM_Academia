/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;
import pessoas.Pessoas;
/**
 *
 * @author 61009
 */
public class Aluno extends Pessoas{

    @Override
    public boolean gerarMatricula() {
        return true;
    }
    
}
