package com.mycompant.presto.test.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.facebook.presto.jdbc.PrestoResultSet;

public class PrestoDBBean {

	public Response testPrestoDB() {
		System.out.println("*********************************************");
		System.out.println("TEST PRESTO DB");
		
		Connection connection = null;
        Statement statement = null;
        PrestoResultSet prestoResultSet = null;
        
        ClassLoader cl = Thread.currentThread().getContextClassLoader(); 
        Thread.currentThread().setContextClassLoader(this.getClass().getClassLoader());
        
        try {
            Class.forName("com.facebook.presto.jdbc.PrestoDriver");
            connection = DriverManager.getConnection("jdbc:presto://localhost:8080/mysql/my_database", "root", null);

            statement = connection.createStatement();

            try {
            	System.out.println("Execute query: select * from my_database.student_yy");
            	
                prestoResultSet = (PrestoResultSet) statement.executeQuery("select * from testing");
                System.out.println("Query executed");
            } finally {
                if (prestoResultSet != null) {
                    prestoResultSet.close();
                }
            }
        } catch (Exception e) {
        	e.printStackTrace();
        } finally {
            if (statement != null) {
                try {
					statement.close();
				} catch (SQLException e) {
				}
            }

            if (connection != null) {
                try {
					connection.close();
				} catch (SQLException e) {
				}
            }
            
            Thread.currentThread().setContextClassLoader(cl);
        }
        
        System.out.println("*********************************************");
        return javax.ws.rs.core.Response.status(Status.INTERNAL_SERVER_ERROR).build();
	}
	
}
