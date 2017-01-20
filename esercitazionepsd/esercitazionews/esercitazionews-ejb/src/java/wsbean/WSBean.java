/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsbean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import utenti.utente;

/**
 *
 * @author Daniele
 */
@Stateless
public class WSBean implements WSBeanLocal {

    private String a;

    @Override
    public void register_ws1(utente u) {
        Statement stm = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con;
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/esercitazionews1", "daniele", "automazione");
                stm = con.createStatement();
                System.out.println("------------>" + u.getNome() + "','" + u.getCognome() + "','" + u.getSesso() + "','" + u.getIndirizzo() + "','" + u.getMail() + "','" + u.getCodice_fiscale() + "','" + u.getNumero_carta_d_identita() + "','" + u.getNumero_patente() + "');");
                stm.executeUpdate("insert into utenti values('" + u.getNome() + "','" + u.getCognome() + "','" + u.getSesso() + "','" + u.getIndirizzo() + "','" + u.getMail() + "','" + u.getCodice_fiscale() + "','" + u.getNumero_carta_d_identita() + "','" + u.getNumero_patente() + "');");
                System.out.println("utente " + u.getNome() + " registrato nella replica esercitazionews1");

            } catch (SQLException ex) {
                Logger.getLogger(WSBean.class.getName()).log(Level.SEVERE, null, ex);

            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(WSBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    @Override
    public String messaggio() {
        a = "messaggio del bean";
        return a;
    }

}
