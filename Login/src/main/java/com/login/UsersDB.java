package com.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;


public class UsersDB {
DataSource dataSource;

public UsersDB(DataSource dataSource) {
	this.dataSource = dataSource;
}
 
public void addUser(String name,String password,String email,String mobile) throws Exception {
	Connection con = null;
	PreparedStatement ps = null;
	
	try {
		con = dataSource.getConnection();
		String sql = "insert into users "+"(uname,upassword,uemail,umobile)" +"value(?,?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, password);
		ps.setString(3, email);
		ps.setString(4, mobile);
		ps.execute();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		close(con,ps,null);
	}
}



private void close(Connection con, Statement st, ResultSet rs) {
	try {
		if(rs!=null) {
			rs.close();
		}
		if(st!=null) {
			st.close();
		}
		if(con!=null) {
			con.close();
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
}

public boolean checkStudent(String uemail, String password) {
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	try {
		con = dataSource.getConnection();
		String sql = "select * from users where uemail=?,upassword=?";
		ps = con.prepareStatement(sql);
		ps.setString(1, uemail);
		ps.setString(2, password);
		rs = ps.executeQuery();
		
		if(rs.next()) {
			return true;
		}
	
		return false;
	}
	catch(Exception e) {
		return false;
	}
	finally {
		close(con,ps,rs);
	}
	
}




}

