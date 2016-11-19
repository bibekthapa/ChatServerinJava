/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.chatserverinjava.handler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.List;

/**
 *
 * @author HOME
 */
public class ClientListener extends Thread {

    private Socket socket;
   private ClientHandler handler;
    private BufferedReader reader;
    private PrintStream ps;
    private Client client;

    public ClientListener(Socket socket, ClientHandler handler) throws IOException {
        this.socket = socket;
        this.handler = handler;
        reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        ps = new PrintStream(socket.getOutputStream());
    }

    @Override
    public void run() {

        try {
            ps.println("Welcome to the server");
            doLogin();
            String line="";
            while(!(line=reader.readLine()).equalsIgnoreCase("exit"))
                    {
                        System.out.println(client.getUserName()+" says > "+ line);
                        ps.println(client.getUserName()+" says > "+line);
                    }
            handler.remove(client);
           

        } catch (IOException ioe) {
            ioe.getMessage();
        }
    }

    public void doLogin() throws IOException {
        ps.println("Enter your name");
        String name = reader.readLine();
        ps.println("Hello " + name);
       
       client=new Client(name,socket);
        client.setUserName(name);
        handler.add(client);
        

    }

}
