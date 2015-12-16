package com.yash.sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.yash.sms.database.ConnectDB;
import com.yash.sms.model.Marks;
import com.yash.sms.model.Student;

public class StudentDAO {

	public List<Student> getAllData(){
		Connection connection=ConnectDB.getConnection();
		PreparedStatement preparedstatement;
		List<Student> list=new ArrayList<Student>();
		System.out.println("inside dao");
		String query="Select * From student s INNER JOIN marks m ON s.student_id=m.studentid";
		//String query="Select * from student";
		try {
			preparedstatement=connection.prepareStatement(query);
			ResultSet result=preparedstatement.executeQuery();
			while(result.next()){
				Student student=new Student();
				Marks marks=new Marks();
				student.setStudentid(result.getInt("student_id"));
				student.setName(result.getString("name"));
				student.setCity(result.getString("city"));
				marks.setMarks_id(result.getInt("marksid"));
				marks.setStandard(result.getInt("standard"));
				marks.setGrade(result.getString("grade"));
				student.setMarks(marks);
				list.add(student);
				/*student.setName(result.getString("name"));
				student.setCity(result.getString("city"));
				list.add(student);*/
				System.out.println(list);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}
	
	public List<Object> sortByCity(){
		return null;
		
	}
	public List<Object> sortByCandidate(){
		return null;
		
	}
	public List<Object> sortByStandard(){
		return null;
		
	}
}

