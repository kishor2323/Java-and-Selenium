package testNG;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectionEx {

	public static void main(String[] args) throws SQLException {

		Connection conn=null;
		
		try 
		{
			
			//load the driver
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn=DriverManager.getConnection("jdbc:oracle:thin:@system8-PC:1521:XE","SYSTEM","admin");
			
			Statement stmt = conn.createStatement();
			
			ResultSet rs=stmt.executeQuery("select * from SYSTEM.KISHOR");
			
			while(rs.next())
			{
				System.out.println(rs.getString("ID")+" "+rs.getString("NAME")+" "+rs.getString("ADDRESS")+" "+rs.getString("AGE")+" "+rs.getString("SALARY"));
			}
			
		}
			catch(SQLException se)
			{
				
				System.out.println("Sql Exception "+se);
			
			}
		catch(ClassNotFoundException cnfe)
		{
			System.out.println("Class Not Found Exception "+cnfe);
		}
		
		finally
		{
			try
			{
				if(conn!=null)
					conn.close();
			}
			
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
			
		}

	}


