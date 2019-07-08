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
/**
 *
 * @author Windows
 */
public interface RemoteDatabaseServer extends Remote,Serializable{
    //the sds says it returns account object
    //to obtain an employee's account..
    public abstract Message getAccountProfile(String employeeUsername,String username, byte[] id);
    //i dont know what this is for...i should use it like receiveMessage
    public abstract Message getRequest(String username, byte[] id);
    //i also dont know what this is for, we should ask Mohammed 
    public abstract Message getNmapScanReportOn(String filter,String username, byte[] id);
    //to obtain clients' account information...
    public abstract Message getClientAccount(String account_number,String username, byte[] id);
    //this method will be responsible for withdrawing from clients' accounts
    public abstract String withdraw(String account,Double amount,String username,byte[] id);
    //this method will be responsible for depositing  to clients' accounts
    public abstract String deposit(String account,Double amount,String username,byte[] id);
    //to obtain a managers account
    public abstract Message getManagerAccount(String username, byte[] id);
    //to obtain a clerks account
    public abstract Message getClerkAccount(String clerkUsername,String username, byte[] id);
    //to query the database and construct security report...
    public abstract Message generatetSecurityReport(Date from,Date to,String about,String username, byte[] id);
    //to query the database and construct system report...
    public abstract Message generatetSystemReport(Date from,Date to,String about,String username, byte[] id);
    //to query the database and construct an IDS  report...
    public abstract Message generatetIdsReport(Date from,Date to,String about,String username, byte[] id);
    //to obtain an activity by an employee..
    //if the report is such that no filter is required(filter by employee,
    //by date or by by activity type) "*" will be used as parameter.
    public abstract Message generateActivityReport(Date from,Date to,String clerk,String subject_client,String username, byte[] id);
    //to obtain a client's ban statement
    //the same thing regaring wild card queries applies here.. 
    public abstract Message generateBankStatement(Date from,Date to,String client_account_number,String username, byte[] id);
    //to obtain the current actively connected users
    public abstract Message getActiveConnections(String username, byte[] id);
    //this method is used to obtain the list of created accounts
    public abstract Message saveAccountUpdate(String username, byte[] id);
    //this methos will be called to verify accounts.
    //and recieves a list clients' accounts verified
    public abstract String saveCreatedAccount(ArrayList<String> verified,String username, byte[] id);
    //i dont know what the following method does
    public abstract void saveTempObject(Object saved,String username, byte[] id);
    //when the server is signalled that a client wishes to log out it may
    //call this method to also signal the database server of this and then take appropriate mesasures..
    public abstract void logout(String username, byte[] id);
    //ones they have logged into the system this method will be called to fill attendance
    public abstract String fillAttendance(String username,byte[] id);
    //ones they are done filling thier form this method will be called to complete their submit.
    public abstract String fillLeavePermit(Message details,String username,byte[] id);
    //to login to the system
    // a string will be returned indicating to the server and then to the client host
    //the type of employee logged in
    public abstract String login(String username,byte[] password);
}
