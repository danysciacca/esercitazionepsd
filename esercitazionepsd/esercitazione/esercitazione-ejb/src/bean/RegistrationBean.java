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
import javax.ejb.EJB;
import javax.ejb.Stateless;
import utenti.utente;

/**
 *
 * @author Daniele
 */
@Stateless
public class RegistrationBean implements RegistrationBeanLocal {

    @EJB
    private GestoreLocal gestore;
    
    
    @Override
    public void register(utente u){
        Statement stm=null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/esercitazione", "daniele", "automazione");
            stm=con.createStatement();
            System.out.println("-------------->"+u.getCodice_fiscale());
            rs=stm.executeQuery("select * from utenti where codice_fiscale='"+ u.getCodice_fiscale()+ "';");
            
            //rs.next();
            System.out.println("----------------------------->"+rs);
            
            if(rs.next()){
                System.err.println("utente già registrato");
            }
            else{
                System.out.println("------------>"+u.getNome()+"','"+u.getCognome()+"','"+u.getSesso()+"','"+u.getIndirizzo()+"','"+u.getMail()+"','"+u.getCodice_fiscale()+"','"+u.getNumero_carta_d_identita()+"','"+u.getNumero_patente()+"');");
                stm.executeUpdate("insert into utenti values('"+u.getNome()+"','"+u.getCognome()+"','"+u.getSesso()+"','"+u.getIndirizzo()+"','"+u.getMail()+"','"+u.getCodice_fiscale()+"','"+u.getNumero_carta_d_identita()+"','"+u.getNumero_patente()+"');");
                System.out.println("utente "+u.getNome()+" registrato");
                
               gestore.updateReplica(u);
            }
            
                
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrationBean.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RegistrationBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
  /*  @Override
    public void notifyHandler(utente u){
        gestore.update(u);
    }*/
    
    
    
}
