/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.chatserverinjava;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

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
      
      while(true)
      {
          Socket socket = server.accept();
          //Socket socket=server.accept();
          System.out.println("Connection from "+socket.getInetAddress());
          PrintStream ps=new PrintStream(socket.getOutputStream());
          ps.println("Welcome to the server");
      }
          
      }catch(IOException ioe)
      {
          
          ioe.getMessage();
      }
     }
   
    
}
