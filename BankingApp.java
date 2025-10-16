package com.garima.BankingApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Banking {
	
	static void showTransaction() throws Exception {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb","root","root");
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from transactions");
		while(rs.next()) {
			int tranId=rs.getInt("transaction_id");
			int accNo=rs.getInt("acc_no");
			String tranType=rs.getString("trans_type");
			float tranAmount=rs.getFloat("trans_amount");
			String tranDate=rs.getString("trans_date");
			
			System.out.println(tranId+"-"+accNo+"-"+tranType+"-"+tranAmount+"-"+tranDate);
		}
		
		rs.close();
		st.close();
		con.close();
		
		
	}
	
	static void transaction() throws SQLException {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter account no to get transactions for :");
		int num=sc.nextInt();
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb","root","root");
		
		String sql="select * from transactions where acc_no=?";
		
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, num);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			int tranId=rs.getInt("transaction_id");
			int accNo=rs.getInt("acc_no");
			String tranType=rs.getString("trans_type");
			float tranAmount=rs.getFloat("trans_amount");
			String tranDate=rs.getString("trans_date");
			
			System.out.println(tranId+"-"+accNo+"-"+tranType+"-"+tranAmount+"-"+tranDate);
		}
		
		System.out.println("data fetched successfuly!");

		
	}
	
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//showTransaction();
		transaction();
		
		
		
	}

}
