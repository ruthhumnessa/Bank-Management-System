/*
 * Mainly for reports but it also can encapsulate other information about a result set.
 */
package RemoteTier;

import java.io.Serializable;
import java.util.*;
import java.sql.*;
public class Message implements Serializable{
    private ArrayList<ArrayList<Object>> values;
    private ArrayList<Object> row;
    public Message(ResultSet result)throws SQLException{
       row=new ArrayList<>();
       values=new ArrayList<>();
      if(result.next()){
            
            ResultSetMetaData meta=result.getMetaData();
            int column=meta.getColumnCount();
            int current=1;
            while(column>=current){
                    row.add(meta.getColumnName(current));
                    current++;
             }
        current=1;
        values.add(row);
        row=new ArrayList<>();
        result.beforeFirst();
        while(result.next()){
                    row=new ArrayList<>();
            while(column>=current){
               row.add(result.getObject(current));
               current++;
            }
            current=1;
            values.add(row);
            //row=new  ArrayList<Object>();
        }
     }
     else{
         row.add("No record to display");
         values.add(row);
      }
    }
    public synchronized ArrayList<ArrayList<Object>> getData(){
        return this.values;
    }
}
    
    

