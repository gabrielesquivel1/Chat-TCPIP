/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chat;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author GabrielEsquivel
 */
public class ChatClient {
    private Socket clientSocket;
    private static final String SERVER_ADDRESS = "127.0.0.1";
    private Scanner scanner;
    private PrintWriter out;
    
    public ChatClient(){
        scanner = new Scanner(System.in);
    }
            

public void start() throws IOException{
  
    clientSocket = new Socket(SERVER_ADDRESS, ChatServer.PORT);
    this.out = new PrintWriter(clientSocket.getOutputStream(), true);
        System.out.println("Cliente conectado ao servidor em " +
            SERVER_ADDRESS + ":" + ChatServer.PORT);
        messageLoop();
}
         private void messageLoop() throws IOException{
            String msgn;
            do {
                System.out.print("Digite uma mensagem(ou sair para finalizar) : ");
                msgn = scanner.nextLine();
                out.println(msgn);
                
            } while(!msgn.equalsIgnoreCase("sair"));
        }       
        
    
    
    
    public static void main(String[] args) {
        try {
            ChatClient client = new ChatClient();
            client.start();
            
        } catch (IOException ex) {
            System.out.println("Erro ao iniciar Cliente " + ex.getMessage());

        }
        System.out.println("Cliente finalizado!");
    


}



}

