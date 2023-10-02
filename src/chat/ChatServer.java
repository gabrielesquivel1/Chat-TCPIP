/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chat;

import java.io.IOException;
import java.net.ServerSocket;

/**
 *
 * @author DELL
 */
public class ChatServer {
    protected static final int PORT =4000;
    private ServerSocket serverSocket;
    
    public void start() throws IOException{
        System.out.println("Servidor iniciado com a porta "+ PORT);
        serverSocket = new ServerSocket(PORT);
    }
    
    public static void main(String[] args) {
        
        try {
            ChatServer server = new ChatServer();
            server.start();
        } catch (IOException ex) {
            System.out.println("Erro ao iniciar o servidor" + ex.getMessage());
        }
        
        
        System.out.println("Servidor Finalizado");
        
    }
    
    
    
    
}
