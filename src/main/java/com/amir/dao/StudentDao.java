package com.amir.dao;
import java.util.List;

import com.amir.springjdbc.entities.Students;

public interface StudentDao {
	public int insertStudent(Students students);
	public int updateStudent(Students students);
	public int deleteStudent(Students students);
	public Students getStudent(int ID);
	public List<Students> getAllStudent();

}
