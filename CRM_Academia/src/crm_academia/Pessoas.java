/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crm_academia;

import beans.Pessoa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Rodolfo
 */
public abstract class Pessoas {
      public abstract boolean girarCatraca();
      public abstract boolean addLembrete(Pessoa pessoa, Lembrete lembrete);
}
