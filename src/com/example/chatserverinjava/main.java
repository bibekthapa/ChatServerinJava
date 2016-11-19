/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.chatserverinjava;

import com.example.chatserverinjava.handler.Client;
import com.example.chatserverinjava.handler.ClientHandler;
import com.example.chatserverinjava.handler.ClientListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HOME
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int port=9000;
     
        
     
      try{
      ServerSocket server=new ServerSocket(port);
      System.out.println("The server is running at port"+port);
      ClientHandler handler=new ClientHandler();
      
      while(true)
      {
           
          Socket socket = server.accept();
          //Socket socket=server.accept();
          System.out.println("Connection from "+socket.getInetAddress());
          
          ClientListener listener=new ClientListener(socket,handler);
          listener.start();
      }
          
      }catch(IOException ioe)
      {
          
          ioe.getMessage();
      }
     }
   
    
}
