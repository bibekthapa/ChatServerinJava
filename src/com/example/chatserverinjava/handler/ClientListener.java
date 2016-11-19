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

/**
 *
 * @author HOME
 */
public class ClientListener extends Thread {

    private Socket socket;

    public ClientListener(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        try {
            PrintStream ps = new PrintStream(socket.getOutputStream());
            ps.println("Welcome to the server");
            ps.println("Enter your name");
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String name = reader.readLine();
            ps.println("Hello " + name);
        } catch (IOException ioe) {
            ioe.getMessage();
        }
    }

}
