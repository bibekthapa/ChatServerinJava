/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.chatserverinjava.handler;

import java.net.Socket;

/**
 *
 * @author HOME
 */
public class Client {
    private String userName;
    private Socket socket;
    
    Client()
    {
       
    }

    Client(String name, Socket socket) {
       this.userName=userName;
        this.socket=socket;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }
    
    
}
