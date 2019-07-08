/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerTier;

import RemoteTier.Message;
import RemoteTier.ManagerTask;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Windows
 */
public class Manager implements ManagerTask{
     
    @Override
    public Message displayAccount(String account, String type, String username, byte[] id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String createClerkAccount(HashMap<String, String> profiles, byte[] image, String username, byte[] id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Message checkActiveConnection(String username, byte[] id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String activate(ArrayList<String> accountNumbers, String username, byte[] id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public Message generateActivityReport(String clerk, String accountNumber, Date from, Date upto, String username, byte[] id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Message generateBankStatement(String accountNumber, Date from, Date upto, String username, byte[] id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void logout(String username, byte[] id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String setUsername(String newUsername, String username, byte[] id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String setPassword(byte[] newPassword, String username, byte[] id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String sendMessage(String to, Message payload, String username, byte[] id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Message manageApprovedRequest(String username, byte[] id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Message generateSystemReport(Date from, Date to, String username, byte[] id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Message generateIdsReport(Date from, Date to, String username, byte[] id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
