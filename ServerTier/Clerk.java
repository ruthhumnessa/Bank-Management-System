/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerTier;

import RemoteTier.Message;
import java.sql.Date;
import java.util.HashMap;

/**
 *
 * @author Windows
 */
public class Clerk implements RemoteTier.ClerkTask{

    @Override
    public Message displayClientAccount(String account, String username, byte[] id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String withdraw(String account, Double amount, String username, byte[] id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String deposit(String account, Double amount, String username, byte[] id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String createClientAccount(Message profile, String username, byte[] id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //in this method the sendApprovalRequest() method will be called to check if the manager is online...
        //and if so to send the approval request to him immediately...
    }

    @Override
    public Message personalProfile(String username, byte[] id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String fillAttendance(String username, byte[] id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String fillLeavePermit(Message details, String username, byte[] id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void logout(String username, byte[] id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String setPassword(byte[] newPassword, String username, byte[] id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //this method checks to see if the manager is online and..
    //if it is, sends to it direcrly the approval request without storing in the database
    private static boolean sendApprovalRequest(){
        return false;
    }

    @Override
    public String sendMessage(String to, Message payload, String username, byte[] id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Message receiveMessage(String username, byte[] id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
