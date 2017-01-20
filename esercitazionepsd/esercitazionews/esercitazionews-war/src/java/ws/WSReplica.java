/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import utenti.utente;
import wsbean.WSBeanLocal;

/**
 *
 * @author Daniele
 */
@WebService(serviceName = "WSReplica")
@Stateless()

public class WSReplica {
    private utente u1;
    @EJB
    private WSBeanLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    /**
     * Web service operation
     */
  
    /**
     * Web service operation
     */
    @WebMethod(operationName = "operazione_bean")
    public String operazione_bean() {
        
        return ejbRef.messaggio();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "gestore_replica")
    public String gestore_replica(utente u) {
       this.u1=u;
       ejbRef.register_ws1(u1);
        return null;
    }
    
    
}
