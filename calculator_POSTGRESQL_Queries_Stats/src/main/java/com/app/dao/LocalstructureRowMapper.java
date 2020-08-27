package com.app.dao;



import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.app.Structure.localStructure;

public class LocalstructureRowMapper implements RowMapper<localStructure> {
	@Override
	public localStructure mapRow(ResultSet rs, int arg1) throws SQLException {
		localStructure emp = new localStructure();

		emp.setOption(rs.getInt("option"));
		emp.setOptionSelectedString(rs.getString("optionSelectedString"));
		emp.setResult(rs.getString("result"));
		emp.setSelectedString(rs.getString("selectedString"));
		emp.setUserFirstDateString(rs.getString("userFirstDateString"));
		emp.setUserSecondDateString(rs.getString("userSecondDateString"));





		return emp;
	}
}