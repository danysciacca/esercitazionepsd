/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package websocket;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

/**
 *
 * @author Daniele
 */
@ServerEndpoint("/server")
public class inserimento {

    @OnMessage
    public String onMessage(String message, Session session) {
        
            System.out.println("salvatore quattropani" +message+"abcdefghi");
           // message.
                    
            //session.getBasicRemote().sendText(message);
       return message;
    }
    
    @OnOpen
    public void onOpen(Session session) {
        
        System.out.println(session.getId() + " ha avviato sessione");
    }

    @OnError
    public void onError(Throwable t) {
        //mettere log errori
    }

    @OnClose
    public void onClose(Session session) {
        
        System.out.println(session.getId() + " ha chiuso la sessione");
    }
    
}
