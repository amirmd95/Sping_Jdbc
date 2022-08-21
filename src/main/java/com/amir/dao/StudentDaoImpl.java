package com.amir.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.amir.springjdbc.entities.Students;  
@Component("StudentDao")// it will automatically scan our custom bean
public class StudentDaoImpl implements StudentDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insertStudent(Students students) {
		String query="INSERT INTO STUDENTS(ID,NAME,AGE,ADDRESS) VALUES(?,?,?,?)";
		//String query1="INSERT INTO STUDENTS(ID,NAME,AGE,ADDRESS) VALUES(students.getID(),students.getNAME(),students.getAGE(),students.getADDRESS())"; 
		int result=jdbcTemplate.update(query,students.getID(),students.getNAME(),students.getAGE(),students.getADDRESS());
	    return result;
	}

	public int updateStudent(Students students) {
		String query="UPDATE STUDENTS SET ADDRESS='Kolkata' where ID=101";
		int result=jdbcTemplate.update(query);
		return result;
	}

	public int deleteStudent(Students students) {
		String query="DELETE FROM STUDENTS WHERE ID=?";
		int result=jdbcTemplate.update(query,students.getID());
		return result;
	}

	public Students getStudent(int ID) {
		//Select single row 
		String query="SELECT * FROM STUDENTS WHERE ID=? ";
		RowMapper<Students> rowMapper=new RowMappperImp();
		Students students=this.jdbcTemplate.queryForObject(query, rowMapper,ID);
		
		return students;
	}

	public List<Students> getAllStudent() {
		String query="SELECT * FROM STUDENTS";
		RowMapper<Students> rowMapper=new RowMappperImp();
		List<Students> students=this.jdbcTemplate.query(query, rowMapper);
		return students;
	}
	

}
