/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RemoteTier;
import java.io.Serializable;
import java.rmi.Remote;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author Windows
 */
public interface ManagerTask extends Remote,Serializable{
    //the manager remote mothods will be defined here...
    //The (....String username,byte[] id) at the end of every method argument list will help identify the manager...
    //this method will be responsible for searching account...
    public abstract Message displayAccount(String account,String type,String username,byte[] id);
    //this method will be responsible for creating a new clerk
    public abstract String createClerkAccount(HashMap<String,String> profiles,byte[] image,String username,byte[] id);
    //this method will be responsible for viewing the active connections...
    public abstract Message checkActiveConnection(String username,byte[] id);
    //this methid will activate clinets accounts after verification by the manager..
    public abstract String activate(ArrayList<String> accountNumbers,String username,byte[] id);
    //this method will be responsible for generating report...
    public abstract Message generateActivityReport(String clerk,String accountNumber,Date from,Date upto,String username,byte[] id);
    //this method will be responsible for requesting clients' bank statement...
    public abstract Message generateBankStatement(String accountNumber,Date from,Date upto,String username,byte[] id);
    //to log out...
    public abstract void logout(String username,byte[] id);
     //change username..
    public abstract String setUsername(String newUsername,String username,byte[] id);
    //change password..
    public abstract String setPassword(byte[] newPassword,String username,byte[] id);
    //the following method will be used to send a message
    //if the employee the message is destined for is not currently
    //online it will return a string that explains that..
    public abstract String sendMessage(String to,Message payload,String username,byte[] id);
    //the method will be called when the manager gets online to obtain
    //the accounts yet to be verified
    public abstract Message manageApprovedRequest(String username,byte[] id);
    // i dont know what this is for, we should ask Mohammed
    public abstract Message generateSystemReport(Date from,Date to,String username,byte[] id);
    //this method will be used for generating IDS report..
    //some parametes must be specified i dont know what those will be
    //probabaly filtering by date is probably one of them
    public abstract Message generateIdsReport(Date from,Date to,String username,byte[] id);
    //the folwing method will be called to obtain a client's Bank statement
   
}