/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Local;
import utenti.utente;

/**
 *
 * @author Daniele
 */
@Local
public interface GestoreLocal {

  //  public void update(utente u);

  
    
    public String operazioneBean();

    public String gestoreReplica();

    public void updateReplica(utente u);
}


