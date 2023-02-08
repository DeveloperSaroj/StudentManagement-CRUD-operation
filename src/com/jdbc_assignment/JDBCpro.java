package com.jdbc_assignment;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCpro 
{

	public static String url="jdbc:mysql://localhost:3306/jdbc_assignment";
	public static String user="root";
	public static String pass="admin";

	public  static void creating()
	{
		Connection con=null;
		Statement s=null;
	try 
		{   
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, user, pass);
			s=con.createStatement();
			String query="create table employee(eno int primary key,ename varchar(25),esal int)";
			s.executeUpdate(query);
	
			System.out.println("Table created sucessfully");
		} 
	catch (ClassNotFoundException | SQLException e) 
		{
			
			e.printStackTrace();
		}
	finally
	    {
		if(s!=null && con!=null)
		{
			try {
				s.close(); con.close();
			} catch (SQLException e)
			{				
				e.printStackTrace();
			}
		}	
	    }
		
	}

    public static void inserting(int eno,String ename,int esal)
    {
    	Connection con=null;
    	PreparedStatement ps=null;
    	try {
    		System.out.println("Data Inserting....");
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, user, pass);
			String query="insert into employee(eno,ename,esal)values(?,?,?)";
			ps=con.prepareStatement(query);
			ps.setInt(1, eno);
			ps.setString(2,ename);
			ps.setInt(3, esal);
			ps.executeUpdate();
			System.out.println("data inserted sucessfully");
			
		} 
    	catch (ClassNotFoundException | SQLException e)
    	{
			
			e.printStackTrace();
		}
    	finally
    	{
    		if(ps!=null && con!=null)
    		{
    			try {
					ps.close(); con.close();
				} catch (SQLException e) 
    			{
					
					e.printStackTrace();
				}
    		}
    	}
    	
    	
    }
  
    public static void updating(int eno,String ename,int esal)
    {
    	Connection con=null;
    	PreparedStatement ps=null;
    	try {
    		System.out.println("Data Updating....");
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, user, pass); 
			String query="update employee set ename=?,esal=? where eno=?";
			ps=con.prepareStatement(query);   
			ps.setString(1, ename);
			ps.setInt(2, esal);
			ps.setInt(3, eno);
			ps.executeUpdate();
			System.out.println("Data updated sucessfully");
		
		} catch (ClassNotFoundException | SQLException e) 
    	{

			e.printStackTrace();
		}
    	finally
    	{
    		if(ps!=null && con!= null)
    		{
    		try {
				ps.close();con.close();
			} catch (SQLException e)
    		{				
				e.printStackTrace();
			}	
    		}
    	}
    	
    }

    public static void deleting(int eno)
    {
    	Connection con=null;
    	PreparedStatement ps=null;
    	try {
    		System.out.println("Deleting Record....");
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, user, pass);
			String query="delete from employee where eno=?";
			ps=con.prepareStatement(query);
			ps.setInt(1, eno);
			ps.executeUpdate();
			System.out.println("Data deleted sucessfully");
		} catch (ClassNotFoundException | SQLException e) 
    	{
			e.printStackTrace();
		}
    	finally
    	{
    		if(ps!=null && con!=null)
    		{
    			try {
					ps.close();con.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}		
    		}
    	}  	
    }
    
}











