/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.chatserverinjava.handler;

import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HOME
 */
public class ClientHandler {

    List<Client> clients = new ArrayList<>();

    public void add(Client c) {
        clients.add(c);
    }

    public boolean remove(Client client) {

        for (Client c : clients) {
            if (c.equals(clients)) {
                clients.remove(c);
                return true;
            }

        }
        return false;

    }

    public List<Client> getClients() {
        return clients;
    }

    public Client getByUserName(String userName) {

        for (Client c : clients) {
            if ((c.getUserName().equalsIgnoreCase(userName))) {
                return c;
            }
           

        }
         return null;
    }
     public Client getBySocket(Socket socket) {

        for (Client c : clients) {
            if ((c.getSocket().equals(socket))) {
                return c;
            }
           

        }
         return null;
    }

}
