package com.amir.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.amir.springjdbc.entities.Students;

public class RowMappperImp implements RowMapper<Students> {

	public Students mapRow(ResultSet rs, int rowNum) throws SQLException {
		Students students=new Students();
		students.setID(rs.getInt(1));
		students.setNAME(rs.getString(2));
		students.setAGE(rs.getInt(3));
		students.setADDRESS(rs.getString(4));
		return students;
	}
	

}
