/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerTier;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import javax.net.ssl.SSLSocket;

public class ServerThread extends Thread{
    private SSLSocket ssl_socket; 
    private BufferedReader reader;
    private InputStream input_stream;
    private ByteArrayInputStream array_stream;
    private PrintWriter writer;
    public ServerThread(SSLSocket socket){
        this.ssl_socket=socket;
        try {
            this.input_stream=this.ssl_socket.getInputStream();
            this.array_stream=(ByteArrayInputStream)(this.input_stream);
            this.reader=new BufferedReader(new InputStreamReader(this.input_stream));
            this.writer=new PrintWriter(this.ssl_socket.getOutputStream());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public ServerThread(String username){
        
    }
    //this method is responsible for verifying the credentials
    private String verifyAccess(String username,byte[] password){
        return CentralServer.getRemoteDatabaseServer().login(username, password);
    }
    public void run(){
        try {
            this.ssl_socket.startHandshake();
            //the client sends its username with println ones handshaking is done...
            String username=reader.readLine();
            //we prepare a buffer for the password...
            //i think we should do Buffer Overflow check here
            byte[] password=new byte[this.array_stream.available()];
            //then it reads the password into the byte array... 
            this.array_stream.read(password);
            //then we send to the client the response from the client;
            String reply=verifyAccess(username,password);
            this.writer.println(reply);
            while(!(reply.equalsIgnoreCase("manager") && reply.equalsIgnoreCase("clerk"))){
                username=reader.readLine();
                password=new byte[this.array_stream.available()];
                this.array_stream.read(password);
                reply=verifyAccess(username,password);
                this.writer.println(reply);
            }
            //then we check if the connected user has any notifications for themselves...
            //if she is not expecting a message then we should send a null value 
            //because the receving method at the other side will block
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
