/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseTier;
import RemoteTier.Message;
import RemoteTier.RemoteDatabaseServer;
import java.nio.ByteBuffer;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Windows
 */
public class DatabaseFileHandler implements RemoteDatabaseServer{

    @Override
    public Message getAccountProfile(String employeeUsername,String username, byte[] id) {
       if(checkAccess(username, id)){
           try {
               String query="select username,firstName,middleName,lastName,sex,nationality,age,fixedPhoneAddress,"
                       + "mobilePhoneAddress,kebele,woreda,houseNumber,"
                       + "subcity,region,image from employees where username='"+employeeUsername+"';";
               Constants.result=Constants.state.executeQuery(query);
               return new Message(Constants.result);
           } catch (SQLException ex) {
               Logger.getLogger(DatabaseFileHandler.class.getName()).log(Level.SEVERE, null, ex);
           }
        
       }
       return null;
    }

    @Override
    public Message getRequest(String username, byte[] id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Message getNmapScanReportOn(String filter,String username, byte[] id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Message getClientAccount(String account_number,String username, byte[] id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Message getManagerAccount(String username, byte[] id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Message getClerkAccount(String clerkUsername,String username, byte[] id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Message generatetSecurityReport(Date from, Date to, String about,String username, byte[] id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Message generatetSystemReport(Date from, Date to, String about,String username, byte[] id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Message generatetIdsReport(Date from, Date to, String about,String username, byte[] id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Message generateActivityReport(Date from, Date to, String clerk, String subject_client,String username, byte[] id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Message generateBankStatement(Date from, Date to, String client_account_number,String username, byte[] id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Message getActiveConnections(String username, byte[] id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Message saveAccountUpdate(String username, byte[] id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String saveCreatedAccount(ArrayList<String> verified,String username, byte[] id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveTempObject(Object saved,String username, byte[] id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void logout(String username, byte[] id) {
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
    public String login(String username, byte[] password) {
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
    private static boolean checkAccess(String username,byte[] password){
        try {
            Constants.result=Constants.state.executeQuery("select password from employees where username="+username);
            if(Constants.result.next()){
                byte[] correct_password=Constants.result.getBytes(1);
                ByteBuffer input_buffer=ByteBuffer.wrap(password);
                ByteBuffer correct_buffer=ByteBuffer.wrap(correct_password);
                return input_buffer.equals(correct_buffer);
            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseFileHandler.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
