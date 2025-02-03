package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Candidate;

public class Dao {
	
	List<Candidate> allcandidate=null;
	
	String url="jdbc:mysql://localhost:3306/advjava1";
	String uname="root";
	String pwd="MySau@12";
	
	Connection connection = null;
	Statement st =null;
	ResultSet rs = null;
	String sql="Select * from advjava1.candidate";
	
	public List<Candidate> getAllCandidates(){
		System.out.println("we are in dao layer");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1");
			
			connection = DriverManager.getConnection(url, uname, pwd);
			System.out.println("2");
			
			st = connection.createStatement();
			System.out.println("3");
			
			rs = st.executeQuery(sql);
			System.out.println("4");
			
			allcandidate = new ArrayList<Candidate>();
			while(rs.next()){
				int cid = rs.getInt("c_id");
				String cname = rs.getString("name");
				String pname = rs.getString("partyname");
				String stname = rs.getString("state");
				String aname = rs.getString("assembly");
				String gender = rs.getString("gender");
				int age = rs.getInt("age");
				
//				System.out.println(cid+" " +cname+" "+ pname );
				Candidate obj = new Candidate(cid,cname,pname,stname,aname,gender,age);
				allcandidate.add(obj);
			}
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return allcandidate;
	}

}
