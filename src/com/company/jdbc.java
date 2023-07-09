package com.company;

import java.sql.*;
class jdbc{
    public static void main(String[] args){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");     //register

            Connection con=DriverManager.getConnection(  "com.company.jdbc:oracle:thin:@localhost:1521:xe","system","oracle"); // create connection
            Statement st=con.createStatement();     //create statement

            ResultSet rs=st.executeQuery("select * from emp");        //execute query

            while(rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            }
            con.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }

    }
}
