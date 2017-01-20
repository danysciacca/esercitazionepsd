/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

//import clientws.WSReplica_Service;
import cliente.WSReplica_Service;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;
import utenti.utente;

/**
 *
 * @author Daniele
 */
@Stateless
public class Gestore implements GestoreLocal {
    private utente u;
    
    @WebServiceRef(wsdlLocation = "META-INF/wsdl/localhost_8080/WSReplica/WSReplica.wsdl")
    private WSReplica_Service service;
    //con il dato generato da insert code non funziona
    @WebServiceRef(wsdlLocation ="http://localhost:8080/WSReplica/WSReplica?WSDL")
    private client.WSReplica_Service service_1;
    
    
    
 
    
    @EJB
    private RegistrationBeanLocal registrationBean;
    
    @Override
    public void updateReplica(utente u){
        // TODO QUESTO è IL PROBLEMA CHE HO SCRITTO NELLA MAIL, COME PASSO L'UTENTE AL WEB SERVICES?
    }
    
   
    
  
    @Override
    //di default lo da private, perchè?
    public String operazioneBean() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        client.WSReplica port = service_1.getWSReplicaPort();
        System.out.println(port.operazioneBean());
        return port.operazioneBean();
    }

    @Override
    public String gestoreReplica() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        cliente.WSReplica port = service.getWSReplicaPort();
        return port.gestoreReplica();
    }

   
        
    
    
        
    }
   

