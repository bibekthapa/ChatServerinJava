/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.chatserverinjava.command;

import com.example.chatserverinjava.handler.Client;
import java.io.IOException;
import java.io.PrintStream;

/**
 *
 * @author HOME
 */
public class PublicMessageCommand extends ChatCommand {

    @Override
    public void execute(Client client, String msg) throws IOException {
        for(Client c:handler.getClients())
        {
            PrintStream pw=new PrintStream(c.getSocket().getOutputStream());
            pw.println(client.getUserName()+" says >"+ msg);
        
        }
    }
    
}
