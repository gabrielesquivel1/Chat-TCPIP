/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

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
        clientConnectionLoop();
    }
    
    private void clientConnectionLoop() throws IOException{
        while(true){
            Socket clientSocket = serverSocket.accept();
            System.out.println("Cliente " + clientSocket.getRemoteSocketAddress()+ " conectou");
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String msg = in.readLine();
            System.out.println("Mensagem recebida do cliente "+ clientSocket.getRemoteSocketAddress()+ ": " + msg);
        }
    }
    
    public static void main(String[] args) {
        
        try {
            ChatServer server = new ChatServer();
            server.start();
        } catch (IOException ex) {
            System.out.println("Erro ao iniciar o servidor " + ex.getMessage());
        }
        
        
        System.out.println("Servidor Finalizado");
        
    }
    
    
    
    
}
