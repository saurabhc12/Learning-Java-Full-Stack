package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import entity.Candidate;

public class Dao {
	
	String url ="jdbc:mysql://localhost:3306/advjava1";
	String uname="root";
	String pwd ="MySau@12";
	
	String sql="Select * from advjava1.candidate";
	//**3 type to insert data - non-dinamic, dinamic, prepare-statement**
	
	// this order will follow for non-Dinamic insertion in database
//	String sqlinsert="INSERT INTO advjava1.candidate Values(101,'test','test','test','test','test',60)";
	String sqlinsert2 = "INSERT INTO advjava1.candidate Values(?,?,?,?,?,?,?)";
	
	public List<Candidate> getAllCandidate(){
		System.out.println("we r in dao layer");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(1);
			
			Connection connection = DriverManager.getConnection(url, uname, pwd);
			System.out.println(2);
			
			Statement st = connection.createStatement();
			System.out.println(3);
			
	// prepare-statement insertion	
			//faster to insert large amount of data
			//only have to update values in below
			
			int cid = 103;
			String name = "shiv";
			String party = "BE";
			String state = "MH";
			String assembly = "Pune";
			String gender = "Male";
			int age = 26;
			
			PreparedStatement pst = connection.prepareStatement(sqlinsert2);
			pst.setInt(1, cid);
			pst.setString(2, name);
			pst.setString(3, party);
			pst.setString(4, state);
			pst.setString(5, assembly);
			pst.setString(6, gender);
			pst.setInt(7, age);
			
			int rows = pst.executeUpdate();
			
      // dinamic insertion
			
//			int cid = 102;
//			String name = "sau";
//			String party = "BE";
//			String state = "MH";
//			String assembly = "Pune";
//			String gender = "Male";
//			int age = 23;
//			String sqlinsert="INSERT INTO advjava1.candidate Values("+cid+",'"+name+"','"+party+"','"+state+"','"+assembly+"','"+gender+"',"+age+")";
			// for Dinamic insertion formate  for int - "+__+" , for String - '"+__+"'

//			int rows = st.executeUpdate(sqlinsert);
			
			if(rows>0) {
				System.out.println("data inserted");
			}else {
				System.out.println("something is wrong");
				}
			
//			ResultSet rs = st.executeQuery(sql);
			System.out.println(4);
			
		//get method
//			while(rs.next()) {
//				int cid = rs.getInt(1);
//				String name = rs.getString(2);
//				String party = rs.getString(3);
//				String state = rs.getString(4);
//				String assembly = rs.getString(5);
//				String gender = rs.getString(6);
//				int age = rs.getInt(7);
//				
//				System.out.println("Candidate name is "+name+" Party name is "+party);
//			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
