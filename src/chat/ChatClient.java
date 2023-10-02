/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chat;

import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author DELL
 */
public class ChatClient {
    private Socket clientSocket;
    private static final String SERVER_ADDRESS = "127.0.0.1";

public void start() throws IOException{
    clientSocket = new Socket(SERVER_ADDRESS, ChatServer.PORT);
}    
    
    public static void main(String[] args) {
        
    }
}
