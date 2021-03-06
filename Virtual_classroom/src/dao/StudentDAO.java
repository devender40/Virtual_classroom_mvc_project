package dao;
import java.sql.*;

import model.Student;

public class StudentDAO 
{
	static PreparedStatement ps;
	static Connection cn;
	
	public static Student register(Student student)
	{
		String name=student.getName();
		String u_id=student.getUser_id(); //user_id is the registration number
		String branch=student.getBranch();										//
		String phno=student.getPh_no();
		String eid=student.getE_id();
		String pass=student.getPassword();
		try
		{
			cn=ConnectionManager.getConnection();
			ps=cn.prepareStatement("select * from Student where user_id=? ");
			ps.setString(1,u_id);
			ResultSet rs=ps.executeQuery(); //u_id is the registration no.
			if(rs.next()) //to check duplicate accounts where regis. no. is same
			{
				student.setValid(false);                 // Registration unsuccessfull
			}
			else
			{
				ps=cn.prepareStatement("insert into Student values(?,?,?,?,?,?)");
				ps.setString(1, name);
				ps.setString(2, u_id);
				ps.setString(3, branch);
				ps.setString(4, phno);
				ps.setString(5, eid);
				ps.setString(6, pass);
				int k=ps.executeUpdate();
				System.out.println(k);
				student.setValid(true);          //Registration successful
			}
			//ResultSet rs=ps.executeQuery();
			//if(rs.next())
			//{
			//	student.setValid(true);                  //Registration successful(Check for duplicate accounts later)
			//}
			//else
			//{
		   //      student.setValid(false);				//Registration unsuccessfulS
			//}
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		return student;
	}
	public static Student login(Student student)
	{
		String u_id=student.getUser_id();
		//System.out.println("uid="+u_id);
		String pass=student.getPassword();
		try 
		{
			cn=ConnectionManager.getConnection();
			ps=cn.prepareStatement("select * from Student where user_id=? and password=? ");
			ps.setString(1,u_id);
			ps.setString(2, pass);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				student.setName(rs.getString(1));
				student.setBranch(rs.getString(3));
				student.setPh_no(rs.getString(4));
				student.setE_id(rs.getString(5));
				//System.out.println("Welcome "+student.getUser_id());
				student.setValid(true);
			}
			else
			{
				// System.out.println("Sorry, you are not a registered user! Please sign up first");
		         student.setValid(false);
			}
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		return student;
	}
	

}
