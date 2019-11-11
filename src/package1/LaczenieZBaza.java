/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

import java.sql.*;
import java.util.Properties;
/**
 *
 * @author Kompik1
 */
public class LaczenieZBaza {
    //Class.forName("com.mysql.jdbc.Driver");
    
    String url = "jdbc:mysql://localhost:3306/statystyki";
    String login = "root";
    String password = "";
    ResultSet rs;
    Statement st;
    
    Connection conn;

    public LaczenieZBaza() throws SQLException {
        this.conn = DriverManager.getConnection(url,login,password);        
        this.st = conn.createStatement();      
    }
    
    
//    Connection conn = null;
//    
//    public Connection dajPolaczenie(){
//        String url = "jdbc:mysql://localhost/studenci";
//        Properties prop = new Properties();
//        prop.setProperty("user","root");
//        prop.setProperty("password", "");
//        try{
//            conn = DriverManager.getConnection(url,prop);
//
//        } catch(SQLException e){
//            e.printStackTrace();
//            System.out.println("blad polaczenia");
//            return null;
//        }
//
//        System.out.println("polaczono");
//        return conn;
//    }

    
    public void selectZBazy(String s, int l) throws SQLException
    {
         this.rs = st.executeQuery(s);
        
        int liczbaKolumn = l;
        
        while (rs.next()) {
            for (int i = 1; i <= liczbaKolumn; i++) {
                System.out.print(rs.getString(i) + " ");
            }
            System.out.println("");
        }
        
    }
    
    public void insertDoBazy(String s) throws SQLException{
        st.executeUpdate(s);
       
    }
    
    public Statement getSt() {
        return st;
    }
    
    public Connection getConn(){
        return conn;
    }
    
    
}


