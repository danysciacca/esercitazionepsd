/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.ejb.Local;
import utenti.utente;

/**
 *
 * @author Daniele
 */
@Local
public interface RegistrationBeanLocal {

    public void register(utente u);

  //  public utente doUpdate(utente u);

  //  public utente doSend(utente u);

    //public void notifyHandler(utente u);
    
}
