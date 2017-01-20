/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsbean;

import javax.ejb.Local;
import utenti.utente;

/**
 *
 * @author Daniele
 */
@Local
public interface WSBeanLocal {

  
    public String messaggio();

    public void register_ws1(utente u);
    
}
