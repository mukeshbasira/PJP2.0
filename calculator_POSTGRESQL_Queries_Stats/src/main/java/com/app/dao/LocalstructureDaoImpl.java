package com.app.dao;

import java.util.List;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Service;

import com.app.Structure.localStructure;

@Service
public class LocalstructureDaoImpl implements LocalstructureDao {




	public LocalstructureDaoImpl(NamedParameterJdbcTemplate template) {
		this.template = template;
	}

	NamedParameterJdbcTemplate template;

	@Override
	public List<localStructure> listAll() {
		return template.query("select * from localstructure ;", new LocalstructureRowMapper());

	}

	@Override
	public void insert(localStructure localStructure) {
		final String sql = "insert into localstructure(option, selectedString , optionSelectedString,userFirstDateString,result ,userSecondDateString) "
				+ "values(:option,:selectedString,:optionSelectedString,:userFirstDateString,:result,:userSecondDateString)";
		KeyHolder holder = new GeneratedKeyHolder();
		SqlParameterSource param = new MapSqlParameterSource().addValue("option", localStructure.getOption())
				.addValue("selectedString", localStructure.getSelectedString())
				.addValue("optionSelectedString", localStructure.getOptionSelectedString())
				.addValue("userFirstDateString", localStructure.getUserFirstDateString())
				.addValue("userSecondDateString", localStructure.getUserSecondDateString())
				.addValue("result", localStructure.getResult());
		template.update(sql, param, holder);
	}

	@Override
	public List<localStructure> optionCondition(int option) {
		return template.query("select * from localstructure where option=" + option + ";",
				new LocalstructureRowMapper());


	}

	@Override
	public List<localStructure> selectedString(String selected) {
		return template.query(
				"select * from localstructure where selectedstring='" + selected + "';",
				new LocalstructureRowMapper());

	}

}
